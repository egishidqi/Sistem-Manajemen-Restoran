package view;

import model.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.drinks_model;
import model.employee_model;
import model.mainCourse_model;
import model.employee_model;

public class menu_View extends javax.swing.JFrame {
    employee_model menu = new employee_model(); 
    employee_model emp = new employee_model();
    int jumlah;
    //buat list order
    DefaultListModel temp1 = new DefaultListModel();
    public menu_View() {
        jumlah = 0;
        initComponents();
        menu = new employee_model();
        menu.infoMenu();
        jList1.setModel(menu.list_mc);
        jList2.setModel(menu.list_de);
        jList3.setModel(menu.list_ap);
        jList4.setModel(menu.list_dr);
        jLabel_namaMenu.setText(menu.namaMenu);
    }
    public menu_View(String s) {
        jumlah = 0;
        initComponents();
        menu = new employee_model();
        emp = new employee_model();
        emp.change_menuName(s);
        menu.infoMenu();
        jList1.setModel(menu.list_mc);
        jList2.setModel(menu.list_de);
        jList3.setModel(menu.list_ap);
        jList4.setModel(menu.list_dr);
//        jLabel_namaMenu.setText(menu.namaMenu);
        jLabel_namaMenu.setText(s);
    }
    public menu_View(DefaultListModel temp, int jumlah1){
        jumlah = 0;
        initComponents();
        menu = new employee_model();
        menu.infoMenu();
        jList1.setModel(menu.list_mc);
        jList2.setModel(menu.list_de);
        jList3.setModel(menu.list_ap);
        jList4.setModel(menu.list_dr);
        jLabel_namaMenu.setText(menu.namaMenu);
        this.temp1 = temp;
        this.jumlah = jumlah1;
        jList5.setModel(temp1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton_backFromMenu = new javax.swing.JButton();
        label_menuKami = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton_order = new javax.swing.JButton();
        jLabel_DetailHarga = new javax.swing.JLabel();
        jLabel_descMenu = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jButton_Bayar = new javax.swing.JButton();
        jButton_Hapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_catatanOrder = new javax.swing.JTextField();
        jLabel_descMenu1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_bungkus = new javax.swing.JButton();
        jLabel_namaMenu = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_backFromMenu.setText("go back");
        jButton_backFromMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backFromMenuActionPerformed(evt);
            }
        });

        label_menuKami.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        label_menuKami.setText("Menu ");

        jLabel1.setText("Main Course");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Desert");

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel3.setText("Apetizer");

        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel4.setText("Minuman");

        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList4);

        jButton_order.setText("Order >>");
        jButton_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_orderActionPerformed(evt);
            }
        });

        jLabel_DetailHarga.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel_DetailHarga.setText("Detail Menu :");

        jLabel_descMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList5);

        jButton_Bayar.setText("konfirmasi order");
        jButton_Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BayarActionPerformed(evt);
            }
        });

        jButton_Hapus.setText("Hapus");
        jButton_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HapusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Order Kami : ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Catatan Pemesanan :");

        jLabel_descMenu1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Harga : ");

        jButton_bungkus.setText("custom order >>");
        jButton_bungkus.setEnabled(false);
        jButton_bungkus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bungkusActionPerformed(evt);
            }
        });

        jLabel_namaMenu.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_namaMenu.setText(".....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_backFromMenu)
                                .addGap(129, 129, 129)
                                .addComponent(label_menuKami)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_namaMenu)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_Hapus)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Bayar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel_descMenu1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_DetailHarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton_bungkus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(52, 52, 52))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_descMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_catatanOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_menuKami)
                        .addComponent(jLabel_namaMenu))
                    .addComponent(jButton_backFromMenu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_DetailHarga)
                    .addComponent(jButton_order)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_descMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel_descMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_catatanOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_bungkus)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Hapus)
                            .addComponent(jButton_Bayar))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backFromMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backFromMenuActionPerformed
        this.dispose();
        login_View login = new login_View();
        login.setVisible(true);
    }//GEN-LAST:event_jButton_backFromMenuActionPerformed

    private void jButton_BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BayarActionPerformed
        String catatanOrder = jTextField_catatanOrder.getText();
        kofirmasiOrderPengguna_view conf = new kofirmasiOrderPengguna_view(catatanOrder, this.jumlah, temp1);
        conf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_BayarActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        jList2.clearSelection();
        jList3.clearSelection();
        jList4.clearSelection();
        jButton_bungkus.setEnabled(true);
        String idx = jList1.getSelectedValue();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet posRes = statement.executeQuery("SELECT harga_mainCourse FROM maincourse WHERE nama_mainCourse = '"+ idx +"'");
            if(posRes.next()){
                jLabel_descMenu1.setText("- " + idx);
                jLabel_descMenu.setText(posRes.getString("harga_mainCourse"));
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        jList1.clearSelection();
        jList3.clearSelection();
        jList4.clearSelection();  
        jButton_bungkus.setEnabled(false);
        String idx = jList2.getSelectedValue();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet posRes = statement.executeQuery("SELECT harga_desert FROM desert WHERE nama_desert = '"+ idx +"'");
            if(posRes.next()){
                jLabel_descMenu1.setText("- " + idx);
                jLabel_descMenu.setText(posRes.getString("harga_desert"));
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        jList1.clearSelection();
        jList2.clearSelection();
        jList4.clearSelection();
        jButton_bungkus.setEnabled(false);
        String idx = jList3.getSelectedValue();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet posRes = statement.executeQuery("SELECT harga_apetizer FROM apetizer WHERE nama_apetizer = '"+ idx +"'");
            if(posRes.next()){
                jLabel_descMenu1.setText("- " + idx);
                jLabel_descMenu.setText(posRes.getString("harga_apetizer"));
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        jList1.clearSelection();
        jList2.clearSelection();
        jList3.clearSelection();
        jButton_bungkus.setEnabled(true);
        String idx = jList4.getSelectedValue();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet posRes = statement.executeQuery("SELECT harga_drink FROM drink WHERE nama_drink = '"+ idx +"'");
            if(posRes.next()){
                jLabel_descMenu1.setText("- " + idx);
                jLabel_descMenu.setText(posRes.getString("harga_drink"));
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }//GEN-LAST:event_jList4MouseClicked

    private void jButton_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_orderActionPerformed
        String idx1 = jList1.getSelectedValue();
        String idx2 = jList2.getSelectedValue();
        String idx3 = jList3.getSelectedValue();
        String idx4 = jList4.getSelectedValue();
        
        if (!(jList1.isSelectionEmpty())){
            temp1.addElement(idx1);
            jList5.setModel(temp1);
            this.jumlah = this.jumlah + Integer.valueOf(jLabel_descMenu.getText());
        }else if(!(jList2.isSelectionEmpty())){
            temp1.addElement(idx2);
            jList5.setModel(temp1);
            this.jumlah = this.jumlah + Integer.valueOf(jLabel_descMenu.getText());
        }else if(!(jList3.isSelectionEmpty())){
            temp1.addElement(idx3);
            jList5.setModel(temp1);
            this.jumlah = this.jumlah + Integer.valueOf(jLabel_descMenu.getText());
        }else if(!(jList4.isSelectionEmpty())){
            temp1.addElement(idx4);
            jList5.setModel(temp1);
            this.jumlah = this.jumlah + Integer.valueOf(jLabel_descMenu.getText());
        }
    }//GEN-LAST:event_jButton_orderActionPerformed

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
        //code
    }//GEN-LAST:event_jList5MouseClicked

    private void jButton_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HapusActionPerformed
        DefaultListModel listModel = (DefaultListModel) jList5.getModel();
        listModel.removeAllElements();
        jumlah = 0;
    }//GEN-LAST:event_jButton_HapusActionPerformed

    private void jButton_bungkusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bungkusActionPerformed
        mainCourse_model mc = new mainCourse_model();
        drinks_model dr = new drinks_model();
        if(!(jList1.isSelectionEmpty())){
            String cus = mc.CustomOrder();
            String bu = jList1.getSelectedValue();
            temp1.addElement(bu + " (" + cus + ")");
            jList5.setModel(temp1);
            this.jumlah = this.jumlah + Integer.valueOf(jLabel_descMenu.getText());
        }else if(!(jList4.isSelectionEmpty())){
            String cus = dr.CustomOrder();
            String bu = jList4.getSelectedValue();
            temp1.addElement(bu + " (" + cus + ")");
            jList5.setModel(temp1);
            this.jumlah = this.jumlah + Integer.valueOf(jLabel_descMenu.getText());
        }
    }//GEN-LAST:event_jButton_bungkusActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Bayar;
    private javax.swing.JButton jButton_Hapus;
    private javax.swing.JButton jButton_backFromMenu;
    private javax.swing.JButton jButton_bungkus;
    private javax.swing.JButton jButton_order;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_DetailHarga;
    private javax.swing.JLabel jLabel_descMenu;
    private javax.swing.JLabel jLabel_descMenu1;
    private javax.swing.JLabel jLabel_namaMenu;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_catatanOrder;
    private javax.swing.JLabel label_menuKami;
    // End of variables declaration//GEN-END:variables
}
