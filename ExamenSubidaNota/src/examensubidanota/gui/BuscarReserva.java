package examensubidanota.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.openide.util.Exceptions;

public class BuscarReserva extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BuscarReserva.class.getName());
    protected DefaultTableModel model; 
    protected final String[] TABLE_HEADERS = {"Nombre", "Inicio", "Fin", "Duracion", "Asistentes", "Equipo", "Capacidad"}; 
    protected GestorSalas gestor; 
    
    public BuscarReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        gestor = (GestorSalas) parent; 
        initComponents();   
        initTable(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(BuscarReserva.class, "BuscarReserva.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(BuscarReserva.class, "BuscarReserva.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(BuscarReserva.class, "BuscarReserva.jLabel3.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(BuscarReserva.class, "BuscarReserva.jTextField1.text")); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText(org.openide.util.NbBundle.getMessage(BuscarReserva.class, "BuscarReserva.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextField1))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try { 
            addToTable();
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void initTable() {
        model = new DefaultTableModel(TABLE_HEADERS, 0); 
        jTable2.setModel(model);
    }
    
    private void addToTable() throws ParseException {
        String nombre = jTextField1.getText().toString(); 
        Date fechaInicio = jDateChooser1.getDate(); 
        Date fechaFin = jDateChooser2.getDate(); 
                       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");  
        
        for (int i = 0; i < gestor.model.getRowCount(); i++) {
            if (nombre.equalsIgnoreCase(gestor.model.getValueAt(i, 0).toString())) {
                Date fechaIniTabla = sdf.parse(gestor.model.getValueAt(i, 1).toString()); 
                Date fechaFinTabla = sdf.parse(gestor.model.getValueAt(i, 2).toString()); 
                
                long fechaInicioUNIX = fechaInicio.getTime(); 
                long fechaIniTablaUNIX = fechaIniTabla.getTime(); 
                long fechaFinUNIX = fechaFin.getTime(); 
                long fechaFinTablaUNIX = fechaFinTabla.getTime(); 
                
                if ((fechaInicioUNIX < fechaIniTablaUNIX) && (fechaFinUNIX > fechaFinTablaUNIX)) {
                    String nombreTabla = gestor.model.getValueAt(i, 0).toString(); 
                    String fechaInicioTablaStr = gestor.model.getValueAt(i, 1).toString(); 
                    String fechaFinTablaStr = gestor.model.getValueAt(i, 2).toString(); 
                    double duracion = (Double) gestor.model.getValueAt(i, 3); 
                    int asistentes = (int) gestor.model.getValueAt(i, 4); 
                    String equipoTabla = gestor.model.getValueAt(i, 5).toString(); 
                    String capacidadTabla = gestor.model.getValueAt(i, 6).toString();

                    Object[] row = {nombreTabla, fechaInicioTablaStr, fechaFinTablaStr, duracion, asistentes, equipoTabla, capacidadTabla}; 
                    this.model.addRow(row);
                }       
            }  
        }
    }
    
    /**
     * String nombreTabla = gestor.model.getValueAt(i, 0).toString(); 
                    String fechaInicioTablaStr = gestor.model.getValueAt(i, 1).toString(); 
                    String fechaFinTablaStr = gestor.model.getValueAt(i, 2).toString(); 
                    double duracion = (Double) gestor.model.getValueAt(i, 3); 
                    int asistentes = (int) gestor.model.getValueAt(i, 4); 
                    String equipoTabla = gestor.model.getValueAt(i, 5).toString(); 
                    String capacidadTabla = gestor.model.getValueAt(i, 6).toString();
                    * 
                    * Date fechaInicioTabla = sdf.parse(gestor.model.getValueAt(i, 1).toString()); 
                Date fechaFinTabla = sdf.parse(gestor.model.getValueAt(i, 2).toString()); 
                
                long fechaInicioUNIX = fechaInicio.getTime(); 
                long fechaInicioTablaUNIX = fechaInicioTabla.getTime(); 
                long fechaFinUNIX = fechaFin.getTime(); 
                long fechaFinTablaUNIX = fechaFinTabla.getTime(); 
                    * 
     * @param args 
     */    
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BuscarReserva dialog = new BuscarReserva(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
