/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.manager.book;

import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.book.Book;
import model.book.Location;
import view.other.NofiDialog;

/**
 *
 * @author Administrator
 */
public class BookManagerForm extends javax.swing.JPanel {

    private int count;
    
    public void setCountToZ(){
        this.count = 0;
    }
    
    public int getCount(){
        return count;
    }
    /**
     * Creates new form BookManagerForm
     */
    public BookManagerForm() {
        initComponents();
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
        tf_searchauthor = new javax.swing.JTextField();
        tf_searchcategory = new javax.swing.JTextField();
        btn_search = new view.other.MyButton();
        btn_editbook = new view.other.MyButton();
        btn_createbook = new view.other.MyButton();
        btn_addbook = new view.other.MyButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_book = new javax.swing.JTable();
        lb_checknumber = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(965, 743));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Tìm theo tên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Tìm theo tác giả");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Tìm theo thể loại");

        tf_searchname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tf_searchauthor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tf_searchcategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btn_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_search.setText("Tìm kiếm");
        btn_search.setDefaultCapable(false);
        btn_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_editbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_editbook.setText("Chỉnh sửa");
        btn_editbook.setDefaultCapable(false);
        btn_editbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_editbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editbookActionPerformed(evt);
            }
        });

        btn_createbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_createbook.setText("Tạo mới");
        btn_createbook.setDefaultCapable(false);
        btn_createbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_createbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createbookActionPerformed(evt);
            }
        });

        btn_addbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_addbook.setText("Thêm sách");
        btn_addbook.setDefaultCapable(false);
        btn_addbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addbookActionPerformed(evt);
            }
        });

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
                    .addComponent(tf_searchauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn_editbook, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btn_createbook, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_searchcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btn_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(tf_searchcategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(tf_searchname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_searchauthor, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editbook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_createbook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        tb_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID sách", "Tên", "Code", "Tác giả", "Thể loại", "Năm xuất bản", "Nhà xuất bản", "Trạng thái", "Vị trí"
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
        tb_book.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_book);

        lb_checknumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lb_checknumber, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_checknumber, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String searchname = tf_searchname.getText().trim();
            String searchauthor = tf_searchauthor.getText().trim();
            String searchcategory = tf_searchcategory.getText().trim();

            String sql = "select * from book";
            if (searchname.equals("")) {
                if (searchauthor.equals("")) {
                    if (searchcategory.equals("") == false) {
                        sql = sql + " where category like '%" + searchcategory + "%'";
                    }
                } else {
                    sql = sql + " where author like '%" + searchauthor + "%'";
                    if (searchcategory.equals("") == false) {
                        sql = sql + " and category like '%" + searchcategory + "%'";
                    }
                }
            } else {
                sql = sql + " where name like '%" + searchname + "%'";
                if (searchauthor.equals("")) {
                    if (searchcategory.equals("") == false) {
                        sql = sql + " and category like '%" + searchcategory + "%'";
                    }
                } else {
                    sql = sql + " and author like '%" + searchauthor + "%'";
                    if (searchcategory.equals("") == false) {
                        sql = sql + " and category like '%" + searchcategory + "%'";
                    }
                }
            }

            ResultSet rs = st.executeQuery(sql);
            ClearDataTable();
            setCountToZ();
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("idBook"));
                String name = rs.getString("name");
                String code = rs.getString("code");
                String author = rs.getString("author");
                String category = rs.getString("category");
                String year = rs.getString("year");
                String publisher = rs.getString("publisher");
                String status = rs.getString("status");

                String tmpData[] = {id, name, code, author, category, year, publisher, status};

                String tbData[] = addLocationData(id, tmpData);
                DefaultTableModel tbmodel = (DefaultTableModel) tb_book.getModel();
                if (tbData[8] != null) {
                    tbmodel.addRow(tbData);
                    count++;
                }
            }
            conn.close();
            lb_checknumber.setText("Tìm được " + count + " sách!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_editbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editbookActionPerformed
        Book editbook = new Book();
        editbook = SelectUser(editbook);
        if (editbook != null) {
            EditBookFrame ebf = new EditBookFrame(editbook);
            ebf.setVisible(true);
        }
    }//GEN-LAST:event_btn_editbookActionPerformed

    private void btn_createbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createbookActionPerformed
        CreateBookFrame cbf = new CreateBookFrame();
        cbf.setVisible(true);
    }//GEN-LAST:event_btn_createbookActionPerformed

    private void btn_addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addbookActionPerformed
        // TODO add your handling code here:
        Book addBook = new Book();
        addBook = SelectUser(addBook);
        if (addBook != null) {
            AddBookFrame abf  = new AddBookFrame(addBook);
            abf.setVisible(true);
        }
    }//GEN-LAST:event_btn_addbookActionPerformed
    
    public void ClearDataTable() {
        DefaultTableModel tbmodel = (DefaultTableModel) tb_book.getModel();
        tbmodel.setRowCount(0);
    }

    public String[] addLocationData(String id, String tmpData[]) {
        String tbData[] = new String[tmpData.length + 1];
        System.arraycopy(tmpData, 0, tbData, 0, tmpData.length);
        Location location = searchLocationByID(id);
        String lc = location.getLocation();
        tbData[tmpData.length] = lc;
        return tbData;
    }

    public Book SelectUser(Book book) {
        DefaultTableModel model = (DefaultTableModel) tb_book.getModel();
        int selectedRowIndex = tb_book.getSelectedRow();

        if (selectedRowIndex == -1) {
            NofiDialog nd = new NofiDialog("Vui lòng chọn sách để chỉnh sửa");
            nd.setVisible(true);
            return null;
        } else {
            String id = model.getValueAt(selectedRowIndex, 0).toString();
            book = searchBookByID(id);
            Location location = searchLocationByID(id);
            book.setLocation(location);
        }
        return book;
    }

    public Book searchBookByID(String ID) {
        Book book = new Book();
        try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from book where idBook='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String code = rs.getString("code");
                String author = rs.getString("author");
                String category = rs.getString("category");
                Short year = rs.getShort("year");
                String publisher = rs.getString("publisher");
                String status = rs.getString("status");
                
                book.setId(Integer.valueOf(ID));
                book.setName(name);
                book.setCode(code);
                book.setAuthor(author);
                book.setCategory(category);
                book.setYear(year);
                book.setPublisher(publisher);
                book.setStatus(status);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return book;
    }

    public Location searchLocationByID(String ID) {
        Location location = new Location();
        try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from location where idBook='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String room = rs.getString("room");
                String shelf = rs.getString("shelf");
                int row = rs.getInt("line");

                location.setRoom(room);
                location.setShelf(shelf);
                location.setRow(row);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return location;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.other.MyButton btn_addbook;
    private view.other.MyButton btn_createbook;
    private view.other.MyButton btn_editbook;
    private view.other.MyButton btn_search;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_checknumber;
    private javax.swing.JTable tb_book;
    private javax.swing.JTextField tf_searchauthor;
    private javax.swing.JTextField tf_searchcategory;
    private javax.swing.JTextField tf_searchname;
    // End of variables declaration//GEN-END:variables
}
