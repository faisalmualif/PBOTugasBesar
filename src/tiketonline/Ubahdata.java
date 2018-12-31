
package tiketonline;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import static tiketonline.Isidata.getKoneksi;


public class Ubahdata extends javax.swing.JFrame {
public String Id,Username, Nama, Alamat, Jenis_kelamin;
   
    public Ubahdata() {
        initComponents();
        setLocationRelativeTo(this);
        loadData();
        setResizable(false);
    }

    public void loadData(){
        String h = Login.password.getText();
        try{
            Connection conn = getKoneksi();
            Statement s = conn.createStatement();
 
                String sql = "SELECT id_customer,username, nama,jenis_kelamin,alamat FROM customer WHERE password = '"+h+"'";
                ResultSet r = s.executeQuery(sql);
                
                while(r.next()){
                    String id = r.getString("id_customer");
                    String user = r.getString("username");
                    String nama = r.getString("nama");                   
                    String jeniskelamin = r.getString("jenis_kelamin");
                    String alamat = r.getString("alamat");
                    
                    idcust1.setText(id);
                    usernama.setText(user);
                    namaku1.setText(nama);
                    laki1.setSelected(false);
                    perempuan1.setSelected(false);
                    alamatku1.setText(alamat);
            }
            
        
    }   catch (SQLException ex) {
            System.out.println("Data Kosong");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradasi1 = new tiketonline.gradasi();
        jLabel2 = new javax.swing.JLabel();
        namaku = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatku = new javax.swing.JTextPane();
        perempuan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        laki = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idcust = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        gradasi2 = new tiketonline.gradasi();
        jLabel1 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        namaku1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatku1 = new javax.swing.JTextPane();
        perempuan1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        laki1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idcust1 = new javax.swing.JTextField();
        ubah = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        usernama = new javax.swing.JTextField();

        javax.swing.GroupLayout gradasi1Layout = new javax.swing.GroupLayout(gradasi1);
        gradasi1.setLayout(gradasi1Layout);
        gradasi1Layout.setHorizontalGroup(
            gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        gradasi1Layout.setVerticalGroup(
            gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_003-id-card_39254234.png"))); // NOI18N

        namaku.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        namaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namakuActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(alamatku);

        perempuan.setText("Perempuan");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");

        laki.setText("Laki-laki");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("ID Customer");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Nama Lengkap");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Kelamin");

        idcust.setEditable(false);
        idcust.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        simpan.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROFIL ANDA");

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Mp3_player_music_playing_put_back_recordings_song_sound_3858549.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_003-id-card_39254234.png"))); // NOI18N

        namaku1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        namaku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaku1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(alamatku1);

        perempuan1.setText("Perempuan");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Alamat");

        laki1.setText("Laki-laki");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("ID Customer");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("Nama Lengkap");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("Jenis Kelamin");

        idcust1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        ubah.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setText("Username");

        usernama.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        javax.swing.GroupLayout gradasi2Layout = new javax.swing.GroupLayout(gradasi2);
        gradasi2.setLayout(gradasi2Layout);
        gradasi2Layout.setHorizontalGroup(
            gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradasi2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(gradasi2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(idcust1)))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernama))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaku1))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradasi2Layout.createSequentialGroup()
                                .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradasi2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(laki1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(perempuan1)))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gradasi2Layout.setVerticalGroup(
            gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradasi2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idcust1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laki1)
                    .addComponent(perempuan1))
                .addGap(18, 18, 18)
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(gradasi2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        MenuUtama x = new MenuUtama();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

    private void namakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namakuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namakuActionPerformed

    private void namaku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaku1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaku1ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
                              
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        Id = idcust1.getText();
        Username = usernama.getText();
        Nama = namaku1.getText();
        Jenis_kelamin = null;
        Alamat = alamatku1.getText();
        
        
        if (laki1.isSelected()){
            Jenis_kelamin="Laki-laki";
        }else if (perempuan1.isSelected()){
            Jenis_kelamin="Perempuan";
        }
        
        try{
            Connection conn = getKoneksi();
            Statement s = conn.createStatement();
            String sql = "UPDATE customer SET username=?, nama=?, jenis_kelamin=? ,alamat=?  WHERE id_customer ='"+Id+"'";  
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, Username);
            p.setString(2, Nama);
            p.setString(3, Jenis_kelamin);
            p.setString(4, Alamat);
            javax.swing.JOptionPane.showMessageDialog(null, "Selamat, Data Berhasil Diupdate");
                   
            p.executeUpdate();
            p.close(); 
            
        
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
                           
        
    
    }//GEN-LAST:event_ubahActionPerformed

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
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ubahdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane alamatku;
    private javax.swing.JTextPane alamatku1;
    private tiketonline.gradasi gradasi1;
    private tiketonline.gradasi gradasi2;
    private javax.swing.JTextField idcust;
    private javax.swing.JTextField idcust1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembali;
    private javax.swing.JRadioButton laki;
    private javax.swing.JRadioButton laki1;
    private javax.swing.JTextField namaku;
    private javax.swing.JTextField namaku1;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JRadioButton perempuan1;
    private javax.swing.JButton simpan;
    private javax.swing.JButton ubah;
    private javax.swing.JTextField usernama;
    // End of variables declaration//GEN-END:variables
}
