package database;

import model.Cirkel;
import model.Figuur;

import java.sql.SQLException;

/**
 * @author Vincent Velthuizen
 * Purpose for the class
 **/
public class CirkelDAO extends AbstractDAO {
    public CirkelDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    private int slaFiguurOp(Figuur figuur) {
        String sql = "INSERT INTO figuur (kleur) VALUES (?);";
        int primaryKey = 0;

        try {
            setupPreparedStatementWithKey(sql);
            preparedStatement.setString(1, figuur.getKleur());
            primaryKey = executeInsertStatementWithKey();
        } catch (SQLException sqlException) {
            System.err.println(DBaccess.SQL_EXCEPTION + sqlException.getMessage());
        }

        return primaryKey;
    }

    public void slaCirkelOp(Cirkel cirkel) {
        int primaryKey = slaFiguurOp(cirkel);

        String sql = "INSERT INTO cirkel VALUES (?, ?, ?, ?);";

        try {
            setupPreparedStatement(sql);
            preparedStatement.setInt(1, primaryKey);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            System.err.println(DBaccess.SQL_EXCEPTION + sqlException.getMessage());
        }
    }
}
