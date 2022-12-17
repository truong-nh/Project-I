/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import config.JDBCConnection;
import controller.Decode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.user.Account;
import model.user.User;
/**
 *
 * @author Admin
 */
public class DBUser {
        public static Account getAccount(int idUser){
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
      
        String sql = "SELECT * FROM account WHERE idUser = ?";
        
        try {
            pst = connection.prepareStatement(sql);
            pst.setInt(1, idUser);
            ResultSet rs = pst.executeQuery();

            while(rs.next()){

             Account account = new Account();
             account.setIdAccount(idUser);
             account.setMail(rs.getString("mail"));
             account.setUsername(rs.getString("username"));
             account.setPassword(rs.getString("password"));
             account.setRole(rs.getString("role"));

            
            return account;
        }
            
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

        public static void addAccount(Account account) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO account (idUser, mail, username, password, role) "
                + "VALUE(?,?,?,?,?)";

 
        try {
            pst = connection.prepareStatement(sql);

            pst.setInt(1, account.getIdAccount());
            pst.setString(2,account.getMail() );
            pst.setString(3,account.getUsername() );
            pst.setString(4,Decode.decodePassword(account.getPassword())  );
            pst.setString(5,account.getRole() );


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
        
        // khong co update mat khau
        public static void updateAccount(int idAccountUpdate,Account account) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
                String sql = "UPDATE account set mail = ?, username = ? , role =? WHERE idUser = ? ";

 
        try {
            pst = connection.prepareStatement(sql);

            pst.setString(1, account.getMail());
            pst.setString(2,account.getUsername());
         //   pst.setString(3,account.getPassword());
            pst.setString(3,account.getRole());
            
            pst.setInt(4, idAccountUpdate);
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
    
        public static List<User> getListUsers(){
        List<User> users = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst= null;
        
        String sql =" SELECT * FROM user";
        
        try {
            pst= connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next()){
            Account account= DBUser.getAccount(rs.getInt("IDUser"));
            User user= new User();
            user.setAccount(account);
            user.setName(rs.getString("name"));
            user.setYearBirthday(rs.getInt("yearbirthday"));
            user.setPhoneNumber(rs.getString("phonenumber"));
            user.setIdCard("idcard");
            users.add(user);

        }
            
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
        
        
        return users;
    }
        
        public static void addUser(User user) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO user (idUser, name, yearbirthday, phonenumber, idcard) "
                + "VALUE(?,?,?,?,?)";

 
        try {
            pst = connection.prepareStatement(sql);

            pst.setInt(1,user.getAccount().getIdAccount() );
            pst.setString(2,user.getName() );
            pst.setInt(3,user.getYearBirthday() );
            pst.setString(4,user.getPhoneNumber() );
            pst.setString(5,user.getIdCard() );
            DBUser.addAccount(user.getAccount());
                    
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
        
        public static void updateUser(int idUserUpdate,User user) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
                String sql = "UPDATE user set name = ?, yearbirthday = ? ,phonenumber =?, idcard =? WHERE idUser = ? ";

 
        try {
            pst = connection.prepareStatement(sql);

            pst.setString(1,user.getName() );
            pst.setInt(2,user.getYearBirthday() );
            pst.setString(3,user.getPhoneNumber() );
            pst.setString(4,user.getIdCard() );
            
            pst.setInt(5, idUserUpdate);
            DBUser.updateAccount(idUserUpdate, user.getAccount());
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

         public static void updatePassWord(int idAccountUpdate,String newPassWord) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
                String sql = "UPDATE account set password = ? WHERE idUser = ? ";

 
        try {
            pst = connection.prepareStatement(sql);
            String decodePassWord = Decode.decodePassword(newPassWord);
            pst.setString(1, decodePassWord);      
            pst.setInt(2, idAccountUpdate);
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
