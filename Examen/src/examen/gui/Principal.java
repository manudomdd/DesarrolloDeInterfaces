package examen.gui;

import java.net.URL;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.openide.util.Exceptions;

public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    public DefaultTableModel model; 
    private static final String[] TABLE_HEADERS = {"Ciudad", "Fecha", "Estación", "Temp Minima", "Temp Maxima", "Temp promedio"};
    private static DefaultComboBoxModel dcm; 

    public Principal() {
        initComponents();
        centerScreen(); 
        setIcon(); 
        initTable(); 
        sortTable(); 
        initComboBox(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        jButton1.setText("Eliminar visita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Planificador viajes");

        jMenuItem1.setText("Registrar ciudad y fecha");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Registro de temperaturas");
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(jComboBox1, 0, 66, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CiudadyFecha fRegister = new CiudadyFecha(this, true); 
        fRegister.setLocationRelativeTo(null);
        fRegister.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        setLaF(); 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        RegistroTemperaturas temp = new RegistroTemperaturas(this, true); 
        temp.setLocationRelativeTo(null);
        temp.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void centerScreen() {
        this.setLocationRelativeTo(null); 
    }
    
    private void setIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/examen/gui/img/icono.png")).getImage());
    }
    
    private void initTable() {
        model = new DefaultTableModel(null, TABLE_HEADERS);
        jTable1.setModel(model);
    }
    
    private void sortTable() {
        TableRowSorter sorter = new TableRowSorter(jTable1.getModel()); 
        
        sorter.setComparator(5, (o1, o2) -> {
            double num1 = (Double) o1; 
            double num2 = (Double) o2;
            return Double.compare(num1, num2); 
        });
        
        sorter.setSortKeys(Arrays.asList(new RowSorter.SortKey(5, SortOrder.DESCENDING)));
        sorter.sort();
        jTable1.setRowSorter(sorter);
    }
    
    private void initComboBox() {
        dcm = new DefaultComboBoxModel(); 
        
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            dcm.addElement(info.getName());
        }
        
        jComboBox1.setModel(dcm);
    }
    
    private void setLaF() {
        String selection = (String) jComboBox1.getSelectedItem(); 
        
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if (info.getName().equals(selection)) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                    break; 
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }      
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
    }
    
    public void addToTable(Object[] row) {
        model.addRow(row);
    }
    
    private void delete() {
        String city = javax.swing.JOptionPane.showInputDialog(this, "Introduce el nombre de la ciudad a eliminar: "); 
        boolean encontrado = false; 
        for (int i = 0; i < model.getRowCount() && !encontrado; i++) {
            if (city.equalsIgnoreCase((String) model.getValueAt(i, 0))) {
                int selection = (int) javax.swing.JOptionPane.showConfirmDialog(this, "¿Esta segura de que quiere eliminar el registro?"); 
                String estacion = (String) model.getValueAt(i, 2); 
                switch (selection) {
                    case 0 -> {
                        encontrado = true; 
                        javax.swing.JOptionPane.showMessageDialog(this, "De acuerdo, eliminamos la visita a la ciudad " + city + " en la estacion " + estacion);
                        model.removeRow(i);
                    }
                }               
            } else {
                encontrado = false; 
            }
        }
        
        if (!encontrado) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontro ningun registro");
        }
    }
    
    public void updateIcon(String location) {        
        jLabel2.setIcon(new ImageIcon(getClass().getResource(location)));
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
        
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
