package otel_otomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;



public class oda extends javax.swing.JFrame {// oda classımızı JFrame ye extend ettik

    Connection conn;
    Statement komut;  //kısaltmalar kullandık
    ResultSet rs;
    
    public oda() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_musteriler = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(216, 227, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oda Çıkış", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 51, 153));
        jButton1.setText("ODA 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 153));
        jButton2.setText("ODA 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 153));
        jButton3.setText("ODA 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 153));
        jButton4.setText("ODA 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 153));
        jButton5.setText("ODA 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 51, 153));
        jButton6.setText("ODA 6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 51, 153));
        jButton7.setText("ODA 7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 153));
        jButton8.setText("ODA 8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 51, 153));
        jButton9.setText("ODA 9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 51, 153));
        jButton10.setText("ODA 10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("ÇIKIŞ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("ODA KAYDA DÖN");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setText("Otel odalarımız bu şekildedir. Otelimiz 3 yıldızlıdır.");

        jLabel2.setText("Otelimiz 3 yıldızlı olup daha iyi hizmet vermeye kendimizi geliştirmeye açık bir oteliz.");

        jLabel3.setText(" Otel sahibi Muhammed Sağlamdır. Otelimizin adresi Pamukkale Üniversitesi karşısındadır.");

        table_musteriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TC No", "Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konaklama Süresi", "Oda Numarası", "Yaş", "Ücret", "Oda Tipi"
            }
        ));
        jScrollPane2.setViewportView(table_musteriler);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(31, 31, 31)))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
                                            //tablomuzu bastırıyoruz
            Class.forName("com.mysql.jdbc.Driver");//sql bağlantısını yapıyoruz

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=1");
            rs.last();
           //müşteri listesi tablosundan oda numarası 1 olanları çekiyoruz çünkü bu oda 1 i listelettik aynısı aşağıdakiler içinde geçerli
           
            int kayitsayisi = rs.getRow();//kayıtları satırlara eşitlettik ordan verileri çekmemize yarıycak
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    //veritabanımızdaki verileri alıyoruz
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++; //ii yiarttırarak verilerin sonuna kadar eşitleyip yazdırıyoruz
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));// 
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString()); //hata kodlarımızı yazdırıyoruz

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
        
            
              
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
             
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
           butonlar ac = new butonlar();
        ac.setVisible(true);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=10");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=8");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=3");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=2");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=4");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=5");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=6");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=7");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
try {
            String baslik[] = new String[]{ "TC","Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konuklama Süresi","Oda Numarası","yas","ucret","kisi","Oda Tipi"};  
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/turizm", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from musteri_listesi where oda_numarasi=9");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"),
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("yas"),
                    rs.getString("ucret"),
                    rs.getString("kisi"),
                    rs.getString("oda_tipi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           javax.swing.JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table_musteriler;
    // End of variables declaration//GEN-END:variables
}
