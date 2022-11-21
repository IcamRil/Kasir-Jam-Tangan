/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wisyam.xr7;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MOKLET
 */
public class history extends javax.swing.JFrame {

    public history() {
        initComponents();
        table();
    }
   public void table(){
        DefaultTableModel tb1 = new DefaultTableModel();
        tb1.addColumn("Nama Pembeli");
        tb1.addColumn("Nama Barang");
        tb1.addColumn("Hargaa Barang");
        tb1.addColumn("Jumlah Barang");
        tb1.addColumn("Total Harga");
        tb1.addColumn("Jumlah Uang");
        tb1.addColumn("Kembalian");
        
        
        try{
            Statement st = (Statement) Class.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM history");
            
            while(rs.next()){
                tb1.addRow(new Object[] {
                    rs.getString("username"),
                    rs.getString("namab"),
                    rs.getString("hargab"),
                    rs.getString("jumlahb"),
                    rs.getString("totalh"),
                    rs.getString("jumuang"),
                    rs.getString("kembalian"),
                });
                tabel_history.setModel(tb1);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal!" + e.getMessage());
        }
    }   
    void setColor(JPanel panel){
        panel.setBackground(new Color(85,64,118));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_coomingsoon = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_admin = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_history = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_history = new javax.swing.JTable();
        name_b = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 33, 89));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(64, 43, 100));
        btn_home.setForeground(new java.awt.Color(0, 0, 0));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wisyam/xr7/image/icons8-home-page-25.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HOME");

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        sidepane.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 360, 60));

        btn_coomingsoon.setBackground(new java.awt.Color(64, 43, 100));
        btn_coomingsoon.setForeground(new java.awt.Color(0, 0, 0));
        btn_coomingsoon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_coomingsoonMousePressed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wisyam/xr7/image/icons8-plus-25.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kasir Jam");

        javax.swing.GroupLayout btn_coomingsoonLayout = new javax.swing.GroupLayout(btn_coomingsoon);
        btn_coomingsoon.setLayout(btn_coomingsoonLayout);
        btn_coomingsoonLayout.setHorizontalGroup(
            btn_coomingsoonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_coomingsoonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        btn_coomingsoonLayout.setVerticalGroup(
            btn_coomingsoonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_coomingsoonLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(btn_coomingsoonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        sidepane.add(btn_coomingsoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        btn_admin.setBackground(new java.awt.Color(64, 43, 100));
        btn_admin.setForeground(new java.awt.Color(0, 0, 0));
        btn_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_adminMousePressed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wisyam/xr7/image/icons8-plus-25.png"))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Administration");

        javax.swing.GroupLayout btn_adminLayout = new javax.swing.GroupLayout(btn_admin);
        btn_admin.setLayout(btn_adminLayout);
        btn_adminLayout.setHorizontalGroup(
            btn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_adminLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        btn_adminLayout.setVerticalGroup(
            btn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_adminLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(btn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        sidepane.add(btn_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn_history.setBackground(new java.awt.Color(85, 64, 118));
        btn_history.setForeground(new java.awt.Color(0, 0, 0));
        btn_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_historyMousePressed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wisyam/xr7/image/icons8-book-25.png"))); // NOI18N

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("History Transaction");

        javax.swing.GroupLayout btn_historyLayout = new javax.swing.GroupLayout(btn_history);
        btn_history.setLayout(btn_historyLayout);
        btn_historyLayout.setHorizontalGroup(
            btn_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_historyLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        btn_historyLayout.setVerticalGroup(
            btn_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_historyLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(btn_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        sidepane.add(btn_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 290, 10));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Kasir Jam Tangan");
        sidepane.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 340, 40));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 370, 587));

        jPanel1.setBackground(new java.awt.Color(122, 72, 211));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcome :D");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("History Transaction");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("______________________________________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 1000, 200));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1326, 0, 20, 20));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wisyam/xr7/image/icons8-melting-heart-50.png"))); // NOI18N
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 50, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("IcamKyun");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 340, 40));

        tabel_history.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_historyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_history);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 710, 320));
        bg.add(name_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 140, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1358, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MousePressed

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed
        // TODO add your handling code here:
        setColor(btn_home);
        resetColor(btn_coomingsoon);
        resetColor(btn_history);
        resetColor(btn_admin);
        Coba c = new Coba();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        dispose();                          
    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_coomingsoonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_coomingsoonMousePressed
        // TODO add your handling code here:
        setColor(btn_coomingsoon);
        resetColor(btn_home);
        resetColor(btn_history);
        resetColor(btn_admin);
        Kasir_jam kasir = new Kasir_jam();
        kasir.setVisible(true);
        kasir.pack();
        kasir.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_coomingsoonMousePressed

    private void btn_adminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminMousePressed
        // TODO add your handling code here:
        setColor(btn_admin);
        resetColor(btn_home);
        resetColor(btn_history);
        resetColor(btn_coomingsoon);
        
        admin adm = new admin();
        adm.setVisible(true);
        adm.pack();
        adm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_adminMousePressed

    private void btn_historyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_historyMousePressed
        // TODO add your handling code here:
        setColor(btn_history);
        resetColor(btn_home);
        resetColor(btn_admin);
        resetColor(btn_coomingsoon);
    }//GEN-LAST:event_btn_historyMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabel_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_historyMouseClicked
        // TODO add your handling code here:
        int baris = tabel_history.rowAtPoint(evt.getPoint());
        String nama = tabel_history.getValueAt(baris, 0).toString();
        name_b.setText(nama);
    }//GEN-LAST:event_tabel_historyMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM `history` WHERE username = '"+ name_b.getText() +"'";
            Connection con = (Connection) Class.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_admin;
    private javax.swing.JPanel btn_coomingsoon;
    private javax.swing.JPanel btn_history;
    private javax.swing.JPanel btn_home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name_b;
    private javax.swing.JPanel sidepane;
    private javax.swing.JTable tabel_history;
    // End of variables declaration//GEN-END:variables
}
