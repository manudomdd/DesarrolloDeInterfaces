package examen.gui;

import org.netbeans.validation.api.AbstractValidator;
import org.netbeans.validation.api.Problems;
import org.netbeans.validation.api.ui.ValidationGroup;

public class RegistroTemperaturas extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroTemperaturas.class.getName());
    public Principal ppl; 

    public RegistroTemperaturas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ppl = (Principal) parent; 
        validation();   
        jButton1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        validationPanel1 = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Temperatura minima prevista:");

        jLabel2.setText("Temperatura maxima prevista: ");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jButton1.setText("Registrar");
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
                .addGap(165, 165, 165)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jSpinner1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validationPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(validationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateTable(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void initButton() {
        jButton1.setEnabled(false);
    }
    
    private void validation() {
        ValidationGroup group = validationPanel1.getValidationGroup(); 
        
        group.add(jTextField1, new AbstractValidator<String>(String.class) {
            @Override
            public void validate(Problems prblms, String string, String t) {
                if (t.isEmpty() || t.isBlank()) {
                    prblms.add("Todos los campos deben de estar completos");
                } else if (!t.matches("^-?\\d+$")) {
                    prblms.add("El campo temperatura minima solo puede contener numeros");
                }              
            }           
        });
        
        validationPanel1.addChangeListener(v -> {
            if (validationPanel1.getProblem() == null) {
                jButton1.setEnabled(true);
            } else {
                jButton1.setEnabled(false);
            }
        });
    }
    
    public void updateTable() {
        double tMin = Double.parseDouble(jTextField1.getText()); 
        double tMax = (Double) jSpinner1.getValue(); 
        double promedio = (tMin + tMax) / 2; 
        
        int index = ppl.model.getRowCount() - 1;
        
        for (int i = 0; i < ppl.model.getRowCount(); i++) {
            if (i == index) {
                String city = (String) ppl.model.getValueAt(i, 0); 
                String fecha = (String) ppl.model.getValueAt(i, 1);
                String estacion = (String) ppl.model.getValueAt(i, 2); 
                
                Object[] row = {city, fecha, estacion, tMin, tMax, promedio}; 
                
                ppl.model.removeRow(i);                              
                ppl.addToTable(row);
            }
        }
        
        this.setVisible(false);
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RegistroTemperaturas dialog = new RegistroTemperaturas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel1;
    // End of variables declaration//GEN-END:variables
}
