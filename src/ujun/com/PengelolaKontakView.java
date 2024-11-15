/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ujun.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PengelolaKontakView extends javax.swing.JFrame {

    private ContactService service;
    private int contactId;

    public PengelolaKontakView() {
        initComponents();
        this.service = new ContactService();
        this.showAllDatas();
        this.cleanInput();
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
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        simpanButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setMaximumSize(new java.awt.Dimension(25, 25));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 30));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Aplikasi Pengelola Kontak");
        jLabel4.setIconTextGap(2);
        jLabel4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel4.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabel4.setPreferredSize(new java.awt.Dimension(275, 25));
        jPanel2.add(jLabel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Kategori");

        jLabel2.setText("Nomer Telepon");

        jLabel1.setText("Nama");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.WEST);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(12, 60));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Teman", "Keluarga", "Kerja" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setMinimumSize(new java.awt.Dimension(0, 0));
        jList1.setPreferredSize(new java.awt.Dimension(10, 10));
        jScrollPane2.setViewportView(jList1);

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Import CSV");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Export CSV");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(simpanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(97, 97, 97)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(editButton)
                    .addComponent(hapusButton)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Berdasarkan");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama", "Telepon" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "No Telepon", "Kategori"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        if (jTextField1.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong", "Gagal Menyimpan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jTextField2.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Nomer tidak boleh kosong", "Gagal Menyimpan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!jTextField2.getText().matches("[0-9]{8,20}")) {
            JOptionPane.showMessageDialog(null, "Format nomer invalid", "Gagal Menyimpan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jList1.getSelectedValue() == null || jList1.getSelectedValue().isBlank()) {
            JOptionPane.showMessageDialog(null, "Tidak ada kategori yg dipilih", "Gagal Menyimpan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String name = jTextField1.getText();
            String telepon = jTextField2.getText();
            String kategori = (String) jList1.getSelectedValue();
            this.service.addContact(name, telepon, kategori);
            JOptionPane.showMessageDialog(null, "Berhasil menambahkan Kontak");
            this.cleanInput();
            this.showAllDatas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Kontak");
            e.printStackTrace();
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (jTextField1.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong", "Gagal Mengedit", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jTextField2.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Nomer tidak boleh kosong", "Gagal Mengedit", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!jTextField2.getText().matches("[0-9]{8,20}")) {
            JOptionPane.showMessageDialog(null, "Format nomer invalid", "Gagal Mengedit", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jList1.getSelectedValue() == null || jList1.getSelectedValue().isBlank()) {
            JOptionPane.showMessageDialog(null, "Tidak ada kategori yg dipilih", "Gagal Menyimpan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        try {
            this.service.update(
                    this.contactId,
                    jTextField1.getText(),
                    jTextField2.getText(),
                    jComboBox1.getSelectedItem().toString()
            );
            this.cleanInput();
            this.showAllDatas();
            JOptionPane.showMessageDialog(null, "Berhasil melakukan perubahan data", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal melakukan perubahan data", "GAGAL", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        this.contactId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        jTextField1.setText(jTable1.getValueAt(row, 1).toString());
        jTextField2.setText(jTable1.getValueAt(row, 2).toString());
        jList1.setSelectedValue(jTable1.getValueAt(row, 3), true);
        simpanButton.setEnabled(false);
        editButton.setEnabled(true);
        hapusButton.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed

        try {
            int isDeleteConfirmed = JOptionPane.showConfirmDialog(null, "Yakin Menghapus data?");
            if (isDeleteConfirmed == 0) {
                this.service.delete(this.contactId);
                this.cleanInput();
                this.showAllDatas();
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data", "SUKSES", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data", "GAGAL", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.cleanInput();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.searchDatasAction();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        this.searchDatasAction();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.exportToCSV();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.importFromCSV();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cleanInput() {
        jTextField1.setText("");
        jTextField2.setText("");
        jList1.clearSelection();
        simpanButton.setEnabled(true);
        editButton.setEnabled(false);
        hapusButton.setEnabled(false);
        jTextField1.requestFocus();
    }

    private void showDatas(String[][] rows) {
        String[] titles = {"ID", "Nama", "No Telepon", "Kategori"};
        DefaultTableModel dtm = new DefaultTableModel(null, titles);
        jTable1.setModel(dtm);
        for (var row : rows) {
            dtm.addRow(row);
        }
    }

    private void showAllDatas() {
        try {
            String[][] rows = this.service.getAll();
            this.showDatas(rows);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void searchDatasAction() {
        String keyWord = jTextField3.getText();
        String searchBy = jComboBox1.getSelectedItem().toString();
        String[][] rowsOfData = new String[][]{};
        try {
            if (searchBy.equalsIgnoreCase("Nama")) {
                rowsOfData = this.service.getAllByName(keyWord);
            } else if (searchBy.equalsIgnoreCase("Telepon")) {
                rowsOfData = this.service.getAllByTelepon(keyWord);
            }
            this.showDatas(rowsOfData);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exportToCSV() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));

        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".csv")) {
                filePath += ".csv";
            }

            try (PrintWriter writer = new PrintWriter(new File(filePath))) {
                StringBuilder sb = new StringBuilder();
                sb.append("Nama,Telepon,Kategori\n");

                String sql = "SELECT * FROM contacts";
                Statement stmt = DB.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    sb.append(rs.getString("name")).append(",");
                    sb.append(rs.getString("telepon")).append(",");
                    sb.append(rs.getString("kategori")).append("\n");
                }

                writer.write(sb.toString());
                JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke CSV!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saat ekspor: " + e.getMessage());
            }
        }
    }

    private void importFromCSV() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select CSV file to import");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                String line = br.readLine(); // Skip header
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values.length == 3) {
                        String sql = "INSERT INTO contacts (name, telepon, kategori) VALUES (?, ?, ?)";
                        PreparedStatement pstmt = DB.getConnection().prepareStatement(sql);
                        pstmt.setString(1, values[0].trim());
                        pstmt.setString(2, values[1].trim());
                        pstmt.setString(3, values[2].trim());
                        pstmt.executeUpdate();
                    }
                }
//                loadKontakData();
                this.showAllDatas();
                JOptionPane.showMessageDialog(this, "Data berhasil diimpor!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saat impor: " + e.getMessage());
            }
        }
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
            java.util.logging.Logger.getLogger(PengelolaKontakView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontakView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontakView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontakView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaKontakView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
}
