/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author LENOVO
 */
public class Rumah extends javax.swing.JFrame {
    String username = "";
    
    void tampilTabel(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubespbo","root","");
            //mysql query to run
            Statement stm = con.createStatement();

            String sql = "select * from rumah";
            ResultSet result = stm.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) rumah_tb.getModel();
            while(result.next()){
                model.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11)});
                rumah_tb.setModel(model);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Creates new form Homepage
     */
    public Rumah(String username) {
        initComponents();
        username_tx.setText(username);
        this.username = username;
        tampilTabel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_tx = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rumah_tb = new javax.swing.JTable();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        no_hp_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        harga_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alamat_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kota_tf = new javax.swing.JTextField();
        provinsi_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        carport_tf = new javax.swing.JTextField();
        kamar_tidur_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        kamar_mandi_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        luas_tanah_tf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        dashboard_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABEL KARYAWAN");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1580, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Hello,");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 44, -1));

        username_tx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        username_tx.setText("nama");
        getContentPane().add(username_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 39, 151, -1));

        rumah_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Rumah", "No HP", "Harga", "Alamat", "Kota", "Provinsi", "Carport", "Kamar Tidur", "Kamar Mandi", "Luas Tanah", "Tipe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rumah_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rumah_tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rumah_tb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 80, 1024, 622));

        delete_btn.setText("DELETE");
        delete_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        getContentPane().add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1489, 80, 101, 35));

        update_btn.setText("UPDATE");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        getContentPane().add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 667, 443, 35));

        save_btn.setText("SAVE");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        getContentPane().add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 626, 443, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("No.HP");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 201, 43));

        no_hp_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(no_hp_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 81, 238, 43));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Harga");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 201, 43));

        harga_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(harga_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 131, 238, 43));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Alamat");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 201, 43));

        alamat_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(alamat_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 181, 238, 43));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Kota");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 201, 43));

        kota_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(kota_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 231, 238, 43));

        provinsi_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(provinsi_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 281, 238, 43));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Provinsi");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 201, 43));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Carport");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 201, 43));

        carport_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(carport_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 331, 238, 43));

        kamar_tidur_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        kamar_tidur_tf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(kamar_tidur_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 381, 238, 43));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Kamar Tidur");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 201, 43));

        kamar_mandi_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(kamar_mandi_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 431, 238, 44));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Kamar Mandi");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 201, 44));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Luas Tanah");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 481, 201, 44));

        luas_tanah_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(luas_tanah_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 482, 238, 44));

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setToolTipText("");

        dashboard_btn.setText("BACK");
        dashboard_btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        dashboard_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1489, Short.MAX_VALUE)
                .addComponent(dashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(dashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(639, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // TODO add your handling code here:
        try{
            if(rumah_tb.getSelectedRowCount()==1){
                DefaultTableModel model = (DefaultTableModel) rumah_tb.getModel();
                String idDb = model.getValueAt(rumah_tb.getSelectedRow(), 0).toString();
                String noHp = no_hp_tf.getText();
                String harga = harga_tf.getText();
                String alamat = alamat_tf.getText();
                String kota = kota_tf.getText();
                String provinsi = provinsi_tf.getText();
                String carport = carport_tf.getText();
                String kamarTidur = kamar_tidur_tf.getText();
                String kamarMandi = kamar_mandi_tf.getText();
                String luasTanah = luas_tanah_tf.getText();
                String panjangLebar[] = luasTanah.split("x");
                String tipe = "";
                if(Integer.parseInt(panjangLebar[0])*Integer.parseInt(panjangLebar[1]) < 36){
                    tipe = "C";
                }else if(Integer.parseInt(panjangLebar[0])*Integer.parseInt(panjangLebar[1]) < 54){
                    tipe = "B";
                }else if(Integer.parseInt(panjangLebar[0])*Integer.parseInt(panjangLebar[1]) > 54){
                    tipe = "A";
                }
                int hargaAkhir = hitungHarga(Integer.parseInt(harga));
                String sql = "update rumah set no_hp='"+noHp+"', harga='"+hargaAkhir+"', alamat='"+alamat+"', kota='"+kota+"', provinsi='"+provinsi+"', carport='"+carport+"', kamar_tidur='"+kamarTidur+"', kamar_mandi='"+kamarMandi+"', luas_tanah='"+luasTanah+"', tipe='"+tipe+"' where id_rumah='"+idDb+"'";
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubespbo","root","");

                Statement stm = con.createStatement();
                stm.executeUpdate(sql);

                JOptionPane.showConfirmDialog(null, "Data berhasil diupdate", "Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
                reset();
            }else{
                if(rumah_tb.getRowCount()==0){
                    JOptionPane.showConfirmDialog(null, "Data di dalam tabel masih kosong", "Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
                }else{
                    JOptionPane.showConfirmDialog(null, "Pilih salah satu baris untuk diupdate", "Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel model = (DefaultTableModel) rumah_tb.getModel();
            String idDb = model.getValueAt(rumah_tb.getSelectedRow(), 0).toString();
            
            String sql = "DELETE FROM rumah WHERE id_rumah='"+idDb+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubespbo","root","");

            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            JOptionPane.showConfirmDialog(null, "Data berhasil dihapus", "Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
            reset();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
        try{
            String noHp = no_hp_tf.getText();
            String harga = harga_tf.getText();
            String alamat = alamat_tf.getText();
            String kota = kota_tf.getText();
            String provinsi = provinsi_tf.getText();
            String carport = carport_tf.getText();
            String kamarTidur = kamar_tidur_tf.getText();
            String kamarMandi = kamar_mandi_tf.getText();
            String luasTanah = luas_tanah_tf.getText();
            String panjangLebar[] = luasTanah.split("x");
            String tipe = "";
            if(Integer.parseInt(panjangLebar[0])*Integer.parseInt(panjangLebar[1]) < 36){
                tipe = "C";
            }else if(Integer.parseInt(panjangLebar[0])*Integer.parseInt(panjangLebar[1]) < 54){
                tipe = "B";
            }else if(Integer.parseInt(panjangLebar[0])*Integer.parseInt(panjangLebar[1]) > 54){
                tipe = "A";
            }
            int hargaAkhir = hitungHarga(Integer.parseInt(harga));
            String sql = "insert into rumah(no_hp,harga,alamat,kota,provinsi,carport,kamar_tidur,kamar_mandi,luas_tanah,tipe) values ('"+noHp+"','"+hargaAkhir+"','"+alamat+"','"+kota+"','"+provinsi+"','"+carport+"','"+kamarTidur+"','"+kamarMandi+"','"+luasTanah+"','"+tipe+"')";
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubespbo","root","");
            
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            
            JOptionPane.showConfirmDialog(null, "Data berhasil disimpan", "Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
            reset();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_save_btnActionPerformed

    private void rumah_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rumah_tbMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) rumah_tb.getModel();
        
        String noHp = model.getValueAt(rumah_tb.getSelectedRow(), 1).toString();
        String harga = model.getValueAt(rumah_tb.getSelectedRow(), 2).toString();
        String alamat = model.getValueAt(rumah_tb.getSelectedRow(), 3).toString();
        String kota = model.getValueAt(rumah_tb.getSelectedRow(), 4).toString();
        String provinsi = model.getValueAt(rumah_tb.getSelectedRow(), 5).toString();
        String carport = model.getValueAt(rumah_tb.getSelectedRow(), 6).toString();
        String kamarTidur = model.getValueAt(rumah_tb.getSelectedRow(), 7).toString();
        String kamarMandi = model.getValueAt(rumah_tb.getSelectedRow(), 8).toString();
        String luasTanah = model.getValueAt(rumah_tb.getSelectedRow(), 9).toString();
        
        no_hp_tf.setText(noHp);
        harga_tf.setText(harga);
        alamat_tf.setText(alamat);
        kota_tf.setText(kota);
        provinsi_tf.setText(provinsi);
        carport_tf.setText(carport);
        kamar_tidur_tf.setText(kamarTidur);
        kamar_mandi_tf.setText(kamarMandi);
        luas_tanah_tf.setText(luasTanah);
    }//GEN-LAST:event_rumah_tbMouseClicked

    private void dashboard_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_btnActionPerformed
        // TODO add your handling code here:
        dispose();
        Dashboard dashboard = new Dashboard(username);
        dashboard.setVisible(true);
        
    }//GEN-LAST:event_dashboard_btnActionPerformed
    private void reset(){
        String noHp = no_hp_tf.getText();
        String harga = harga_tf.getText();
        String alamat = alamat_tf.getText();
        String kota = kota_tf.getText();
        String provinsi = provinsi_tf.getText();
        String carport = carport_tf.getText();
        String kamarTidur = kamar_tidur_tf.getText();
        String kamarMandi = kamar_mandi_tf.getText();
        String luasTanah = luas_tanah_tf.getText();
        DefaultTableModel model = (DefaultTableModel) rumah_tb.getModel();
        model.setRowCount(0);
        tampilTabel();
    }
    
    private int hitungHarga(int harga){
        int hargaKomisi = harga / 50;
        harga += hargaKomisi;
        return harga;
    }
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
            java.util.logging.Logger.getLogger(Rumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_tf;
    private javax.swing.JTextField carport_tf;
    private javax.swing.JButton dashboard_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField harga_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kamar_mandi_tf;
    private javax.swing.JTextField kamar_tidur_tf;
    private javax.swing.JTextField kota_tf;
    private javax.swing.JTextField luas_tanah_tf;
    private javax.swing.JTextField no_hp_tf;
    private javax.swing.JTextField provinsi_tf;
    private javax.swing.JTable rumah_tb;
    private javax.swing.JButton save_btn;
    private javax.swing.JButton update_btn;
    private javax.swing.JLabel username_tx;
    // End of variables declaration//GEN-END:variables
}
