/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.io.File;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import utility.koneksi;


/**
 * 985
 * @author irfan
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FPenjualan
     */
    public FormMenu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        menuLaporan.setEnabled(true);
        menuTransaksi.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuPegawai = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        userLogout = new javax.swing.JMenuItem();
        menuMaster = new javax.swing.JMenu();
        masterPelanggan = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        masterBarang = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        transaksiPembelian = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        transaksiPenjualan = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();
        laporanBarang = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        laporanPelanggan = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        laporanTransaksi = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("APLIKASI PENGGAJIAN");
        setName("framePenjualan"); // NOI18N

        jLabel2.setForeground(new java.awt.Color(153, 0, 51));

        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        menuFile.setMnemonic('h');
        menuFile.setText("FILE");
        menuFile.setToolTipText("Ke Halaman Utama");
        menuFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        userLogout.setText("LOGOUT");
        userLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLogoutActionPerformed(evt);
            }
        });
        menuFile.add(userLogout);

        menuPegawai.add(menuFile);

        menuMaster.setMnemonic('m');
        menuMaster.setText("MASTER");
        menuMaster.setToolTipText("Menu Master");
        menuMaster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        masterPelanggan.setText("Golongan");
        masterPelanggan.setToolTipText("Master Pelanggan");
        masterPelanggan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masterPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterPelangganActionPerformed(evt);
            }
        });
        menuMaster.add(masterPelanggan);
        menuMaster.add(jSeparator6);

        masterBarang.setText("Pegawai");
        masterBarang.setToolTipText("Master Barang");
        masterBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masterBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterBarangActionPerformed(evt);
            }
        });
        menuMaster.add(masterBarang);

        menuPegawai.add(menuMaster);

        menuTransaksi.setMnemonic('t');
        menuTransaksi.setText("TRANSAKSI");
        menuTransaksi.setToolTipText("Menu Transaksi");
        menuTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        transaksiPembelian.setText("Golongan Pegawai");
        transaksiPembelian.setToolTipText("Transaksi Pembelian");
        transaksiPembelian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuTransaksi.add(transaksiPembelian);
        menuTransaksi.add(jSeparator4);

        transaksiPenjualan.setText("Penggajian");
        transaksiPenjualan.setToolTipText("Transaksi Penjualan");
        transaksiPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksiPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiPenjualanActionPerformed(evt);
            }
        });
        menuTransaksi.add(transaksiPenjualan);

        jMenuItem3.setText("Daftar Tunjangan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuTransaksi.add(jMenuItem3);

        jMenuItem5.setText("Tambah Tunjangan");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuTransaksi.add(jMenuItem5);

        menuPegawai.add(menuTransaksi);

        menuLaporan.setMnemonic('l');
        menuLaporan.setText("LAPORAN");
        menuLaporan.setToolTipText("Menu Laporan");
        menuLaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        laporanBarang.setText("Master Golongan");
        laporanBarang.setToolTipText("Laporan Barang");
        laporanBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanBarangActionPerformed(evt);
            }
        });
        menuLaporan.add(laporanBarang);
        menuLaporan.add(jSeparator1);

        laporanPelanggan.setText("Master Pegawai");
        laporanPelanggan.setToolTipText("Laporan Pelanggan");
        laporanPelanggan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporanPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanPelangganActionPerformed(evt);
            }
        });
        menuLaporan.add(laporanPelanggan);
        menuLaporan.add(jSeparator2);

        laporanTransaksi.setText("Golongan Pegawai");
        laporanTransaksi.setToolTipText("Laporan Transaksi");
        laporanTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLaporan.add(laporanTransaksi);

        menuPegawai.add(menuLaporan);

        setJMenuBar(menuPegawai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(552, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Form Aplikasi Penjualan");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masterBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterBarangActionPerformed
        // TODO add your handling code here:
        FormPegawai formPegawai=new FormPegawai();
        jDesktopPane1.add(formPegawai);
        formPegawai.setVisible(true);
    }//GEN-LAST:event_masterBarangActionPerformed

    private void masterPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterPelangganActionPerformed
        // TODO add your handling code here:
        FormGolongan fG=new FormGolongan();
        jDesktopPane1.add(fG);
        fG.setVisible(true);
    }//GEN-LAST:event_masterPelangganActionPerformed

    private void transaksiPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiPenjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiPenjualanActionPerformed

    private void userLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLogoutActionPerformed
        this.dispose();
        loginView logout = new loginView();
        logout.setLocationRelativeTo(null);
        logout.setVisible(true);
    }//GEN-LAST:event_userLogoutActionPerformed

    private void laporanBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanBarangActionPerformed
    try {
    
            //JasperDesign jd  = JRXmlLoader.load("C:\\Users\\aa\\Documents\\NetBeansProjects\\PenggajianPegawai\\src\\report\\laporanDataGolongan.jrxml");
            JasperDesign jd  = JRXmlLoader.load(getClass().getResourceAsStream("/report/laporanDataGolongan.jrxml"));
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp=JasperFillManager.fillReport(jr, null,koneksi.getConnection());
            JasperViewer.viewReport(jp);
            
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_laporanBarangActionPerformed

    private void laporanPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanPelangganActionPerformed
         try {
    
            //JasperDesign jd  = JRXmlLoader.load("C:\\Users\\aa\\Documents\\NetBeansProjects\\PenggajianPegawai\\src\\report\\laporanDataGolongan.jrxml");
            JasperDesign jd  = JRXmlLoader.load(getClass().getResourceAsStream("/report/laporanDaftarPegawai.jrxml"));
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp=JasperFillManager.fillReport(jr, null,koneksi.getConnection());
            JasperViewer.viewReport(jp);
            
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
       
    }//GEN-LAST:event_laporanPelangganActionPerformed
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                 FormDaftarTunjangan formDaftarTunjangan=new FormDaftarTunjangan();
                 jDesktopPane1.add(formDaftarTunjangan);
                 formDaftarTunjangan.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
                FormTunjangan formTunjangan=new FormTunjangan();
                 formTunjangan.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
                  Properties props = new Properties();
            
            props.put("logoString", "my company"); 
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            
            props.put("selectionBackgroundColor", "180 240 197"); 
            props.put("menuSelectionBackgroundColor", "180 240 197"); 
            
            props.put("controlColor", "218 254 230");
            props.put("controlColorLight", "218 254 230");
            props.put("controlColorDark", "180 240 197"); 

            props.put("buttonColor", "218 230 254");
            props.put("buttonColorLight", "255 255 255");
            props.put("buttonColorDark", "244 242 232");

            props.put("rolloverColor", "218 254 230"); 
            props.put("rolloverColorLight", "218 254 230"); 
            props.put("rolloverColorDark", "180 240 197"); 

            props.put("windowTitleForegroundColor", "0 0 0");
            props.put("windowTitleBackgroundColor", "180 240 197"); 
            props.put("windowTitleColorLight", "218 254 230"); 
            props.put("windowTitleColorDark", "180 240 197"); 
            props.put("windowBorderColor", "218 254 230");
            
            // set your theme
            SmartLookAndFeel.setCurrentTheme(props);
                 UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem laporanBarang;
    private javax.swing.JMenuItem laporanPelanggan;
    private javax.swing.JMenuItem laporanTransaksi;
    private javax.swing.JMenuItem masterBarang;
    private javax.swing.JMenuItem masterPelanggan;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenuBar menuPegawai;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenuItem transaksiPembelian;
    private javax.swing.JMenuItem transaksiPenjualan;
    private javax.swing.JMenuItem userLogout;
    // End of variables declaration//GEN-END:variables
}
