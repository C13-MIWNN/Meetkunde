package controller;

import database.CirkelDAO;
import database.DBaccess;
import database.PuntDAO;
import model.Cirkel;
import model.Punt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args){
        DBaccess dBaccess = new DBaccess("figuren",
                "userFiguren", "userFigurenPW");
        PuntDAO puntDAO = new PuntDAO(dBaccess);
        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);

        dBaccess.openConnection();

        cirkelDAO.slaCirkelOp(new Cirkel(6.5, new Punt(-2.3,-1.3),"beige"));

        dBaccess.closeConnection();
    }
}
