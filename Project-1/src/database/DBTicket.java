/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import config.JDBCConnection;
import controller.AccountController;
import controller.BookController;
import controller.TicketController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.ticket.BookRequestTicket;
import model.ticket.BorrowTicket;
import model.ticket.ExtendTicket;
import model.ticket.LendTicket;
import model.ticket.PenaltyTicket;
import model.ticket.Ticket;

/**
 *
 * @author admin
 */
public class DBTicket {
    // list
    public static List<BookRequestTicket> getListBookRequestTicket(){
        List<BookRequestTicket> bookRequestTickets = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql ="SELECT * FROM pj1.bookrequestticket;";
        
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
                BookRequestTicket BookRequestTicket = new BookRequestTicket();               
                BookRequestTicket.setId(rs.getInt("idTicket"));
                BookRequestTicket.setDateCreate(new Date(rs.getLong("dateCreate")));
                BookRequestTicket.setStatus(rs.getString("status"));
                BookRequestTicket.setName(rs.getString("name"));
                BookRequestTicket.setAuthor(rs.getString("author"));
                
                bookRequestTickets.add(BookRequestTicket);
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
        return bookRequestTickets;
    }
    public static List<BorrowTicket> getListBorrowTicket(){
        List<BorrowTicket> BorrowTickets = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql ="SELECT * FROM pj1.borrowticket;";
        
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
                BorrowTicket BorrowTicket = new BorrowTicket();               
                BorrowTicket.setId(rs.getInt("idTicket"));
                BorrowTicket.setBook(BookController.getBookById(rs.getInt("idBook")));
                BorrowTicket.setBorrower(AccountController.getUserById(rs.getInt("idUser")));
                BorrowTicket.setDateCreate(new Date(rs.getLong("dateCreate")));
                BorrowTicket.setBorrowedDate(new Date(rs.getLong("borrowDate")));
                BorrowTicket.setReturnDate(new Date(rs.getLong("returnDate")));
                BorrowTicket.setStatus(rs.getString("status"));
                
                BorrowTickets.add(BorrowTicket);
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
        return BorrowTickets;
    }
    public static List<ExtendTicket> getListExtendTicket(){
        List<ExtendTicket> ExtendTickets = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql ="SELECT * FROM pj1.extendticket;";
        
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
                ExtendTicket ExtendTicket = new ExtendTicket();               
                ExtendTicket.setId(rs.getInt("idTicket"));
                ExtendTicket.setBorrowTicket(TicketController.getBorrowTicketById(rs.getInt("idBorrow")));
                ExtendTicket.setDateCreate(new Date(rs.getLong("dateCreate")));
                ExtendTicket.setNewReturnDate(new Date(rs.getLong("newreturnDate")));
                ExtendTicket.setStatus(rs.getString("status"));
                
                ExtendTickets.add(ExtendTicket);
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
        return ExtendTickets;
    }
    public static List<LendTicket> getListLendTicket(){
        List<LendTicket> LendTickets = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql ="SELECT * FROM pj1.lendticket;";
        
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
                LendTicket LendTicket = new LendTicket();  
                
                LendTicket.setId(rs.getInt("idTicket"));
                LendTicket.setStatus(rs.getString("status"));
                LendTicket.setDateCreate(new Date(rs.getLong("dateCreate")));
                
                LendTicket.setBorrowTicket(TicketController.getBorrowTicketById(rs.getInt("idBorrow")));
                LendTicket.setLendDate(new Date(rs.getLong("lendDate")));
                
                LendTickets.add(LendTicket);
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
        return LendTickets;
    }
    public static List<PenaltyTicket> getListPenaltyTicket(){
        List<PenaltyTicket> PenaltyTickets = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql ="SELECT * FROM pj1.penaltyticket;";
        
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
                PenaltyTicket PenaltyTicket = new PenaltyTicket();  
                
                PenaltyTicket.setId(rs.getInt("idTicket"));
                PenaltyTicket.setStatus(rs.getString("status"));
                PenaltyTicket.setDateCreate(new Date(rs.getLong("dateCreate")));
                
                PenaltyTicket.setBorrowTicket(TicketController.getBorrowTicketById(rs.getInt("idBorrow")));
                PenaltyTicket.setPenalty(rs.getLong("penalty"));
                
                PenaltyTickets.add(PenaltyTicket);
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
        return PenaltyTickets;
    }
    
    //add
    public static void addBookRequestTicket(BookRequestTicket bookRequestTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pstb = null;
        String sql = "INSERT INTO pj1.bookrequestticket(idTicket, dateCreate, status, name, author)"
                + "VALUE(?,?,?,?,?)";
        
        try {
            pstb = connection.prepareStatement(sql);

            pstb.setInt(1,bookRequestTicket.getId());
            pstb.setLong(2,bookRequestTicket.getDateCreate().getTime());
            pstb.setString(3,bookRequestTicket.getStatus() );
            pstb.setString(4,bookRequestTicket.getName() );
            pstb.setString(5,bookRequestTicket.getAuthor() );
                    
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
    }
    public static void addBorrowTicket(BorrowTicket BorrowTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pstb = null;
        String sql = "INSERT INTO pj1.borrowticket(idBook, idUser, dateCreate, status, borrowDate, returnDate, idTicket)"
                + "VALUE(?,?,?,?,?,?,?)";
        
        try {
            pstb = connection.prepareStatement(sql);

            pstb.setInt(1,BorrowTicket.getBook().getId());
            pstb.setInt(2,BorrowTicket.getBorrower().getAccount().getIdAccount());
            pstb.setLong(3,BorrowTicket.getDateCreate().getTime());
            pstb.setString(4,BorrowTicket.getStatus());
            pstb.setLong(5,BorrowTicket.getBorrowedDate().getTime());
            pstb.setLong(6,BorrowTicket.getReturnDate().getTime());          
            pstb.setInt(7,BorrowTicket.getId());
                    
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
    }
    public static void addExtendTicket(ExtendTicket ExtendTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pstb = null;
        String sql = "INSERT INTO pj1.extendticket(idBorrow, idTicket, dateCreate, status, newreturndate)"
                + "VALUE(?,?,?,?,?)";
        
        try {
            pstb = connection.prepareStatement(sql);

            pstb.setInt(1,ExtendTicket.getBorrowTicket().getId());
            pstb.setInt(2,ExtendTicket.getId());
            pstb.setLong(3,ExtendTicket.getDateCreate().getTime());
            pstb.setString(4,ExtendTicket.getStatus());
            pstb.setLong(5,ExtendTicket.getNewReturnDate().getTime());
                    
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
    }
    public static void addLendTicket(LendTicket LendTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pstb = null;
        String sql = "INSERT INTO pj1.lendticket(idBorrow, idTicket, dateCreate, status, lendDate)"
                + "VALUE(?,?,?,?,?)";
        
        try {
            pstb = connection.prepareStatement(sql);

            pstb.setInt(1,LendTicket.getBorrowTicket().getId());
            pstb.setInt(2,LendTicket.getId());
            pstb.setLong(3,LendTicket.getDateCreate().getTime());
            pstb.setString(4,LendTicket.getStatus() );
            pstb.setLong(5,LendTicket.getLendDate().getTime());
                    
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
    }
    public static void addPenaltyTicket(PenaltyTicket PenaltyTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pstb = null;
        String sql = "INSERT INTO pj1.penaltyticket(idBorrow, idTicket, dateCreate, status, penalty)"
                + "VALUE(?,?,?,?,?)";
        
        try {
            pstb = connection.prepareStatement(sql);

            pstb.setInt(1,PenaltyTicket.getBorrowTicket().getId());
            pstb.setInt(2,PenaltyTicket.getId());
            pstb.setLong(3,PenaltyTicket.getDateCreate().getTime());
            pstb.setString(4,PenaltyTicket.getStatus() );
            pstb.setLong(5,PenaltyTicket.getPenalty() );
                    
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
    }
    
    //update

    
    
    public static void updateBookRequestTicket(BookRequestTicket BookRequestTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.bookrequestticket set dateCreate = ?, name = ?, status = ?, author = ? WHERE idTicket = ?";

 
        try {
            pst = connection.prepareStatement(sql);

            pst.setLong(1,BookRequestTicket.getDateCreate().getTime());
            pst.setString(2,BookRequestTicket.getName());
            pst.setString(3,BookRequestTicket.getStatus());
            pst.setString(4,BookRequestTicket.getAuthor());            
            pst.setInt(5,BookRequestTicket.getId());
            
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
    public static void updateBorrowTicket(BorrowTicket BorrowTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.borrowticket set idBook = ?, idUser = ?, dateCreate = ?, status = ?, borrowDate = ?, returnDate = ? WHERE idTicket = ?";

 
        try {
            pst = connection.prepareStatement(sql);
            
            pst.setInt(1,BorrowTicket.getBook().getId());
            pst.setInt(2,BorrowTicket.getBorrower().getAccount().getIdAccount());
            pst.setLong(3,BorrowTicket.getDateCreate().getTime());
            pst.setString(4,BorrowTicket.getStatus());
            pst.setLong(5,BorrowTicket.getBorrowedDate().getTime());       
            pst.setLong(6,BorrowTicket.getReturnDate().getTime());    
            pst.setInt(7,BorrowTicket.getId());
            
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
    public static void updateExtendTicket(ExtendTicket ExtendTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.extendticket set idBorrow = ?, dateCreate = ?, status = ?, newreturnDate = ? WHERE idTicket = ?";

 
        try {
            pst = connection.prepareStatement(sql);
            
            pst.setInt(1,ExtendTicket.getBorrowTicket().getId());
            pst.setLong(2,ExtendTicket.getDateCreate().getTime());
            pst.setString(3,ExtendTicket.getStatus());      
            pst.setLong(4,ExtendTicket.getNewReturnDate().getTime());    
            pst.setInt(5,ExtendTicket.getId());
            
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
    public static void updateLendTicket(LendTicket LendTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.lendticket set idBorrow = ?, dateCreate = ?, status = ?, lendDate = ? WHERE idTicket = ?";

 
        try {
            pst = connection.prepareStatement(sql);
            
            pst.setInt(1,LendTicket.getBorrowTicket().getId());
            pst.setLong(2,LendTicket.getDateCreate().getTime());
            pst.setString(3,LendTicket.getStatus());      
            pst.setLong(4,LendTicket.getLendDate().getTime());    
            pst.setInt(5,LendTicket.getId());
            
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
    public static void updatePenaltyTicket(PenaltyTicket PenaltyTicket) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE pj1.penaltyticket set idBorrow = ?, dateCreate = ?, status = ?, penalty = ? WHERE idTicket = ?";

 
        try {
            pst = connection.prepareStatement(sql);
            
            pst.setInt(1,PenaltyTicket.getBorrowTicket().getId());
            pst.setLong(2,PenaltyTicket.getDateCreate().getTime());
            pst.setString(3,PenaltyTicket.getStatus());
            pst.setLong(4,PenaltyTicket.getPenalty());          
            pst.setInt(5,PenaltyTicket.getId());
            
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
