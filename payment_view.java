package view;

import model.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.ArrayList;

import java.util.*;
import model.order_model;

public class payment_view extends javax.swing.JFrame {
    
    String[] arr;
    DefaultListModel temp;
    int jumlah;
    order_model model;
    String nama;
    String catatan;
    String alamat;
    
    public payment_view() {
        initComponents();
        model = new order_model();
    }
    
    public payment_view(String catatan1, String nama1, String nomor, String alamat1, int jumlah1, DefaultListModel temp1) {
        initComponents();
        model = new order_model();
        // 
        this.catatan = catatan1;
        this.alamat = alamat1;
        // set Text label nama pemesan
        this.nama = nama1;//ini
        jLabel_nama_answer.setText(nama);
        // set Text label nomor telepon
        jLabel_nomor_answer.setText(nomor);
        // set text label order number
        Random rand = new Random();
        String order_temp = "order_" + rand.nextInt(10);
        jLabel_NomorOrder_answer.setText(order_temp);
        // set text harga pesanan
        this.jumlah = jumlah1;
        jLabel_HargaPesanan_answer.setText(String.valueOf(jumlah));
        // set text pajak
        double pajak = (0.1 * jumlah);
        jLabel_Pajak_answer.setText(String.valueOf(pajak));
        // set text total biaya
        double total = pajak + jumlah;
        jLabel_Total_answer.setText(String.valueOf(total));
        //jList
        temp = temp1;
        jList1.setModel(temp1);
        // list to array
        arr = new String[jList1.getModel().getSize()];
        for (int i = 0; i < jList1.getModel().getSize(); i++) {
            arr[i] = jList1.getModel().getElementAt(i);
        }
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel_orderConfirmation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel_HargaPesanan = new javax.swing.JLabel();
        jLabel_HargaPesanan_answer = new javax.swing.JLabel();
        jLabel_Pajak = new javax.swing.JLabel();
        jLabel_Pajak_answer = new javax.swing.JLabel();
        jLabel_Total = new javax.swing.JLabel();
        jLabel_Total_answer = new javax.swing.JLabel();
        jLabel_NomorOrder = new javax.swing.JLabel();
        jLabel_nama = new javax.swing.JLabel();
        jLabel_NomorOrder_answer = new javax.swing.JLabel();
        jLabel_nama_answer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Bayar = new javax.swing.JButton();
        jButton_kembaliOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_receipt = new javax.swing.JTextArea();
        jLabel_receipt = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel_nomor = new javax.swing.JLabel();
        jLabel_nomor_answer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_orderConfirmation.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel_orderConfirmation.setText("Konfirmasi Order :");

        jScrollPane1.setViewportView(jList1);

        jLabel_HargaPesanan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_HargaPesanan.setText("Harga Pesanan  :");

        jLabel_HargaPesanan_answer.setText(".............");

        jLabel_Pajak.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_Pajak.setText("Pajak               :");

        jLabel_Pajak_answer.setText(".............");

        jLabel_Total.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_Total.setText("Total                :");

        jLabel_Total_answer.setText(".............");

        jLabel_NomorOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_NomorOrder.setText("Nomor Order    :");

        jLabel_nama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_nama.setText("Atas Nama        :");

        jLabel_NomorOrder_answer.setText(".............");

        jLabel_nama_answer.setText(".............");

        jButton_Bayar.setText("Bayar");
        jButton_Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BayarActionPerformed(evt);
            }
        });

        jButton_kembaliOrder.setText("Kembali ke Order");
        jButton_kembaliOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_kembaliOrderActionPerformed(evt);
            }
        });

        jTextArea_receipt.setColumns(20);
        jTextArea_receipt.setRows(5);
        jScrollPane2.setViewportView(jTextArea_receipt);

        jLabel_receipt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel_receipt.setText("Print Receipt");

        jButton1.setText("Keluar Aplikasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_nomor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_nomor.setText("Nomor Telepon :");

        jLabel_nomor_answer.setText(".............");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_orderConfirmation)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton_kembaliOrder)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton_Bayar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator1)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel_NomorOrder)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(jLabel_NomorOrder_answer)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_nama)
                                                        .addComponent(jLabel_nomor))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_nomor_answer)
                                                        .addComponent(jLabel_nama_answer)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_Pajak)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_HargaPesanan)
                                                        .addComponent(jLabel_Total))
                                                    .addGap(33, 33, 33)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_Pajak_answer)
                                                        .addComponent(jLabel_Total_answer)
                                                        .addComponent(jLabel_HargaPesanan_answer)))))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel_receipt)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_orderConfirmation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_NomorOrder)
                            .addComponent(jLabel_NomorOrder_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nama)
                            .addComponent(jLabel_nama_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nomor)
                            .addComponent(jLabel_nomor_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_HargaPesanan)
                            .addComponent(jLabel_HargaPesanan_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Pajak)
                            .addComponent(jLabel_Pajak_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Total)
                            .addComponent(jLabel_Total_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_kembaliOrder)
                    .addComponent(jButton_Bayar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_receipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_kembaliOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_kembaliOrderActionPerformed
        this.dispose();
        menu_View menu = new menu_View(temp, jumlah);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton_kembaliOrderActionPerformed

    private void jButton_BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BayarActionPerformed
        // bismillah 
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        jTextArea_receipt.append("*********************************************************************\n" +
                "YOUR ORDER NUMBER IS : " + jLabel_NomorOrder_answer.getText() +
                "\nDELIVERY TO : " +  this.alamat +
                "\n=================================================\n" +
                "Restaurant Abracadabra, jalan Telekomunikasi No. 5, \n Terusan Buahbatu" +
                "\n*********************************************************************\n" +
                "RECEIPT CODE : " + model.generateReceiptOrder() + 
                "\n=================================================\n" +
                dtf.format(now) +
                "\n*********************************************************************\n"   +
                "Pesanan : \n" +
                model.countFrequencies(arr) + "\n\n" +
                "Dengan Catatan : \n" +
                this.catatan +
                "\n\nHarga Pesanan     : \t" + jLabel_HargaPesanan_answer.getText() +
                "\nBiaya Pajak (10%) : \t" + jLabel_Pajak_answer.getText() +
                "\nTotal biaya               : \t" + jLabel_Total_answer.getText() + 
                "\n=================================================\n" +
                "TERIMA KASIH KAK "+ this.nama +" \n SAMPAI JUMPA LAGI DILAIN WAKTU"
        );
    }//GEN-LAST:event_jButton_BayarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(payment_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Bayar;
    private javax.swing.JButton jButton_kembaliOrder;
    private javax.swing.JLabel jLabel_HargaPesanan;
    private javax.swing.JLabel jLabel_HargaPesanan_answer;
    private javax.swing.JLabel jLabel_NomorOrder;
    private javax.swing.JLabel jLabel_NomorOrder_answer;
    private javax.swing.JLabel jLabel_Pajak;
    private javax.swing.JLabel jLabel_Pajak_answer;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JLabel jLabel_Total_answer;
    private javax.swing.JLabel jLabel_nama;
    private javax.swing.JLabel jLabel_nama_answer;
    private javax.swing.JLabel jLabel_nomor;
    private javax.swing.JLabel jLabel_nomor_answer;
    private javax.swing.JLabel jLabel_orderConfirmation;
    private javax.swing.JLabel jLabel_receipt;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea_receipt;
    // End of variables declaration//GEN-END:variables

}
