package practicarmi;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FramePrincipalCliente extends javax.swing.JFrame {

    public FramePrincipalCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Archivo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btn_GuardarArchivo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeStructure = new javax.swing.JTree();
        btn_CrearArchivo = new javax.swing.JButton();
        btn_CrearDirectorio = new javax.swing.JButton();
        btn_Conectar = new javax.swing.JButton();
        btn_Desconectar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        txt_Archivo.setColumns(20);
        txt_Archivo.setRows(5);
        jScrollPane1.setViewportView(txt_Archivo);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Arbol de Archivos");

        btn_GuardarArchivo.setBackground(new java.awt.Color(104, 160, 88));
        btn_GuardarArchivo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_GuardarArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_GuardarArchivo.setText("Guardar Archivo");
        btn_GuardarArchivo.setContentAreaFilled(false);
        btn_GuardarArchivo.setOpaque(true);
        btn_GuardarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GuardarArchivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GuardarArchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GuardarArchivoMouseExited(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeStructure.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeStructure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeStructureMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(treeStructure);

        btn_CrearArchivo.setBackground(new java.awt.Color(104, 160, 88));
        btn_CrearArchivo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_CrearArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_CrearArchivo.setText("Crear Archivo");
        btn_CrearArchivo.setContentAreaFilled(false);
        btn_CrearArchivo.setOpaque(true);
        btn_CrearArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrearArchivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CrearArchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CrearArchivoMouseExited(evt);
            }
        });

        btn_CrearDirectorio.setBackground(new java.awt.Color(71, 120, 197));
        btn_CrearDirectorio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_CrearDirectorio.setForeground(new java.awt.Color(255, 255, 255));
        btn_CrearDirectorio.setText("Crear Directorio");
        btn_CrearDirectorio.setContentAreaFilled(false);
        btn_CrearDirectorio.setOpaque(true);
        btn_CrearDirectorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrearDirectorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CrearDirectorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CrearDirectorioMouseExited(evt);
            }
        });

        btn_Conectar.setBackground(new java.awt.Color(104, 160, 88));
        btn_Conectar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Conectar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Conectar.setText("Conectar");
        btn_Conectar.setContentAreaFilled(false);
        btn_Conectar.setOpaque(true);
        btn_Conectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ConectarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ConectarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ConectarMouseExited(evt);
            }
        });

        btn_Desconectar.setBackground(new java.awt.Color(199, 73, 58));
        btn_Desconectar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Desconectar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Desconectar.setText("Desconectar");
        btn_Desconectar.setContentAreaFilled(false);
        btn_Desconectar.setOpaque(true);
        btn_Desconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DesconectarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DesconectarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DesconectarMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Archivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GuardarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_CrearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_CrearDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Desconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(775, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CrearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CrearDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GuardarArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Desconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jLabel3)
                    .addContainerGap(619, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarArchivoMouseClicked
       
    }//GEN-LAST:event_btn_GuardarArchivoMouseClicked

    private void btn_GuardarArchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarArchivoMouseEntered
        setColorGreenDark(btn_GuardarArchivo);
    }//GEN-LAST:event_btn_GuardarArchivoMouseEntered

    private void btn_GuardarArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarArchivoMouseExited
        setColorGreen(btn_GuardarArchivo);
    }//GEN-LAST:event_btn_GuardarArchivoMouseExited

    private void treeStructureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeStructureMouseClicked
//        try {
//            //jtreeEvents.showDataFile(treeStructure, txt_Archivo, connection, labelNombre);
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_treeStructureMouseClicked

    private void btn_CrearArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearArchivoMouseClicked

    }//GEN-LAST:event_btn_CrearArchivoMouseClicked

    private void btn_CrearArchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearArchivoMouseEntered
        setColorGreenDark(btn_CrearArchivo);
    }//GEN-LAST:event_btn_CrearArchivoMouseEntered

    private void btn_CrearArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearArchivoMouseExited
        setColorGreen(btn_CrearArchivo);
    }//GEN-LAST:event_btn_CrearArchivoMouseExited

    private void btn_CrearDirectorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearDirectorioMouseClicked

    }//GEN-LAST:event_btn_CrearDirectorioMouseClicked

    private void btn_CrearDirectorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearDirectorioMouseEntered
        setColorBlueDark(btn_CrearDirectorio);
    }//GEN-LAST:event_btn_CrearDirectorioMouseEntered

    private void btn_CrearDirectorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearDirectorioMouseExited
        setColorBlue(btn_CrearDirectorio);
    }//GEN-LAST:event_btn_CrearDirectorioMouseExited

    private void btn_ConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConectarMouseClicked

    }//GEN-LAST:event_btn_ConectarMouseClicked

    private void btn_ConectarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConectarMouseEntered
        setColorGreenDark(btn_Conectar);
    }//GEN-LAST:event_btn_ConectarMouseEntered

    private void btn_ConectarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConectarMouseExited
        setColorGreen(btn_Conectar);
    }//GEN-LAST:event_btn_ConectarMouseExited

    private void btn_DesconectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DesconectarMouseClicked

    }//GEN-LAST:event_btn_DesconectarMouseClicked

    private void btn_DesconectarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DesconectarMouseEntered
        setColorRedDark(btn_Desconectar);
    }//GEN-LAST:event_btn_DesconectarMouseEntered

    private void btn_DesconectarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DesconectarMouseExited
        setColorRed(btn_Desconectar);
    }//GEN-LAST:event_btn_DesconectarMouseExited

    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipalCliente().setVisible(true);
            }
        });
    }
    
    //Light Versions
    public void setColorBlue(JButton b){
       b.setBackground(new Color(71,120,197)); 
    }
    public void setColorRed(JButton b){
       b.setBackground(new Color(199,73,58)); 
    }
    
    public void setColorGreen(JButton b){
       b.setBackground(new Color(104,160,88)); 
    }
    //Dark Versions
    public void setColorBlueDark(JButton b){
       b.setBackground(new Color(71,105,179)); 
    }
    public void setColorRedDark(JButton b){
       b.setBackground(new Color(199,63,33)); 
    }
    public void setColorGreenDark(JButton b){
       b.setBackground(new Color(104,152,76)); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Conectar;
    private javax.swing.JButton btn_CrearArchivo;
    private javax.swing.JButton btn_CrearDirectorio;
    private javax.swing.JButton btn_Desconectar;
    private javax.swing.JButton btn_GuardarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTree treeStructure;
    private javax.swing.JTextArea txt_Archivo;
    // End of variables declaration//GEN-END:variables
}
