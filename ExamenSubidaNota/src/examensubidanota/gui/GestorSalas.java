package examensubidanota.gui;

import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class GestorSalas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GestorSalas.class.getName());
    protected DefaultTableModel model; 
    protected final String[] TABLE_HEADERS = {"Nombre", "Fecha y hora inicio", "Fecha y hora fin", "Duracion", "Asistentes", "Equipo", "Capacidad"}; 
    private DefaultComboBoxModel dcm; 
    
    public GestorSalas() {
        initComponents();
        centerScreen(); 
        initTable(); 
        initIcon(); 
        initComboBox(); 
        initSorter(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setLayout(new java.awt.GridLayout());

        jButton1.setText(org.openide.util.NbBundle.getMessage(GestorSalas.class, "GestorSalas.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText(org.openide.util.NbBundle.getMessage(GestorSalas.class, "GestorSalas.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jMenu1.setText(org.openide.util.NbBundle.getMessage(GestorSalas.class, "GestorSalas.jMenu1.text")); // NOI18N

        jMenuItem1.setText(org.openide.util.NbBundle.getMessage(GestorSalas.class, "GestorSalas.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText(org.openide.util.NbBundle.getMessage(GestorSalas.class, "GestorSalas.jMenuItem2.text")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        irNuevaReserva(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        irBuscarReservas(); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String lookAndFeelName = (String) jComboBox1.getSelectedItem(); 
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (info.getName().equals(lookAndFeelName)) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = javax.swing.JOptionPane.showInputDialog("Introduzca el nombre de la reserva: ").trim(); 
       
        for (int i = 0; i < model.getRowCount(); i++) {
            if (nombre.equalsIgnoreCase(model.getValueAt(i, 0).toString())) {
                int option = javax.swing.JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quiere eliminar esta reserva?: "); 
                if (option == 0) {
                    String fechaIni = model.getValueAt(i, 1).toString(); 
                    String fechaFin = model.getValueAt(i, 2).toString(); 
                    model.removeRow(i);
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Reserva eliminada: " + nombre + "Fecha inicio: " + fechaIni + "Fecha fin: " + fechaFin);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "No se ha eliminado la reserva " + nombre); 
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Seleccione una reserva valida.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
     
    public void centerScreen() {
        this.setLocationRelativeTo(null);
    }
    
    public void initIcon() {
        String PATH = "/examensubidanota/resources/icono.jpg"; 
        setIconImage(new ImageIcon(getClass().getResource(PATH)).getImage());
    }
    
    private void initSorter() {
        TableRowSorter sorter = new TableRowSorter<>(jTable1.getModel()); 
        jTable1.setRowSorter(sorter); 
        
        sorter.setSortKeys(Arrays.asList(new RowSorter.SortKey(3, SortOrder.ASCENDING))); 
        
        sorter.setComparator(1, (o1, o2) -> {
            Double num1 = (Double) o1; 
            Double num2 = (Double) o2; 
            return num1.compareTo(num2);
        });
        
        sorter.sort();
    }
    private void initComboBox() {
        dcm = new DefaultComboBoxModel();
        for (LookAndFeelInfo lfi : UIManager.getInstalledLookAndFeels()) {
            dcm.addElement(lfi.getName());
        }
        jComboBox1.setModel(dcm);
    }
    private void irNuevaReserva() {
        NuevaReserva nuevaReserva = new NuevaReserva(this, true); 
        nuevaReserva.setLocationRelativeTo(null);
        nuevaReserva.setVisible(true); 
    }
    
    private void irBuscarReservas() {
        BuscarReserva buscarReservas = new BuscarReserva(this, true); 
        buscarReservas.setLocationRelativeTo(null);
        buscarReservas.setVisible(true);
    }
    
    private void initTable() {
        model = new DefaultTableModel(TABLE_HEADERS, 0); 
        jTable1.setModel(model);
    }
    
    public void addToTable(Object[] row) {
        model.addRow(row);
    }
    
    public void setPhoto(String seleccion) {
        if (seleccion.equalsIgnoreCase("pizarra")) {
            jLabel1.setIcon(new ImageIcon(getClass().getResource("/examensubidanota/resources/pizarra.jpg"))); 
        } else if (seleccion.equalsIgnoreCase("proyector")) {
            jLabel1.setIcon(new ImageIcon(getClass().getResource("/examensubidanota/resources/proyector.jpg"))); 
        } else if (seleccion.equalsIgnoreCase("silla")) {
            jLabel1.setIcon(new ImageIcon(getClass().getResource("/examensubidanota/resources/silla.jpg"))); 
        }
    }
    
    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new GestorSalas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
