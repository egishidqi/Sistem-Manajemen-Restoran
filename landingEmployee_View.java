package view;

import model.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.employee_model;

public class landingEmployee_View extends javax.swing.JFrame {
    employee_model model;
    String tes;
    
    public landingEmployee_View() {
        initComponents();
        model = new employee_model();
    }
    public landingEmployee_View(String nama, String id) {
        initComponents();
        jLabel_nama_lengkap_answer.setText(nama);
        jLabel_id_pegawai_answer.setText(id);
        model = new employee_model();
    }

//    public JButton getjButton_goback() {
//        return jButton_goback;
//    }
//    public JButton getjButton_hapus_menu() {
//        return jButton_hapus_menu;
//    }
//    public JButton getjButton_nambah_menu() {
//        return jButton_nambah_menu;
//    }
//    public JButton getjButtonpergi_keMenu() {
//        return jButtonpergi_keMenu;
//    }
//    public void setjLabel_id_pegawai_answer(String temp) {
//        this.jLabel_id_pegawai_answer.setText(temp); 
//    }
//    public void setjLabel_nama_lengkap_answer(String temp) {
//        this.jLabel_nama_lengkap_answer.setText(temp);
//    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jButton_goback = new javax.swing.JButton();
        jLabel_selamat_datang = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_nama_lengkap = new javax.swing.JLabel();
        jLabel_id_pegawai = new javax.swing.JLabel();
        jLabel_nama_lengkap_answer = new javax.swing.JLabel();
        jLabel_id_pegawai_answer = new javax.swing.JLabel();
        jButton_nambah_menu = new javax.swing.JButton();
        jButton_hapus_menu = new javax.swing.JButton();
        jButtonpergi_keMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_goback.setText("Go back");
        jButton_goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gobackActionPerformed(evt);
            }
        });

        jLabel_selamat_datang.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel_selamat_datang.setText("Selamat Datang");

        jLabel_nama_lengkap.setText("Nama Lengkap :");

        jLabel_id_pegawai.setText("id pegawai :");

        jLabel_nama_lengkap_answer.setText("......");

        jLabel_id_pegawai_answer.setText("......");

        jButton_nambah_menu.setText("Tambah Menu");
        jButton_nambah_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nambah_menuActionPerformed(evt);
            }
        });

        jButton_hapus_menu.setText("Hapus Menu");
        jButton_hapus_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hapus_menuActionPerformed(evt);
            }
        });

        jButtonpergi_keMenu.setText("Pergi ke menu");
        jButtonpergi_keMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpergi_keMenuActionPerformed(evt);
            }
        });

        jButton1.setText("ganti nama menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("manager view");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel_selamat_datang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel_id_pegawai)
                                        .addComponent(jLabel_nama_lengkap))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_nama_lengkap_answer)
                                        .addComponent(jLabel_id_pegawai_answer)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_hapus_menu)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton_nambah_menu)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonpergi_keMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(477, 477, 477)
                                .addComponent(jButton_goback))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_selamat_datang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nama_lengkap)
                    .addComponent(jLabel_nama_lengkap_answer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_id_pegawai)
                    .addComponent(jLabel_id_pegawai_answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_nambah_menu)
                    .addComponent(jButton_hapus_menu)
                    .addComponent(jButtonpergi_keMenu)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_goback)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gobackActionPerformed
        this.dispose();
        loginEmployee_View emp = new loginEmployee_View();
        emp.setVisible(true);
    }//GEN-LAST:event_jButton_gobackActionPerformed

    private void jButton_nambah_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nambah_menuActionPerformed
        nambah_menu_View addMenu = new nambah_menu_View();
        addMenu.setVisible(true);
    }//GEN-LAST:event_jButton_nambah_menuActionPerformed

    private void jButton_hapus_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hapus_menuActionPerformed
        hapusMenu_View hap = new hapusMenu_View();
        hap.setVisible(true);
    }//GEN-LAST:event_jButton_hapus_menuActionPerformed

    private void jButtonpergi_keMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpergi_keMenuActionPerformed
        this.dispose();
        menu_View menu = new menu_View(tes);
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonpergi_keMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String namaMenu = jTextField1.getText();
        model.change_menuName(namaMenu);
        this.tes = namaMenu;
        JOptionPane.showMessageDialog(rootPane, "nama menu berhasil diganti");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        managerLogin_view man = new managerLogin_view();
        man.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(landingEmployee_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landingEmployee_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landingEmployee_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landingEmployee_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landingEmployee_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_goback;
    private javax.swing.JButton jButton_hapus_menu;
    private javax.swing.JButton jButton_nambah_menu;
    private javax.swing.JButton jButtonpergi_keMenu;
    private javax.swing.JLabel jLabel_id_pegawai;
    private javax.swing.JLabel jLabel_id_pegawai_answer;
    private javax.swing.JLabel jLabel_nama_lengkap;
    private javax.swing.JLabel jLabel_nama_lengkap_answer;
    private javax.swing.JLabel jLabel_selamat_datang;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
