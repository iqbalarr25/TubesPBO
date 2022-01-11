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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dashboard_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        username_tx = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        no_hp_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        harga_tf = new javax.swing.JTextField();
        alamat_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kota_tf = new javax.swing.JTextField();
        provinsi_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        carport_tf = new javax.swing.JTextField();
        kamar_tidur_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kamar_mandi_tf = new javax.swing.JTextField();
        luas_tanah_tf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rumah_tb = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABEL KARYAWAN");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel1)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 90));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setToolTipText("");

        dashboard_btn.setBackground(new java.awt.Color(0, 153, 153));
        dashboard_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dashboard_btn.setForeground(new java.awt.Color(0, 0, 102));
        dashboard_btn.setText("BACK");
        dashboard_btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        dashboard_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_btnActionPerformed(evt);
            }
        });

        save_btn.setBackground(new java.awt.Color(0, 153, 153));
        save_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        save_btn.setForeground(new java.awt.Color(0, 0, 102));
        save_btn.setText("SAVE");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        update_btn.setBackground(new java.awt.Color(0, 153, 153));
        update_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        update_btn.setForeground(new java.awt.Color(0, 0, 102));
        update_btn.setText("UPDATE");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(255, 51, 51));
        delete_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(0, 0, 102));
        delete_btn.setText("DELETE");
        delete_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello,");

        username_tx.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        username_tx.setForeground(new java.awt.Color(255, 255, 255));
        username_tx.setText("nama");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No.HP");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        no_hp_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        harga_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        alamat_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Kota");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        kota_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        provinsi_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Provinsi");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Carport");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        carport_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        kamar_tidur_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        kamar_tidur_tf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kamar Tidur");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Kamar Mandi");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        kamar_mandi_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        luas_tanah_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Luas Tanah");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rumah_tb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rumah_tb.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(username_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(no_hp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(harga_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(alamat_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(kota_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(provinsi_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(carport_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(kamar_tidur_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kamar_mandi_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(luas_tanah_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_tx)
                    .addComponent(dashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(no_hp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(harga_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(alamat_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(kota_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(provinsi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(carport_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(kamar_tidur_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(kamar_mandi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(luas_tanah_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 910));

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
    private javax.swing.JPanel jPanel2;
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
