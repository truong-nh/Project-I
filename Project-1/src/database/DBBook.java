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
        
        String sql ="SELECT b.idBook, b.name, b.code, b.author, b.category, b.year, b.publisher, b.status, l.room, l.shelf, l.line FROM pj1.book as b left join pj1.location as l on b.idBook = l.idBook;";
        
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
                location.setRow(rs.getInt("line"));
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
    public static void addBook(Book book) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pstb = null;
        String sql = "INSERT INTO book(idBook, name, code, author, category, year, publisher, status)"
                + "VALUE(?,?,?,?,?,?,?,?)";
        
        try {
            pstb = connection.prepareStatement(sql);

            pstb.setInt(1,book.getId());
            pstb.setString(2,book.getName() );
            pstb.setString(3,book.getCode() );
            pstb.setString(4,book.getAuthor() );
            pstb.setString(5,book.getCategory() );
            pstb.setShort(6,book.getYear() );
            pstb.setString(7,book.getPublisher() );
            pstb.setString(8,book.getStatus() );
                    
            int rs = pstb.executeUpdate();
            System.out.println(rs);

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
        
        
        Location location = new Location();
        location = book.getLocation();
        
        addLocation(book.getId(), location);
    }
    public static void addLocation(int idBook, Location location){
        String sqll = "INSERT INTO location (idBook, room, shelf, line)"
                + "VALUE(?,?,?,?)";
        Connection connectionl = JDBCConnection.getJDBCConnection();
        PreparedStatement pstl = null;
        try {
            pstl = connectionl.prepareStatement(sqll);

            pstl.setInt(1,idBook);
            pstl.setString(2,location.getRoom() );
            pstl.setString(3,location.getShelf() );
            pstl.setInt(4,location.getRow() );

            int rsl = pstl.executeUpdate();
            System.out.println(rsl);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pstl != null) {
                try {
                    pstl.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connectionl != null) {
                try {
                    connectionl.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    public static void updateBook(Book book) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.book set name = ?, code = ?, author =?,category = ?,year = ?, publisher = ?,status = ? WHERE idBook = ?";

 
        try {
            pst = connection.prepareStatement(sql);

            pst.setString(1,book.getName());
            pst.setString(2,book.getCode());
            pst.setString(3,book.getAuthor());
            pst.setString(4,book.getCategory());
            pst.setShort(5,book.getYear());
            pst.setString(6,book.getPublisher());
            pst.setString(7,book.getStatus());
            pst.setInt(8, book.getId());
            int rs = pst.executeUpdate();
            System.out.println(rs);

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
        updateLocation(book.getId(), book.getLocation());
    }
    public static void updateLocation(int idBook, Location location) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.location set room = ?, shelf = ?, line =? WHERE idBook = ?";

 
        try {
            pst = connection.prepareStatement(sql);

            pst.setString(1,location.getRoom());
            pst.setString(2,location.getShelf());
            pst.setInt(3,location.getRow());
            pst.setInt(4,idBook);
            int rs = pst.executeUpdate();
            System.out.println(rs);

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
    }
    
    public static void updateStatusBook(int idBook, String newStatus) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.book set status = ? WHERE idBook = ?";

 
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1,newStatus);  
            pst.setInt(2,idBook);
            int rs = pst.executeUpdate();
            System.out.println(rs);

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
    }
}
