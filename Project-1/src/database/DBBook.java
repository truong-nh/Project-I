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
import java.util.List;
import model.book.Book;
import model.book.Location;
import model.user.Account;
import model.user.User;

/**
 *
 * @author admin
 */
public class DBBook {
    public static List<Book> getListBooks(){
        List<Book> books = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql ="SELECT b.idBook, b.name, b.code, b.author, b.category, b.year, b.publisher, b.status, l.room, l.shelf, l.row FROM pj1.book as b left join pj1.location as l on b.idBook = l.idBook;";
        
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
                Book book = new Book();               
                book.setId(rs.getInt("idBook"));
                book.setName(rs.getString("name"));
                book.setCode(rs.getString("code"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setYear(rs.getShort("year"));
                book.setCategory(rs.getString("category"));
                book.setStatus(rs.getString("status"));
                
                Location location = new Location();
                location.setRoom(rs.getString("room"));
                location.setRow(rs.getInt("row"));
                location.setShelf(rs.getString("shelf"));
         
                book.setLocation(location);
                
                books.add(book);
            }  
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
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
        return books;
    }
//    public static void addBook(Book book) {
//        Connection connection = JDBCConnection.getJDBCConnection();
//        PreparedStatement pst = null;
//        String sql = "INSERT INTO user (idBook, name, code, author, category, year, publisher, status)"
//                + "VALUE(?,?,?,?,?)";
//
// 
//        try {
//            pst = connection.prepareStatement(sql);
//
//            pst.setInt(1,user.getAccount().getIdAccount() );
//            pst.setString(2,user.getName() );
//            pst.setInt(3,user.getYearBirthday() );
//            pst.setString(4,user.getPhoneNumber() );
//            pst.setString(5,user.getIdCard() );
//            DBUser.addAccount(user.getAccount());
//                    
//            int rs = pst.executeUpdate();
//            System.out.println(rs);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            if (pst != null) {
//                try {
//                    pst.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//    }
}
