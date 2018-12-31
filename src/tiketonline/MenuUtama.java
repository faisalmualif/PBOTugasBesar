
package tiketonline; //pembungkus class menjadi satu kelompok/pengorganisasian yang bernama Program

import java.sql.Connection; //untuk mempresentasikan suatu koneksi dengan suatu data sorce, juga digunakan untuk membuat
//object Statement,PrearedStatement dan CallableStatement.
import java.sql.ResultSet; // untuk memprsentasikan sebuah hasil dari database yang dihasilkan dari statement SQL SELECT
import java.sql.Statement; // untuk mempresentasikan suatu perintah SQL dan untuk menerima object ResultSet
import javax.swing.JPanel; //guna mengkontruksi obyek panel secara berbeda
import static tiketonline.Pemesanan.getKoneksi;

public class MenuUtama extends javax.swing.JFrame { //merupakan konsep inheriatance dimana class MenuUtama(subclass) 
//yang mempunyai (superclass) bernama class javax.swing.JFrame
    public String akunsaya; //akses dasar terhadap variabel
    
    public MenuUtama() { //konstruktor
        
        //memanggil fungsi konek
        initComponents();
        idcust();
        setLocationRelativeTo(this);
        setResizable(false);
    }
    
    public void idcust(){
        String id = Login.password.getText();
                
        try {
            //menyimpan serta menampilkan inputan user
            Connection conn2 = getKoneksi();
            Statement s2 = conn2.createStatement();
            String sql2 = "SELECT id_customer from customer WHERE password = '"+id+"'";            
            ResultSet r = s2.executeQuery(sql2);
            
            while(r.next()){
                //
                String idcus = r.getString("id_customer");
                idcustomer.setText(idcus);
            }
        }
            catch(Exception e){
                
            }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gradasi1 = new tiketonline.gradasi();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pemesanan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lihat = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        akun = new javax.swing.JComboBox<>();
        idcustomer = new javax.swing.JTextField();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_sale_lineal_color_cnvrt-12_3827709.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pemesanan ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELAMAT DATANG DI TRAVEL BERSAMA");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Asset_86_3298602.png"))); // NOI18N

        pemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pemesananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pemesananMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pemesananMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_sale_lineal_color_cnvrt-12_3827709.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pemesanan ");

        javax.swing.GroupLayout pemesananLayout = new javax.swing.GroupLayout(pemesanan);
        pemesanan.setLayout(pemesananLayout);
        pemesananLayout.setHorizontalGroup(
            pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pemesananLayout.createSequentialGroup()
                .addGroup(pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pemesananLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3))
                    .addGroup(pemesananLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pemesananLayout.setVerticalGroup(
            pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pemesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        lihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lihatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lihatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lihatMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_shop-03_730813.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lihat Tiket");

        javax.swing.GroupLayout lihatLayout = new javax.swing.GroupLayout(lihat);
        lihat.setLayout(lihatLayout);
        lihatLayout.setHorizontalGroup(
            lihatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatLayout.createSequentialGroup()
                .addGroup(lihatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lihatLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7))
                    .addGroup(lihatLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        lihatLayout.setVerticalGroup(
            lihatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        akun.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        akun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Akun Saya", "Lihat Data", "Ubah Data", "Log Out" }));
        akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akunActionPerformed(evt);
            }
        });

        idcustomer.setEditable(false);
        idcustomer.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        javax.swing.GroupLayout gradasi1Layout = new javax.swing.GroupLayout(gradasi1);
        gradasi1.setLayout(gradasi1Layout);
        gradasi1Layout.setHorizontalGroup(
            gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradasi1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(pemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(lihat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradasi1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradasi1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradasi1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(akun, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gradasi1Layout.setVerticalGroup(
            gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradasi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lihat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(gradasi1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lihatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatMousePressed
        //event untuk melihat hasil inputan
        Tabeltiket x = new Tabeltiket();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lihatMousePressed

    private void lihatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatMouseEntered
        
    }//GEN-LAST:event_lihatMouseEntered

    private void lihatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatMouseExited

    private void pemesananMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesananMouseExited

    }//GEN-LAST:event_pemesananMouseExited

    private void pemesananMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesananMouseEntered

    }//GEN-LAST:event_pemesananMouseEntered

    private void pemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesananMouseClicked
        Pemesanan x = new Pemesanan();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pemesananMouseClicked

    private void akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akunActionPerformed
        akunsaya = (String) akun.getSelectedItem();
        if (akunsaya == "Lihat Data"){
            Lihatdata x = new Lihatdata();
            x.setVisible(true);
            this.setVisible(false);
        }else if (akunsaya == "Ubah Data"){
            Ubahdata x = new Ubahdata();
            x.setVisible(true);
            this.setVisible(false);
        }else if (akunsaya == "Log Out"){
            Login x = new Login();
            x.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_akunActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> akun;
    private tiketonline.gradasi gradasi1;
    public static javax.swing.JTextField idcustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lihat;
    private javax.swing.JPanel pemesanan;
    // End of variables declaration//GEN-END:variables
}
