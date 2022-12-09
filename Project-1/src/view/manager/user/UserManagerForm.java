/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.manager.user;

import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.user.Account;
import model.user.User;
import view.other.NofiDialog;

/**
 *
 * @author Administrator
 */
public class UserManagerForm extends javax.swing.JPanel {
    private User user;
    /**
     * Creates new form UserManagerForm
     */
    public UserManagerForm() {
        initComponents();
    }
    
    public UserManagerForm(User user){
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

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_searchname = new javax.swing.JTextField();
        tf_searchidcard = new javax.swing.JTextField();
        tf_searchaccount = new javax.swing.JTextField();
        btn_search = new view.other.MyButton();
        btn_edituser = new view.other.MyButton();
        btn_createuser = new view.other.MyButton();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_user = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(965, 743));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Tìm theo tên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Tìm theo CCCD/CMND");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Tìm theo tài khoản");

        tf_searchname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tf_searchidcard.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tf_searchaccount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btn_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_search.setText("Tìm kiếm");
        btn_search.setColorClick(new java.awt.Color(153, 153, 153));
        btn_search.setColorOver(new java.awt.Color(255, 255, 255));
        btn_search.setDefaultCapable(false);
        btn_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_searchMouseEntered(evt);
            }
        });
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_edituser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_edituser.setText("Chỉnh sửa");
        btn_edituser.setColorClick(new java.awt.Color(153, 153, 153));
        btn_edituser.setColorOver(new java.awt.Color(255, 255, 255));
        btn_edituser.setDefaultCapable(false);
        btn_edituser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_edituser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_edituserMouseEntered(evt);
            }
        });
        btn_edituser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edituserActionPerformed(evt);
            }
        });

        btn_createuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_createuser.setText("Tạo mới");
        btn_createuser.setColorClick(new java.awt.Color(153, 153, 153));
        btn_createuser.setColorOver(new java.awt.Color(255, 255, 255));
        btn_createuser.setDefaultCapable(false);
        btn_createuser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_createuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_createuserMouseEntered(evt);
            }
        });
        btn_createuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createuserActionPerformed(evt);
            }
        });

        jButton1.setText("Đổi mật khẩu");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tf_searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_searchidcard, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn_edituser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btn_createuser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_searchaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_searchaccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(tf_searchname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_searchidcard, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edituser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_createuser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        tb_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ & Tên", "Năm sinh", "SĐT", "CCCD/CMND", "Mail", "Tài khoản", "Vai trò"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_user.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_user);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseEntered
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_searchMouseEntered

    private void btn_edituserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edituserMouseEntered
        btn_edituser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_edituserMouseEntered

    private void btn_createuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createuserMouseEntered
        btn_createuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_createuserMouseEntered

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st  = conn.createStatement();
            
            String searchname = tf_searchname.getText().trim();
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
                
                String tbData[] = addAccountData(id,searchaccount,tmpData);
                DefaultTableModel tbmodel = (DefaultTableModel)tb_user.getModel();
                if(tbData[5] != null){
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
        edituser = SelectUser(edituser);
        if(edituser != null){
            EditUserFrame euf = new EditUserFrame(edituser);
            euf.setVisible(true);
        }
    }//GEN-LAST:event_btn_edituserActionPerformed

    private void btn_createuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createuserActionPerformed
        CreateUserFrame cuf = new CreateUserFrame();
        cuf.setVisible(true);
    }//GEN-LAST:event_btn_createuserActionPerformed
    
    public void ClearDataTable(){
        DefaultTableModel tbmodel = (DefaultTableModel)tb_user.getModel();
        tbmodel.setRowCount(0);
    }
    
    public String[] addAccountData(String id, String searchaccount, String tmpData[]){
        String tbData[] = new String[tmpData.length + 3];
        System.arraycopy(tmpData, 0, tbData, 0, tmpData.length);
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st  = conn.createStatement();
            
            String sql;
            if(searchaccount.equals("")){
                sql = "select * from account where idUser='"+id+"'";
            }
            else sql = "select * from account where idUser='"+id+"'"+" and username like '%"+searchaccount+"%'";
            
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                String mail = rs.getString("mail");
                String username = rs.getString("username");
                String role = rs.getString("role");
                
                tbData[tmpData.length] = mail;
                tbData[tmpData.length+1] = username;
                tbData[tmpData.length+2] = role;
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return tbData;
    }
    
    public User SelectUser(User user){
        DefaultTableModel model = (DefaultTableModel)tb_user.getModel();
        int selectedRowIndex = tb_user.getSelectedRow();
        
        if(selectedRowIndex == -1){
            NofiDialog nd = new NofiDialog("Vui lòng chọn người để chỉnh sửa");
            nd.setVisible(true);
            return null;
        }
        else{
            String id = model.getValueAt(selectedRowIndex, 0).toString();
            user = searchUserByID(id);
            Account account = searchAccountByID(id);
            user.setAccount(account);
        }
        return user;
    }
    
    public User searchUserByID(String ID){
        User user = new User();
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st  = conn.createStatement();
            
            String sql = "select * from user where idUser='"+ID+"'";
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString("name");
                String yearbd = rs.getString("yearbirthday");
                String phone = rs.getString("phonenumber");
                String idcard = rs.getString("idcard");
                
                user.setName(name);
                user.setYearBirthday(Integer.parseInt(yearbd));
                user.setPhoneNumber(phone);
                user.setIdCard(idcard);
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return user;
    }
    
    public Account searchAccountByID(String ID){
        Account account = new Account();
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st  = conn.createStatement();
            
            String sql = "select * from account where idUser='"+ID+"'";
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("idUser");
                String mail = rs.getString("mail");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                account.setIdAccount(id);
                account.setMail(mail);
                account.setUsername(username);
                account.setPassword(password);
                account.setRole(role);
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return account;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.other.MyButton btn_createuser;
    private view.other.MyButton btn_edituser;
    private view.other.MyButton btn_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_user;
    private javax.swing.JTextField tf_searchaccount;
    private javax.swing.JTextField tf_searchidcard;
    private javax.swing.JTextField tf_searchname;
    // End of variables declaration//GEN-END:variables
}
