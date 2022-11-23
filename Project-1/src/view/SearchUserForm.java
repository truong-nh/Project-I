/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import constand.MySQLConstand;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import model.user.Account;
import model.user.User;

/**
 *
 * @author Administrator
 */
public class SearchUserForm extends javax.swing.JPanel {
    private User user;
    /**
     * Creates new form SearchUserForm
     */
    public SearchUserForm() {
        initComponents();
    }
    
    public SearchUserForm(User user){
        this.user = user;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_user = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tf_serachname = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_searchidcard = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_searchaccount = new javax.swing.JTextField();
        btn_edituser = new javax.swing.JButton();

        tb_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ & Tên", "Năm sinh", "SĐT", "CCCD/CMND", "Mail", "Tài khoản", "Mật khẩu", "Vai trò"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_user);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        btn_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_search.setText("Tìm");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm theo tên");

        jLabel2.setText("Tìm theo CCCD/CMND");

        jLabel3.setText("Tìm theo tài khoản");

        btn_edituser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_edituser.setText("Chỉnh sửa");
        btn_edituser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edituserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btn_edituser, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_searchaccount, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_searchidcard)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_serachname, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_serachname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_searchidcard, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_searchaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_edituser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public String[] searchAccountData(String id, String searchaccount, String tmpData[]){
        String tbData[] = new String[tmpData.length + 4];
        System.arraycopy(tmpData, 0, tbData, 0, tmpData.length);
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = DriverManager
                .getConnection(MySQLConstand.URL, MySQLConstand.USER_NAME, MySQLConstand.PASSWORD);
            Statement st  = conn.createStatement();
            
            String sql = "select * from account where idUser='"+id+"'"+" and username like '%"+searchaccount+"%'";
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                String mail = rs.getString("mail");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                
                tbData[tmpData.length] = mail;
                tbData[tmpData.length+1] = username;
                tbData[tmpData.length+2] = password;
                tbData[tmpData.length+3] = role;
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return tbData;
    }
    public String[] searchAccountData(String id, String tmpData[]){
        String tbData[] = new String[tmpData.length + 4];
        System.arraycopy(tmpData, 0, tbData, 0, tmpData.length);
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = DriverManager
                .getConnection(MySQLConstand.URL, MySQLConstand.USER_NAME, MySQLConstand.PASSWORD);
            Statement st  = conn.createStatement();
            
            String sql = "select * from account where idUser='"+id+"'";
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                String mail = rs.getString("mail");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                
                tbData[tmpData.length] = mail;
                tbData[tmpData.length+1] = username;
                tbData[tmpData.length+2] = password;
                tbData[tmpData.length+3] = role;
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return tbData;
    }
    
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = DriverManager
                .getConnection(MySQLConstand.URL, MySQLConstand.USER_NAME, MySQLConstand.PASSWORD);
            Statement st  = conn.createStatement();
            
            String searchname = tf_serachname.getText().trim();
            String searchidcard = tf_searchidcard.getText().trim();
            String searchaccount = tf_searchaccount.getText().trim();
            
            
            String sql = "select * from user";
            if(searchname.equals("")){
                if(searchidcard.equals("") == false){
                    sql = sql + " where idcard='"+searchidcard+"'";
                }
            }
            else{
                sql = sql + " where name like '%"+searchname+"%'";
                if(searchidcard.equals("") == false){
                    sql = sql + " and idcard like '%"+searchidcard+"%'";
                }
            }
            
            ResultSet rs = st.executeQuery(sql);
            ClearDataTable();
            while(rs.next()){
                String id = String.valueOf(rs.getInt("idUser"));
                String name = rs.getString("name");
                String yearbd = rs.getString("yearbirthday");
                String phone = rs.getString("phonenumber");
                String idcard = rs.getString("idcard");
                
                String tmpData[] = {id,name,yearbd,phone,idcard};
                
                if(searchaccount.equals("") == false){
                    String tbData[] = searchAccountData(id,searchaccount,tmpData);
                    DefaultTableModel tbmodel = (DefaultTableModel)tb_user.getModel();
                    if(tbData[5] != null){
                        tbmodel.addRow(tbData);
                    }
                }
                else{
                    String tbData[] = searchAccountData(id,tmpData);
                    DefaultTableModel tbmodel = (DefaultTableModel)tb_user.getModel();
                    tbmodel.addRow(tbData);
                } 
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_edituserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edituserActionPerformed
        User edituser = new User();
        SelectUser(edituser);
        EditUserForm euf = new EditUserForm(edituser);
        euf.setVisible(true);
    }//GEN-LAST:event_btn_edituserActionPerformed
    
    public void ClearDataTable(){
        DefaultTableModel tbmodel = (DefaultTableModel)tb_user.getModel();
        tbmodel.setRowCount(0);
    }
    
    public User SelectUser(User user){
        Account accountedit = new Account();
        DefaultTableModel model = (DefaultTableModel)tb_user.getModel();
        
        int selectedRowIndex = tb_user.getSelectedRow();
        
        if(selectedRowIndex == -1){
            ErrorNofiDialog rnd = new ErrorNofiDialog("Vui lòng chọn 1 người để chỉnh sửa");
            rnd.setVisible(true);
        }
        else{
            user.setName(model.getValueAt(selectedRowIndex, 1).toString());
            user.setYearBirthday(Integer.parseInt((String) model.getValueAt(selectedRowIndex, 2)));
            user.setPhoneNumber(model.getValueAt(selectedRowIndex, 3).toString());
            user.setIdCard(model.getValueAt(selectedRowIndex, 4).toString());
            accountedit.setMail(model.getValueAt(selectedRowIndex, 5).toString());
            accountedit.setUsername(model.getValueAt(selectedRowIndex, 6).toString());
            accountedit.setPassword(model.getValueAt(selectedRowIndex, 7).toString());
            accountedit.setIdAccount(Integer.parseInt((String) model.getValueAt(selectedRowIndex, 0)));
            accountedit.setRole(model.getValueAt(selectedRowIndex, 8).toString());
        
            user.setAccount(accountedit);
        }
        return user;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edituser;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_user;
    private javax.swing.JTextField tf_searchaccount;
    private javax.swing.JTextField tf_searchidcard;
    private javax.swing.JTextField tf_serachname;
    // End of variables declaration//GEN-END:variables
}
