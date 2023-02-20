/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Avian Tech Zone
 */
public class JdbcTest {

//    public static void main(String[] args) {
//        RunCode();
//    }

    private static void RunCode() {
        String query = "select * from records";

        //Jdbc jdbc = new Jdbc();
        Connection con = new Jdbc().getConnection();
        try {
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);
            //int i =pst.executeUpdate(query);
                //if(i=1){ 
                //System.out.println("Data Saved!");  //u d c
            //}  
            while (rs.next()) {
                String id = rs.getString("id");
                String fname = rs.getString("fname");
                String nic = rs.getString("nic");
                String mobile = rs.getString("mobile");
                System.out.println(id + "," + fname + "," + nic + "," + mobile);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}
