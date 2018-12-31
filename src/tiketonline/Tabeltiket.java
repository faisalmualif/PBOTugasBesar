
package tiketonline;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import static tiketonline.Pemesanan.getKoneksi;




public class Tabeltiket extends javax.swing.JFrame {
    
    
    public Tabeltiket() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        showdata();
    }

    public void showdata(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Id Transaksi");
        tabel.addColumn("Jadwal");
        tabel.addColumn("Nama");
        tabel.addColumn("Jenis");
        tabel.addColumn("Tujuan");
        tabel.addColumn("Jumlah");
        
        String id = MenuUtama.idcustomer.getText();
        try {
            Connection conn = getKoneksi();
            Statement s2 = conn.createStatement();
            String sql2 = "SELECT id_transaksi from transaksi WHERE id_customer = '"+id+"'";            
            ResultSet r = s2.executeQuery(sql2);
            
            while(r.next()){
                String idtrans = r.getString("id_transaksi");
        try{
            Connection connect = getKoneksi();
            String sql = "SELECT detail_transaksi.id_transaksi, transportasi.jadwal, detail_transaksi.nama_pemesan, \n" +
                            "transportasi.nama_transportasi, detail_transaksi.tujuan, detail_transaksi.jumlah_tiket\n" +
                            "FROM customer\n" +
                            "INNER JOIN transaksi\n" +
                            "ON customer.id_customer = transaksi.id_customer\n" +
                            "INNER JOIN detail_transaksi\n" +
                            "ON transaksi.id_transaksi = detail_transaksi.id_transaksi\n" +
                            "INNER JOIN transportasi\n" +
                            "ON detail_transaksi.id_transportasi = transportasi.id_transportasi\n" +
                            "WHERE detail_transaksi.id_transaksi = '"+idtrans+"'";
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                tabel.addRow(new Object[]{                    
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getString(5),
                    result.getString(6),
                });
            }
            tabeltiket.setModel(tabel);
        }catch(Exception e){
            System.out.println("gagal");
        }
            }
    }catch (SQLException e){
            
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        idcusto = new javax.swing.JTextField();
        jadwalku = new javax.swing.JTextField();
        namapemesan = new javax.swing.JTextField();
        trans = new javax.swing.JTextField();
        tujuanku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jumlahnya = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gradasi1 = new tiketonline.gradasi();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltiket = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, 
                int collIndex){
                return false;
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idtrans = new javax.swing.JTextField();
        jadwal = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        tiket = new javax.swing.JTextField();
        tujuan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        kembali = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("JADWAL BERANGKAT");

        idcusto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jadwalku.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        namapemesan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        trans.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        tujuanku.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("ID CUSTOMER");

        jumlahnya.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("NAMA PEMESAN");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("JENIS TIKET");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("TUJUAN");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("JUMLAH");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_receipt_3339034.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabeltiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Transaksi", "Jadwal", "Nama", "Jenis", "Tujuan", "Jumlah"
            }
        ));
        tabeltiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltiketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltiket);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIKET ANDA");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("JADWAL BERANGKAT");

        idtrans.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jadwal.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        nama.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        tiket.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        tujuan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("ID TRANSAKSI");

        jumlah.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("NAMA PEMESAN");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("JENIS TIKET");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setText("TUJUAN");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setText("JUMLAH");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_receipt_3339034.png"))); // NOI18N

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Mp3_player_music_playing_put_back_recordings_song_sound_3858549.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradasi1Layout = new javax.swing.GroupLayout(gradasi1);
        gradasi1.setLayout(gradasi1Layout);
        gradasi1Layout.setHorizontalGroup(
            gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradasi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gradasi1Layout.createSequentialGroup()
                        .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idtrans, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(gradasi1Layout.createSequentialGroup()
                        .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradasi1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(254, 254, 254))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradasi1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)))))
                .addContainerGap())
        );
        gradasi1Layout.setVerticalGroup(
            gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradasi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradasi1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addComponent(kembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hapus)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(gradasi1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabeltiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltiketMouseClicked
        try{
        idtrans.setText(tabeltiket.getValueAt(tabeltiket.getSelectedRow(), 0).toString());
        jadwal.setText(tabeltiket.getValueAt(tabeltiket.getSelectedRow(), 1).toString());
        nama.setText(tabeltiket.getValueAt(tabeltiket.getSelectedRow(), 2).toString());
        tiket.setText(tabeltiket.getValueAt(tabeltiket.getSelectedRow(), 3).toString());
        tujuan.setText(tabeltiket.getValueAt(tabeltiket.getSelectedRow(), 4).toString());
        jumlah.setText(tabeltiket.getValueAt(tabeltiket.getSelectedRow(), 5).toString());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tabeltiketMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String id = Tabeltiket.idtrans.getText();
        try {
            Connection conn = getKoneksi();
            Statement s2 = conn.createStatement();
            String sql2 = "SELECT id_detail_transaksi from detail_transaksi WHERE id_transaksi = '"+id+"'";            
            ResultSet r = s2.executeQuery(sql2);
            
            
            while(r.next()){
                String iddet = r.getString("id_detail_transaksi");
        try { 
            Connection conn2 = getKoneksi();            
            String sql3 = "DELETE FROM detail_transaksi WHERE id_detail_transaksi = '"+iddet+"'";
            PreparedStatement p = conn.prepareStatement(sql3);
            p.executeUpdate();
            p.close();
        try { 
            Connection conn3 = getKoneksi();            
            String sql4 = "DELETE FROM transaksi WHERE id_transaksi = '"+id+"'";
            PreparedStatement p2 = conn.prepareStatement(sql4);
            javax.swing.JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            p2.executeUpdate();
            p2.close();
        
        
        }catch (Exception e){       
            System.out.println("gagal");
        }
            }
            catch (Exception e){       
            System.out.println("gagal");
        }
        }
            
        }catch (SQLException e){
            System.out.println("gagal");
            }
    }//GEN-LAST:event_hapusActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        MenuUtama x = new MenuUtama();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

    
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
            java.util.logging.Logger.getLogger(Tabeltiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabeltiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabeltiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabeltiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabeltiket().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tiketonline.gradasi gradasi1;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idcusto;
    public static javax.swing.JTextField idtrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jadwal;
    private javax.swing.JTextField jadwalku;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField jumlahnya;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField namapemesan;
    private javax.swing.JTable tabeltiket;
    private javax.swing.JTextField tiket;
    private javax.swing.JTextField trans;
    private javax.swing.JTextField tujuan;
    private javax.swing.JTextField tujuanku;
    // End of variables declaration//GEN-END:variables
}
