package examen.gui;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.netbeans.validation.api.AbstractValidator;
import org.netbeans.validation.api.Problems;
import org.netbeans.validation.api.ui.ValidationGroup;

public class CiudadyFecha extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CiudadyFecha.class.getName());
    public Principal ppl; 

    public CiudadyFecha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ppl = (Principal) parent; 
        validator(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        validationPanel1 = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Fecha prevista:");

        jLabel2.setText("Nombre ciudad:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(140, 140, 140))
                            .addComponent(validationPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(validationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registrar(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void validator() {
        ValidationGroup group = validationPanel1.getValidationGroup(); 
        
        group.add(jTextField1, new AbstractValidator<String>(String.class) {
            @Override
            public void validate(Problems prblms, String string, String t) {
                if (t.isEmpty() || t.isBlank()) {
                    prblms.add("Es necesario rellenar todos los campos");
                } else if (!t.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\\\s]+$")) {
                    prblms.add("El campo ciudad solo puede contener letras");
                }
            }          
        });
        
        group.add(jDateChooser1.getDateEditor().getUiComponent(), new AbstractValidator<String>(String.class) {
            @Override
            public void validate(Problems prblms, String string, String t) {
                if (t.isEmpty() || t.isBlank()) {
                    prblms.add("Es necesario introducir una fecha");
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
    
    private void registrar() {
        String city = jTextField1.getText(); 
        Date fecha = jDateChooser1.getDate();
        String[] urls = {"/examen/gui/img/invierno.png"
                ,"/examen/gui/img/primavera.png"
                ,"/examen/gui/img/verano.png"
                ,"/examen/gui/img/otonio.png"
        }; 
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy"); 
        String fechaStr = format.format(fecha); 
        
        int mes = fecha.getMonth(); 
        String estacion = "";
        
        if (mes == 11) {
            if (fecha.getDay() > 20) {
                estacion = "Invierno";
                ppl.updateIcon(urls[0]);

            } else {
                estacion = "Otoño";
                ppl.updateIcon(urls[3]);

            }
        }
        
        if (mes == 0 || mes == 1) {
            estacion = "Invierno";
            ppl.updateIcon(urls[0]);

        }
        
        if (mes == 2 && fecha.getDay() > 20) {
            if (fecha.getDay() > 20) {
                estacion = "Primavera"; 
                ppl.updateIcon(urls[1]);
            } else {
                estacion = "Invierno";
                ppl.updateIcon(urls[0]);
            }
        }
        
        if (mes == 3 || mes == 4) {
            estacion = "Primavera"; 
            ppl.updateIcon(urls[1]);
        }
        
        if (mes == 5) {
            if (fecha.getDay() > 20) {
                estacion = "Verano";
                ppl.updateIcon(urls[2]);
            } else {
                estacion = "Primavera"; 
                ppl.updateIcon(urls[1]);
            }
        }
        
        if (mes == 6 || mes == 7) {
            estacion = "Verano";
            ppl.updateIcon(urls[2]);

        }
        
        if (mes == 8) {
            if (fecha.getDay() > 20) {
                estacion = "Otoño";
                ppl.updateIcon(urls[3]);

            } else {
                estacion = "Verano";
                ppl.updateIcon(urls[2]);

            }
        }
        
        if (mes == 9 || mes == 10) {
            estacion = "Otoño"; 
            ppl.updateIcon(urls[3]);
        }

        Object[] row = {city, fechaStr, estacion, null, null, null};       
        ppl.addToTable(row);   
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
                CiudadyFecha dialog = new CiudadyFecha(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel1;
    // End of variables declaration//GEN-END:variables
}
