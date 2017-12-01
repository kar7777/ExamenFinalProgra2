/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author karla
 */
public class Conection {
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String TYPE = "jdbc:postgresql://";
    private static final String SERVER = "localhost";
    private static final String PORT = "5432";
    private static final String DB = "FinalText";
    private static final String USER = "postgres";
    private static final String PASS = "Ingenieria123";

    public static Connection connection() throws Exception {
        Connection c = null;
        try {
            Class.forName(DRIVER);
            c = DriverManager.getConnection(TYPE + SERVER + ":" + PORT
                    + "/" + DB, USER, PASS);
            System.out.println("Conected");
            return c;
        } catch (Exception e) {
            throw e;
        }
    }
}
