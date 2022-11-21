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
public class Kasir_jam extends javax.swing.JFrame {

    public Kasir_jam() {
        initComponents();
        table();
        tab_kasr();
    }
    public void table(){
        DefaultTableModel tb1 = new DefaultTableModel();
        tb1.addColumn("Nama Produk");
        tb1.addColumn("Harga Produk");
        
        try{
            Statement st = (Statement) Class.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM menu");
            
            while(rs.next()){
                tb1.addRow(new Object[] {
                    rs.getString("namep"),
                    rs.getString("harga")
                });
                tabelmomen.setModel(tb1);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal!" + e.getMessage());
        }
    }
    public void tab_kasr(){
        DefaultTableModel tb1 = new DefaultTableModel();
        tb1.addColumn("Nama Produk");
        tb1.addColumn("Harga Produk");
        tb1.addColumn("Jumlah Barang");
        try{
            Statement st = (Statement) Class.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM kasir");

            while(rs.next()){
                tb1.addRow(new Object[] {
                    rs.getString("namek"),
                    rs.getString("hargak"),
                    rs.getString("juml")
                });
                tab_kas.setModel(tb1);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelmomen = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bayar_baran = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_selesai = new javax.swing.JButton();
        user_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_kas = new javax.swing.JTable();
        totalhargatext = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_selesai1 = new javax.swing.JButton();

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

        btn_coomingsoon.setBackground(new java.awt.Color(85, 64, 118));
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

        btn_history.setBackground(new java.awt.Color(64, 43, 100));
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

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 370, 587));

        jPanel1.setBackground(new java.awt.Color(122, 72, 211));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tabelmomen.setAutoCreateRowSorter(true);
        tabelmomen.setBackground(new java.awt.Color(255, 255, 255));
        tabelmomen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelmomen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabelmomen.setForeground(new java.awt.Color(0, 0, 0));
        tabelmomen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelmomen.setGridColor(new java.awt.Color(255, 255, 255));
        tabelmomen.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tabelmomen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelmomenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelmomen);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 50, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("IcamKyun");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 340, 40));

        bayar_baran.setBackground(new java.awt.Color(255, 255, 255));
        bayar_baran.setForeground(new java.awt.Color(0, 0, 0));
        bayar_baran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayar_baranActionPerformed(evt);
            }
        });
        bg.add(bayar_baran, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 250, 30));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jumlah Uang");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 180, 30));

        btn_selesai.setBackground(new java.awt.Color(0, 0, 0));
        btn_selesai.setForeground(new java.awt.Color(255, 255, 255));
        btn_selesai.setText("DELETE");
        btn_selesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_selesaiMouseClicked(evt);
            }
        });
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });
        bg.add(btn_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 540, 100, 40));

        user_name.setBackground(new java.awt.Color(255, 255, 255));
        user_name.setForeground(new java.awt.Color(0, 0, 0));
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });
        bg.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 250, 30));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nama Pembeli");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 180, 30));

        tab_kas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tab_kas);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 850, 220));

        totalhargatext.setBackground(new java.awt.Color(0, 0, 0));
        totalhargatext.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        totalhargatext.setForeground(new java.awt.Color(0, 0, 0));
        totalhargatext.setText("Rp.0");
        bg.add(totalhargatext, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("TOTAL:");
        bg.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, -1, -1));

        btn_selesai1.setBackground(new java.awt.Color(0, 0, 0));
        btn_selesai1.setForeground(new java.awt.Color(255, 255, 255));
        btn_selesai1.setText("SELESAI");
        btn_selesai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_selesai1MouseClicked(evt);
            }
        });
        btn_selesai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesai1ActionPerformed(evt);
            }
        });
        bg.add(btn_selesai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 490, 100, 40));

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

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        // TODO add your handling code here:
        tab_kasr();
    }//GEN-LAST:event_btn_selesaiActionPerformed

    private void btn_selesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selesaiMouseClicked
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM `kasir` WHERE " + tab_kas.getRowCount() + "";
            Connection con = (Connection) Class.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
            tab_kasr();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_selesaiMouseClicked
static int toba = 0;
    private void bayar_baranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayar_baranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayar_baranActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MousePressed

    private void tabelmomenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelmomenMouseClicked
        // TODO add your handling code here:
        int baris = tabelmomen.rowAtPoint(evt.getPoint());
        String nama = tabelmomen.getValueAt(baris, 0).toString();
        String harga = tabelmomen.getValueAt(baris, 1).toString();

        int total = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Barang"));
        int a = Integer.parseInt(harga) * total;

        try{
            String sql = "INSERT INTO `kasir`(`namek`, `hargak`, `juml`) VALUES ('"+nama+"','"+a+"','"+total+"')";
            Connection con = (Connection) Class.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        DefaultTableModel tb1 = new DefaultTableModel();
        tb1.addColumn("Nama Produk");
        tb1.addColumn("Harga Produk");
        tb1.addColumn("Jumlah Barang");
        try{
            Statement st = (Statement) Class.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM kasir");

            while(rs.next()){
                tb1.addRow(new Object[] {
                    rs.getString("namek"),
                    rs.getString("hargak"),
                    rs.getString("juml")
                });
                tab_kas.setModel(tb1);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal!" + e.getMessage());
        }
        
        int baris1 = tab_kas.getRowCount();
        
        for (int i = 0; i < baris1; i++) {
            String harga1 = tab_kas.getValueAt(i, 1).toString();
            toba += Integer.parseInt(harga1);
        }
        totalhargatext.setText("Rp."+ toba);

    }//GEN-LAST:event_tabelmomenMouseClicked

    private void btn_historyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_historyMousePressed
        // TODO add your handling code here:
        setColor(btn_history);
        resetColor(btn_home);
        resetColor(btn_admin);
        resetColor(btn_coomingsoon);

        history hsrty = new history();
        hsrty.setVisible(true);
        hsrty.pack();
        hsrty.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_historyMousePressed

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

    private void btn_selesai1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selesai1MouseClicked
        // TODO add your handling code here:
        int baristab = tab_kas.getRowCount();
        int hargas1 = 0;
        String Harga = "";
        int Jumlah = 0;
        String Nama = "\n";
        for (int i = 0; i < baristab; i++) {
            String harga1 = tab_kas.getValueAt(i, 1).toString();
            String jumlh = tab_kas.getValueAt(i, 2).toString();
            Jumlah += Integer.parseInt(jumlh);
            Nama += tab_kas.getValueAt(i, 0).toString();
            Nama += "\n ";
            Harga += harga1 + ", ";
            hargas1 += Integer.parseInt(harga1);
        }
        int bayar = toba;
        String Nama_user = user_name.getText();
        int Uang = Integer.parseInt(bayar_baran.getText());
        int kembali = 0;
        if(Uang<100){
            JOptionPane.showMessageDialog(null, "Uang tidak mencukupi");
        }
        else{
            kembali += Uang - bayar;
            JOptionPane.showMessageDialog(null, "=====================TRANSAKSI BERHASIL=====================\nNama Pembeli = " + Nama_user + "\nNama Barang = " + Nama +"\nHarga Barang = " + Harga + "\nJumlah Barang = " + Jumlah + "\nTotal harga = " + bayar + "\nUang " +Uang+"\nKembalian = " + kembali);
            try{
                String sql = "INSERT INTO `history` (`username`, `namab`, `hargab`, `jumlahb`, `totalh`, `jumuang`, `kembalian`) VALUES ('"+Nama_user+"', '"+Nama+"', '"+hargas1+"', '"+Jumlah+"', '"+bayar+"', '"+Uang+"', '"+kembali+"')";
                Connection con = (Connection) Class.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        try{
            String sql = "DELETE FROM `kasir` WHERE " + tab_kas.getRowCount() + "";
            Connection con = (Connection) Class.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Tranksasi Selesai~");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }//GEN-LAST:event_btn_selesai1MouseClicked

    private void btn_selesai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesai1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_selesai1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir_jam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir_jam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir_jam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir_jam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir_jam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar_baran;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_admin;
    private javax.swing.JPanel btn_coomingsoon;
    private javax.swing.JPanel btn_history;
    private javax.swing.JPanel btn_home;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JButton btn_selesai1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel sidepane;
    private javax.swing.JTable tab_kas;
    private javax.swing.JTable tabelmomen;
    private javax.swing.JLabel totalhargatext;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
