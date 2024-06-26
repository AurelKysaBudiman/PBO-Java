/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_penjualan_sederhana;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Joji Sinaga
 */
public class Barang extends javax.swing.JFrame {

    /**
     * Creates new form Barang
     */
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public Barang() {
        initComponents();
        k.connect();
        refreshtable();
    }
    
    class Brg extends Barang{
        int id_barang, harga;
        String nama_barang, status;
        
    public Brg(){
        this.nama_barang = txt_NamaBarang.getText();
        this.harga = Integer.parseInt(txt_harga.getText());
        this.status = text_status.getSelectedItem().toString();
    }
}   
    public void refreshtable(){
        model = new DefaultTableModel();
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Harga");
        model.addColumn("Status Barang");
        
       tbl_barang.setModel(model);
       
       try{
           this.stat = k.getCon().prepareStatement("Select * from barang");
           this.rs = this.stat.executeQuery();
           while(rs.next()){
               Object[] data = {
                   rs.getInt("id_barang"),
                   rs.getString("nama_barang"),
                   rs.getInt("harga"),
                   rs.getString("status")
               };
               model.addRow(data);
            }
           }catch (Exception e){
                   JOptionPane.showMessageDialog(null, e.getMessage());
           }
           txt_IDBarang.setText("");
           txt_NamaBarang.setText("");
           txt_harga.setText("");
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_status = new javax.swing.JComboBox<>();
        brgbtn_in = new javax.swing.JButton();
        brgbtn_up = new javax.swing.JButton();
        brgbtn_del = new javax.swing.JButton();
        brgbtn_regis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        txt_NamaBarang = new javax.swing.JTextField();
        txt_IDBarang = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        brgbtn_log = new javax.swing.JButton();
        brgbtn_mt = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BARANG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Harga");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Status");

        text_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Habis" }));
        text_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_statusActionPerformed(evt);
            }
        });

        brgbtn_in.setText("INPUT");
        brgbtn_in.setEnabled(false);
        brgbtn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_inActionPerformed(evt);
            }
        });

        brgbtn_up.setText("UPDATE");
        brgbtn_up.setEnabled(false);
        brgbtn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_upActionPerformed(evt);
            }
        });

        brgbtn_del.setText("DELETE");
        brgbtn_del.setEnabled(false);
        brgbtn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_delActionPerformed(evt);
            }
        });

        brgbtn_regis.setText("MENU REGISTER");
        brgbtn_regis.setToolTipText("");
        brgbtn_regis.setDoubleBuffered(true);
        brgbtn_regis.setEnabled(false);
        brgbtn_regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_regisActionPerformed(evt);
            }
        });

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_barang);

        txt_IDBarang.setEditable(false);
        txt_IDBarang.setActionCommand("<Not Set>");
        txt_IDBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDBarangActionPerformed(evt);
            }
        });

        brgbtn_log.setText("LOGOUT");
        brgbtn_log.setEnabled(false);
        brgbtn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_logActionPerformed(evt);
            }
        });

        brgbtn_mt.setText("MENU TRANSAKSI");
        brgbtn_mt.setEnabled(false);
        brgbtn_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_mtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(brgbtn_mt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brgbtn_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(brgbtn_up, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brgbtn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(brgbtn_regis)
                                .addGap(16, 16, 16))
                            .addComponent(txt_NamaBarang)
                            .addComponent(txt_IDBarang)
                            .addComponent(txt_harga)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123)
                        .addComponent(brgbtn_log)
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brgbtn_log)
                            .addComponent(brgbtn_mt))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_IDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brgbtn_in)
                    .addComponent(brgbtn_up)
                    .addComponent(brgbtn_del)
                    .addComponent(brgbtn_regis))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_statusActionPerformed

    private void brgbtn_regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_regisActionPerformed
        // TODO add your handling code here:
        Registrasi reg = new Registrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brgbtn_regisActionPerformed

    private void brgbtn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_logActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brgbtn_logActionPerformed

    private void brgbtn_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_mtActionPerformed
        // TODO add your handling code here:
        Transaksi tran = new Transaksi();
        tran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brgbtn_mtActionPerformed

    private void brgbtn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_inActionPerformed
        // TODO add your handling code here:
        try{
            Brg b = new Brg();
            this.stat = k.getCon().prepareStatement("insert into barang values(?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, b.nama_barang);
            stat.setInt(3, b.harga);
            stat.setString(4, b.status);
            stat.executeUpdate();
            refreshtable();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_brgbtn_inActionPerformed

    private void brgbtn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_upActionPerformed
        // TODO add your handling code here:
        try{
            Brg b = new Brg();
            this.stat = k.getCon().prepareStatement("update barang set nama_barang=?,"+"harga=?,status=? where id_barang=?");
            stat.setString(1, b.nama_barang);
            stat.setInt(2, b.harga);
            stat.setString(3, b.status);
            stat.setInt(4, Integer.parseInt(txt_IDBarang.getText()));
            stat.executeUpdate();
            refreshtable();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_brgbtn_upActionPerformed

    private void brgbtn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_delActionPerformed
        // TODO add your handling code here:
        try{
            this.stat = k.getCon().prepareStatement("delete from barang where id_barang=?");
            stat.setInt(1, Integer.parseInt(txt_IDBarang.getText()));
            stat.executeUpdate();
            refreshtable();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_brgbtn_delActionPerformed

    private void txt_IDBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDBarangActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        // TODO add your handling code here:
        txt_IDBarang.setText(model.getValueAt(tbl_barang.getSelectedRow(), 0).toString());
        txt_NamaBarang.setText(model.getValueAt(tbl_barang.getSelectedRow(), 1).toString());
        txt_harga.setText(model.getValueAt(tbl_barang.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tbl_barangMouseClicked

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
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton brgbtn_del;
    public javax.swing.JButton brgbtn_in;
    public javax.swing.JButton brgbtn_log;
    public javax.swing.JButton brgbtn_mt;
    public javax.swing.JButton brgbtn_regis;
    public javax.swing.JButton brgbtn_up;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JComboBox<String> text_status;
    private javax.swing.JTextField txt_IDBarang;
    private javax.swing.JTextField txt_NamaBarang;
    private javax.swing.JTextField txt_harga;
    // End of variables declaration//GEN-END:variables
}
