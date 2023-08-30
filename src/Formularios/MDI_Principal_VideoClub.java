
package Formularios;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class MDI_Principal_VideoClub extends javax.swing.JFrame {

   private frmGeneros fGeneros = null ;
   
   private frmPeliculas fPeliculas = null;
   
   private frmClientes fClientes = null; 
   
   private frmFacturacion fFacturacion = null;
   
   private frmFacturas fFacturas = null; 
           
    public MDI_Principal_VideoClub() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Video Club Pir Ata");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        String ImagenFondo = "" ;
        int Segundo = (int) (System.currentTimeMillis() % 10 );
        if ( Segundo <= 3 )
        { ImagenFondo = "/Imagenes/VideoClub1.jpg" ; }
        else if ( Segundo <= 6 )
        { ImagenFondo = "/Imagenes/VideoClub2.jpg" ; }
        else 
        { ImagenFondo = "/Imagenes/VideoClub3.jpg" ; }

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/VideoClub2.jpg"));
        Image img = icon.getImage();

        Escritorio = 
        new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g)
            {
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        menuBar = new javax.swing.JMenuBar();
        mnuAlquilerPeliculas = new javax.swing.JMenu();
        mnuFacturacion = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuFacturas = new javax.swing.JMenuItem();
        mnuCatalogos = new javax.swing.JMenu();
        mnuGenero = new javax.swing.JMenuItem();
        mnuPeliculas = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuAlquilerPeliculas.setMnemonic('f');
        mnuAlquilerPeliculas.setText("Procesos");

        mnuFacturacion.setMnemonic('o');
        mnuFacturacion.setText("Facturacion");
        mnuFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFacturacionActionPerformed(evt);
            }
        });
        mnuAlquilerPeliculas.add(mnuFacturacion);

        menuBar.add(mnuAlquilerPeliculas);

        mnuConsultas.setMnemonic('e');
        mnuConsultas.setText("Consultas");
        mnuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultasActionPerformed(evt);
            }
        });

        mnuFacturas.setMnemonic('t');
        mnuFacturas.setText("Facturas");
        mnuFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFacturasActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuFacturas);

        menuBar.add(mnuConsultas);

        mnuCatalogos.setMnemonic('h');
        mnuCatalogos.setText("Catalogos");

        mnuGenero.setMnemonic('c');
        mnuGenero.setText("Generos");
        mnuGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGeneroActionPerformed(evt);
            }
        });
        mnuCatalogos.add(mnuGenero);

        mnuPeliculas.setMnemonic('a');
        mnuPeliculas.setText("Peliculas");
        mnuPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPeliculasActionPerformed(evt);
            }
        });
        mnuCatalogos.add(mnuPeliculas);

        mnuClientes.setText("Clientes");
        mnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClientesActionPerformed(evt);
            }
        });
        mnuCatalogos.add(mnuClientes);

        menuBar.add(mnuCatalogos);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPeliculasActionPerformed
        if (fPeliculas== null ||  fPeliculas.isClosed() )
       {
        fPeliculas = new frmPeliculas();
        Escritorio.add(fPeliculas); 
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = fPeliculas.getSize();
        fPeliculas.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
       }
        
        fPeliculas.toFront();
        fPeliculas.setVisible(true);
    }//GEN-LAST:event_mnuPeliculasActionPerformed

    private void mnuFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFacturacionActionPerformed
       if (fFacturacion== null ||  fFacturacion.isClosed() )
       {
        fFacturacion = new frmFacturacion();
        Escritorio.add(fFacturacion); 
        
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = fFacturacion.getSize();
        fFacturacion.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);

       }
        
        fFacturacion.toFront();
        fFacturacion.setVisible(true);
    }//GEN-LAST:event_mnuFacturacionActionPerformed

    private void mnuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultasActionPerformed
      
    }//GEN-LAST:event_mnuConsultasActionPerformed

    private void mnuFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFacturasActionPerformed
       if (fFacturas== null ||  fFacturas.isClosed() )
       {
        fFacturas = new frmFacturas();
        Escritorio.add(fFacturas); 
        
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = fFacturas.getSize();
        fFacturas.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
       }
        
        fFacturas.toFront();
        fFacturas.setVisible(true);
    }//GEN-LAST:event_mnuFacturasActionPerformed

    private void mnuGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGeneroActionPerformed
        if (fGeneros== null ||  fGeneros.isClosed() )
       {
        fGeneros = new frmGeneros();
        Escritorio.add(fGeneros); 
        
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = fGeneros.getSize();
        fGeneros.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
       }
        
        fGeneros.toFront();
        fGeneros.setVisible(true);
    }//GEN-LAST:event_mnuGeneroActionPerformed

    private void mnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClientesActionPerformed
       if (fClientes== null ||  fClientes.isClosed() )
       {
        fClientes = new frmClientes();
        Escritorio.add(fClientes); 
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = fClientes.getSize();
        fClientes.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
       }
        
        fClientes.toFront();
        fClientes.setVisible(true);
    }//GEN-LAST:event_mnuClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MDI_Principal_VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_Principal_VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_Principal_VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_Principal_VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_Principal_VideoClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAlquilerPeliculas;
    private javax.swing.JMenu mnuCatalogos;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenuItem mnuFacturacion;
    private javax.swing.JMenuItem mnuFacturas;
    private javax.swing.JMenuItem mnuGenero;
    private javax.swing.JMenuItem mnuPeliculas;
    // End of variables declaration//GEN-END:variables

}
