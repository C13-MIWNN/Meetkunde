package database;

import model.Punt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Purpose for the class
 **/
public class PuntDAO extends AbstractDAO {
    public PuntDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public ArrayList<Punt> geefAllePunten() {
        ArrayList<Punt> punten = new ArrayList<>();

        String sql = "SELECT xcoordinaat, ycoordinaat FROM punt;";

        try {
            setupPreparedStatement(sql);

            ResultSet resultSet = executeSelectStatement();

            while (resultSet.next()) {
                double xCoordinaat = resultSet.getDouble("xcoordinaat");
                double yCoordinaat = resultSet.getDouble("ycoordinaat");

                punten.add(new Punt(xCoordinaat, yCoordinaat));

            }

        } catch (SQLException sqlException) {
            System.err.println(DBaccess.SQL_EXCEPTION + sqlException.getMessage());
        }

        return punten;
    }

    public void slaPuntOp(Punt punt) {
        String sql = "INSERT INTO punt VALUES (?, ?);";

        try {
            setupPreparedStatement(sql);

            preparedStatement.setDouble(1, punt.getxCoordinaat());
            preparedStatement.setDouble(2, punt.getyCoordinaat());

            executeManipulateStatement();
        } catch (SQLException sqlException) {
            System.err.println(DBaccess.SQL_EXCEPTION + sqlException.getMessage());
        }
    }
}
