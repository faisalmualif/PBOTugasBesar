
package tiketonline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static tiketonline.Isidata.getKoneksi;


public class Pemesanan extends javax.swing.JFrame {
    public String Id, Nama,Tiketku,Kdtransportasi, Harga, Tujuan, Jumlah, Total;
    public Connection con;
    public Statement stat;
    public ResultSet rs;
    public String sql;
    public boolean setVisible;
    
    public Pemesanan() {
        initComponents();
        Koneksi DB = new Koneksi();   
        DB.config();
        con = DB.con;
        stat = DB.stm;
        idtransaksi();
        setLocationRelativeTo(this);
        setResizable(false);
    }
    
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost/tiketonline";
                String username = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url,username,password);
                  
            }catch (SQLException e){
             System.out.println("Gagal Membuat Koneksi");
            }          
        }
        return koneksi;
    }   
    
    private void idtransaksi()
    {
       try {
            sql="select * from transaksi order by id_transaksi desc";
            stat=con.createStatement();
            rs=stat.executeQuery(sql);
            if (rs.next()) {
                String nopes = rs.getString("id_transaksi").substring(1);
                String AN = "" + (Integer.parseInt(nopes) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}

               id_pes.setText("P" + Nol + AN);
            } else {
               id_pes.setText("P0001");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradasi1 = new tiketonline.gradasi();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        gradasi2 = new tiketonline.gradasi();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id_pes = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        Tiket = new javax.swing.JComboBox<>();
        tujuan = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        pesan = new javax.swing.JButton();
        harga = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        proses = new javax.swing.JButton();
        kode = new javax.swing.JTextField();

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

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Form Pembelian");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_shop-03_730813.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("NAMA PEMESAN");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("ID PEMESANAN");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("PILIH TIKET");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("TUJUAN");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("JUMLAH TIKET");

        id_pes.setEditable(false);
        id_pes.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        nama.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        Tiket.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Tiket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "PESAWAT", "KAPAL", "KERETA API", "BUS" }));
        Tiket.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TiketItemStateChanged(evt);
            }
        });
        Tiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiketActionPerformed(evt);
            }
        });

        tujuan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jumlah.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("TOTAL");

        total.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        pesan.setText("PESAN");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        harga.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("HARGA TIKET");

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_Mp3_player_music_playing_put_back_recordings_song_sound_3858549.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        proses.setText("PROSES");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        kode.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradasi2Layout = new javax.swing.GroupLayout(gradasi2);
        gradasi2.setLayout(gradasi2Layout);
        gradasi2Layout.setHorizontalGroup(
            gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradasi2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id_pes, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradasi2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradasi2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proses, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradasi2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradasi2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(gradasi2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        gradasi2Layout.setVerticalGroup(
            gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradasi2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(gradasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gradasi2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proses, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(gradasi2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        Id = id_pes.getText();
        Kdtransportasi = kode.getText();
        Nama = nama.getText();
        Tiketku = null;
        Tujuan = tujuan.getText();
        Jumlah = jumlah.getText();
        Harga = harga.getText();
        Total = total.getText();
        
        
        String idcus = MenuUtama.idcustomer.getText();    
                try {
                Connection conn = getKoneksi();
                Statement s4 = conn.createStatement();
                String sql = "INSERT INTO transaksi (id_transaksi, id_customer) VALUES (?,?)";  
                PreparedStatement p2 = con.prepareStatement(sql);
                p2.setString(1, Id);
                p2.setString(2, idcus);
                p2.executeUpdate();
                } catch (Exception e) {
                System.out.println("gagal");
                }
                try{
                Connection conn3 = getKoneksi();
                 Statement s = conn3.createStatement();
                String sql3 = "INSERT INTO detail_transaksi (id_transaksi, "
                               + "id_transportasi, nama_pemesan, tujuan, jumlah_tiket, harga_tiket, total_harga) "
                               + "VALUES (?,?,?,?,?,?,?)";               
                
                PreparedStatement p3 = conn3.prepareStatement(sql3);
                p3.setString(1, Id);
                p3.setString(2, Kdtransportasi);             
                p3.setString(3, Nama);           
                p3.setString(4, Tujuan);
                p3.setString(5, Jumlah);
                p3.setString(6, Harga);
                p3.setString(7, Total);
                javax.swing.JOptionPane.showMessageDialog(null, "Terima Kasih Sudah mambeli tiket :)");                   
                p3.executeUpdate();
                p3.close(); 

            } catch (SQLException e) {
                System.out.println("Terjadi Error");
            }
            
            
        
        
        
    
    }//GEN-LAST:event_pesanActionPerformed

    private void TiketItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TiketItemStateChanged
        String Tujuan = tujuan.getText();
        String Harga = harga.getText();
        String Kode = kode.getText();
        
        
        switch (Tiket.getSelectedItem().toString()) {
            case "PESAWAT":
                {
                    Connection conn = getKoneksi();
                    try {
                        Connection con = getKoneksi();
                        Statement s = con.createStatement();
                        
                        String sql = "SELECT tujuan, harga, id_transportasi FROM transportasi WHERE id_transportasi ='T0001'";
                        ResultSet r= s.executeQuery(sql);
                        while(r.next()){
                            String tujuannya = r.getString("tujuan");
                            String harganya = r.getString("harga");
                            String kodenya = r.getString("id_transportasi");
                            tujuan.setText(tujuannya);
                            harga.setText(harganya);
                            kode.setText(kodenya);
                            r.close();
                            s.close();
                            
                        }
                        
                    } catch (SQLException ex) {
                        
                    }       break;
                }
            case "KAPAL":
                {
                    Connection conn = getKoneksi();
                    try {
                        Connection con = getKoneksi();
                        Statement s = con.createStatement();
                        
                        String sql = "SELECT tujuan, harga, id_transportasi FROM transportasi WHERE id_transportasi ='T0002'";
                        ResultSet r= s.executeQuery(sql);
                        while(r.next()){
                            String tujuannya = r.getString("tujuan");
                            String harganya = r.getString("harga");
                            String kodenya = r.getString("id_transportasi");
                            tujuan.setText(tujuannya);
                            harga.setText(harganya);
                            kode.setText(kodenya);
                            r.close();
                            s.close();
                            
                        }
                        
                    } catch (SQLException ex) {
                        
                    }       break;
                }
            case "KERETA API":
                {
                    Connection conn = getKoneksi();
                    try {
                        Connection con = getKoneksi();
                        Statement s = con.createStatement();
                        
                        String sql = "SELECT tujuan, harga, id_transportasi FROM transportasi WHERE id_transportasi ='T0003'";
                        ResultSet r= s.executeQuery(sql);
                        while(r.next()){
                            String tujuannya = r.getString("tujuan");
                            String harganya = r.getString("harga");
                            String kodenya = r.getString("id_transportasi");
                            tujuan.setText(tujuannya);
                            harga.setText(harganya);
                            kode.setText(kodenya);
                            r.close();
                            s.close();
                            
                        }
                        
                    } catch (SQLException ex) {
                        
                    }       break;
                }
            case "BUS":
                {
                    Connection conn = getKoneksi();
                    try {
                        Connection con = getKoneksi();
                        Statement s = con.createStatement();
                        
                        String sql = "SELECT tujuan, harga, id_transportasi FROM transportasi WHERE id_transportasi ='T0004'";
                        ResultSet r= s.executeQuery(sql);
                        while(r.next()){
                            String tujuannya = r.getString("tujuan");
                            String harganya = r.getString("harga");
                            String kodenya = r.getString("id_transportasi");
                            tujuan.setText(tujuannya);
                            harga.setText(harganya);
                            kode.setText(kodenya);
                            r.close();
                            s.close();
                            
                        }
                        
                    } catch (SQLException ex) {
                        
                    }       break;
                }
            default:
                break;    
        }
       
            
    }//GEN-LAST:event_TiketItemStateChanged

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        int Harga = Integer.parseInt(harga.getText());
        int Jumlah = Integer.parseInt(jumlah.getText());
        int Total = Harga * Jumlah;
        total.setText(String.valueOf(Total));
    }//GEN-LAST:event_prosesActionPerformed

    private void TiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiketActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_TiketActionPerformed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        MenuUtama x = new MenuUtama();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Tiket;
    private tiketonline.gradasi gradasi1;
    private tiketonline.gradasi gradasi2;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id_pes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jumlah;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JButton pesan;
    private javax.swing.JButton proses;
    private javax.swing.JTextField total;
    private javax.swing.JTextField tujuan;
    // End of variables declaration//GEN-END:variables
}
