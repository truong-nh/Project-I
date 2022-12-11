/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import config.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.finance.Finance;

/**
 *
 * @author Admin
 */
public class DBFinance {
      public static List<Finance> getFinanceReport(long fromTime, long toTime){
       Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM finance\n"
            + "WHERE date < ? \n"
            + "AND date > ?\n";
        List<Finance> reportList = new ArrayList<>();
        try {
            pst = connection.prepareStatement(sql);
            pst.setLong(1, toTime);
            pst.setLong(2, fromTime);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                Finance finance= new Finance();
                finance.setId(rs.getInt("id") ) ;
                finance.setValue(rs.getLong("value"));
                finance.setDate( new Date(rs.getLong("date")));
                finance.setDescription(rs.getString("Description"));
                finance.setType(rs.getString("type")) ;
                
                reportList.add(finance);
            }
            return reportList;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
      }
      
      public static int getCurrentIdFinance(){
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        int id = 0;
        String sql = "SELECT * FROM finance WHERE  id = (SELECT MAX(id)  FROM finance)";
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {

                
                id = rs.getInt("id");
            }
            return id;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return 0;
      }
      
      public static boolean  addFinance(Finance finance){
       Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pstb = null;
        String sql = "INSERT INTO finance(id, value, date, type, description)"
                + "VALUE(?,?,?,?,?)";
        
        try {
            pstb = connection.prepareStatement(sql);

            pstb.setInt(1,finance.getId());
            pstb.setLong(2, finance.getValue());
            pstb.setLong(3, finance.getDate().getTime());
            pstb.setString(4, finance.getType());
            pstb.setString(5, finance.getDescription());    
            int rs = pstb.executeUpdate();
            System.out.println(rs);
            return  true;
        
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pstb != null) {
                try {
                    pstb.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return false;
      }
      
      
}
