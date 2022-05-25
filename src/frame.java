
import javax.swing.table.DefaultTableModel;


public class frame extends javax.swing.JFrame implements Mensajero {

    Monitor monitor;
    Productor p;
    Consumidor c;
    
    int productor;
    int consumidor;
    
    String tiempo[] = {".5", "1.0", "2.0"};
    boolean primerCorrida = true;
    
    DefaultTableModel modelo;
    
    public frame() {
        initComponents();
        
        generarTabla();
        notificaciones.setText("");
        
        monitor = new Monitor();
        int tiempoInicialAgregar = (int) (Math.random() * this.tiempo.length);
        int tiempoInicialRetirar = (int) (Math.random() * this.tiempo.length);
        cb_segundosAgregar.setSelectedIndex(tiempoInicialAgregar);
        cb_segundosRetirar.setSelectedIndex(tiempoInicialRetirar);
        
        p = new Productor(monitor,Double.parseDouble(this.tiempo[tiempoInicialAgregar]) , this);
        productor = 0;
        c = new Consumidor(monitor,Double.parseDouble(this.tiempo[tiempoInicialRetirar]) , this);
        consumidor = 0;
        
        p.start();
        c.start();
        
        primerCorrida = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_segundosAgregar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_segundosRetirar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        notificaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_segundosAgregar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".5", "1", "2" }));
        cb_segundosAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_segundosAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Agregar auto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("segundos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Retirar auto");

        cb_segundosRetirar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".5", "1", "2" }));
        cb_segundosRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_segundosRetirarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("segundos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ESTACIONAMIENTO");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        notificaciones.setColumns(20);
        notificaciones.setRows(5);
        jScrollPane1.setViewportView(notificaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_segundosRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_segundosAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_segundosAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_segundosRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void generarTabla(){
        modelo = new DefaultTableModel();
        String[] titulos = new String[]{"Cajón", "Info"};
        modelo.setColumnIdentifiers(titulos);
        for(int i = 1; i < 13; i++){
            modelo.addRow(new Object[]{"Estacionamiento " + i});   
        }
        tabla.setModel(modelo);
        for(int i = 0; i < 12; i++){
            tabla.setValueAt("Disponible", i, 1);
        }
    }
    
    public final void limpiarNotificacion(){
        notificaciones.setText("");
    }
    
    private void cb_segundosAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_segundosAgregarActionPerformed
        if(!primerCorrida){
            this.p.cambiarTiempo(Double.parseDouble((String) cb_segundosAgregar.getSelectedItem()));
        }
    }//GEN-LAST:event_cb_segundosAgregarActionPerformed

    private void cb_segundosRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_segundosRetirarActionPerformed
        if(!primerCorrida){
            this.c.cambiarTiempo(Double.parseDouble((String) cb_segundosRetirar.getSelectedItem()));
        }
    }//GEN-LAST:event_cb_segundosRetirarActionPerformed

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_segundosAgregar;
    private javax.swing.JComboBox<String> cb_segundosRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea notificaciones;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void agregarCarroTabla(String mensaje) {
        switch (Integer.parseInt(mensaje)) {
            case 1: tabla.setValueAt("Ocupado", 0, 1); break;
            case 2: tabla.setValueAt("Ocupado", 1, 1); break;
            case 3: tabla.setValueAt("Ocupado", 2, 1); break;
            case 4: tabla.setValueAt("Ocupado", 3, 1); break;
            case 5: tabla.setValueAt("Ocupado", 4, 1); break;
            case 6: tabla.setValueAt("Ocupado", 5, 1); break;
            case 7: tabla.setValueAt("Ocupado", 6, 1); break;
            case 8: tabla.setValueAt("Ocupado", 7, 1); break;
            case 9: tabla.setValueAt("Ocupado", 8, 1); break;
            case 10: tabla.setValueAt("Ocupado", 9, 1);break;
            case 11: tabla.setValueAt("Ocupado", 10, 1); limpiarNotificacion(); break;
            case 12: tabla.setValueAt("Ocupado", 11, 1); notificaciones.setText("EL ESTACIONAMIENTO ESTA LLENO"); break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void removerCarroTabla(String mensaje) {
         switch (Integer.parseInt(mensaje)) {
            case 0: tabla.setValueAt("Disponible", 0, 1); notificaciones.setText("EL ESTACIONAMIENTO ESTA VACIO"); break;
            case 1: tabla.setValueAt("Disponible", 1, 1); limpiarNotificacion(); break;
            case 2: tabla.setValueAt("Disponible", 2, 1); limpiarNotificacion(); break;
            case 3: tabla.setValueAt("Disponible", 3, 1); limpiarNotificacion(); break;
            case 4: tabla.setValueAt("Disponible", 4, 1); limpiarNotificacion(); break;
            case 5: tabla.setValueAt("Disponible", 5, 1); limpiarNotificacion(); break;
            case 6: tabla.setValueAt("Disponible", 6, 1); limpiarNotificacion(); break;
            case 7: tabla.setValueAt("Disponible", 7, 1); limpiarNotificacion(); break;
            case 8: tabla.setValueAt("Disponible", 8, 1); limpiarNotificacion(); break;
            case 9: tabla.setValueAt("Disponible", 9, 1); limpiarNotificacion(); break;
            case 10: tabla.setValueAt("Disponible", 10, 1); limpiarNotificacion(); break;
            case 11: tabla.setValueAt("Disponible", 11, 1); break;
            default:
                throw new AssertionError();
        }
    }
}
