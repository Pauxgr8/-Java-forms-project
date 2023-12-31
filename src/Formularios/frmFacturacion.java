

package Formularios;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.*;
import java.time.LocalDate;
import java.awt.event.ItemEvent;
  


public class frmFacturacion extends javax.swing.JInternalFrame {
    
 private int CodCliente=0 ;
 private String Nombre= ""; 
 private ArrayList<Integer> ListaClientes = new ArrayList<Integer>();
 

 private ArrayList<Integer> ListaCodGeneros = new ArrayList<Integer>();
 private ArrayList<String> ListaDesGeneros = new ArrayList<String>();
 private int CodGenero = 0;
 private int CodGeneroSeleccionado = 0;
 private int Posicion = 0;
 private String DesGenero= ""; 
 
 
 private ArrayList<Integer> ListaCodPeliculas = new ArrayList<Integer>();
 private ArrayList<String> ListaDesPeliculas = new ArrayList<String>();
 private ArrayList<Integer> ListaCodPrecios = new ArrayList<Integer>();
 private int CodPelicula = 0;
 private int Precio = 0;
 private String DesPelicula; 
 private boolean cmbPeliculasCargado = false;
 
 
 
 DefaultTableModel ModeloTabla = new DefaultTableModel();
 
 private double SubTotal=0 , Descuento=0 , Total=0 ;
 private int NumFactura = 0 , Monto;

  
    public frmFacturacion() {
        initComponents();
        
        CargarComboClientes();
        CargarComboGenero();
        
        
        ModeloTabla.addColumn("CodPelicula");
        ModeloTabla.addColumn("Descripcion de Pelicula");
        ModeloTabla.addColumn("Precio");
        ModeloTabla.addColumn("Monto");
        Tabla.setModel(ModeloTabla);
        
        TableColumnModel columnModel = Tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(400);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmbCodGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbCodCliente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbCodPeliculas = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAlquilar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Facturacion");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Cliente");

        cmbCodGenero.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbCodGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodGeneroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Genero");

        cmbCodCliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Peliculas ");

        cmbCodPeliculas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbCodPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodPeliculasActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar 32x32.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtDescuento.setEditable(false);
        txtDescuento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtDescuento.setToolTipText("");

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSubtotal.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setToolTipText("");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTotal.setToolTipText("");

        btnAlquilar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnAlquilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comprar 46x46.png"))); // NOI18N
        btnAlquilar.setText("Alquilar");
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Impresora Gris 46x46.png"))); // NOI18N
        btnImprimir.setText("Imprimir ");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jCheckBox1.setText("Ciudadano de oro");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("Subtotal");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Descuento");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("Total");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnAlquilar)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(254, 254, 254))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCodGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCodCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCodPeliculas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnLimpiar)))
                        .addGap(36, 36, 36)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(157, 157, 157))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCodGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCodPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jLabel6)
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCodGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodGeneroActionPerformed
        CargarComboPeliculas();
    }//GEN-LAST:event_cmbCodGeneroActionPerformed

    private void cmbCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCodClienteActionPerformed

    private void cmbCodPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodPeliculasActionPerformed
         if ( cmbPeliculasCargado == true )
            {
            // localiza el Precio del artículo seleccionado
            Posicion = cmbCodCliente.getSelectedIndex();
            Precio = ListaCodPrecios.get(Posicion);
//            txtCantidad.setText(String.valueOf(Precio));
            }
    }//GEN-LAST:event_cmbCodPeliculasActionPerformed

    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed

            Monto  = Precio * Integer.parseInt( txtCantidad.getText() ) ;
            
            // se necesita un Vector (Array) para pasar los datos
            String Fila[] = new String[4];
            Fila[0] = txtCantidad.getText();
            Fila[1] = cmbArticulos.getSelectedItem().toString();
            Fila[2] = String.valueOf(Precio);
            Fila[3] = String.valueOf(Monto);
            ModeloTabla.addRow(Fila);
            
            // realiza cálculos finales
            SubTotal = SubTotal + Monto ;
            Descuento = 0 ;
            if ( SubTotal >= 30000 )
                { Descuento = SubTotal * 0.05 ; }
            Total = SubTotal - Descuento ;
            // despliega los cálculos finales
            txtSubTotal.setText(String.valueOf(SubTotal));
            txtDescuento.setText(String.valueOf(Descuento));
            txtTotal.setText(String.valueOf(Total));
            }
    }//GEN-LAST:event_btnAlquilarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         Limpiar();  
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void Limpiar() {
       txtDescuento.setText("");
       txtSubtotal.setText("");
       txtTotal.setText("");
       SubTotal = 0 ;
       Descuento= 0 ;
       Total = 0 ;
       ModeloTabla.setRowCount(0);
       cmbCodCliente.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbCodCliente;
    private javax.swing.JComboBox<String> cmbCodGenero;
    private javax.swing.JComboBox<String> cmbCodPeliculas;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void CargarComboGenero() {
      File archivo = new File("src\\Archivos\\Genero.txt\\");
      FileReader leer;
      BufferedReader linea;
      String Texto; 
      
        try {
            leer = new FileReader(archivo);
            linea = new BufferedReader(leer);
            Texto = "";
            while (Texto != null)
            {
                try {
                    Texto = linea.readLine();
                    if (Texto != null)
                    {
                       SeparaValoresGeneros(Texto);
                       cmbCodGenero.addItem(DesGenero);
                       ListaCodGeneros.add(CodGenero);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(frmFacturacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SeparaValoresGeneros(String Texto) {
         String Vector[] = Texto.split(",");
         CodGenero = Integer.parseInt(Vector[0]);
         DesGenero = Vector[1];
    }

    private void CargarComboClientes() {
      File archivo = new File("src\\Archivos\\Clientes.txt\\");
      FileReader leer;
      BufferedReader linea;
      String Texto; 
      
        try {
            leer = new FileReader(archivo);
            linea = new BufferedReader(leer);
            Texto = "";
            while (Texto != null)
            {
                try {
                    Texto = linea.readLine();
                    if (Texto != null)
                    {
                       SeparaValoresClientes(Texto);
                       ListaClientes.add(CodCliente);
                       cmbCodCliente.addItem(Nombre);
                      
                    }
                } catch (IOException ex) {
                    Logger.getLogger(frmFacturacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    private void SeparaValoresClientes(String Texto) {
       String Vector[] = Texto.split(",");
       CodCliente = Integer.parseInt(Vector[0]);
       Nombre = Vector[1]; 
    }

    private void CargarComboPeliculas() {
        cmbPeliculasCargado = false;
        cmbCodPeliculas.removeAllItems();
//System.out.println("cmbArticulos.removeAllItems()");        
        ListaCodPeliculas.clear();
        ListaCodPrecios.clear();
        ListaDesPeliculas.clear();
        
        
        
        DesGenero = cmbCodGenero.getSelectedItem().toString();
        Posicion = ListaDesGeneros.indexOf(DesGenero);
        CodGeneroSeleccionado = ListaCodGeneros.get(Posicion);
        
      File archivo = new File("src\\Archivos\\Peliculas.txt\\");
      FileReader leer;
      BufferedReader  almacenamiento;
      String Texto; 
      
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            Texto = "";
            while (Texto != null)
            {
                try {
                    Texto =  almacenamiento.readLine();
                    if (Texto != null)
                    {
                        SeparaValoresPeliculas(Texto);
                    if (CodGenero == CodGeneroSeleccionado )
                    {
                       
                       ListaCodPeliculas.add(CodPelicula);
                       ListaCodPrecios.add(Precio);
                       ListaDesPeliculas.add(DesPelicula);
                       cmbCodPeliculas.addItem(DesPelicula);
                       } 
                    }
                }
                  
                 
           catch (IOException ex) {
                    Logger.getLogger(frmFacturacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try 
                {
                almacenamiento.close();
                leer.close();
                }
             catch (IOException ex) 
                {
                Logger.getLogger(frmPeliculas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
         catch (FileNotFoundException ex) 
              {
            Logger.getLogger(frmPeliculas.class.getName()).log(Level.SEVERE, null, ex);
              } 
        cmbPeliculasCargado = true;
       
    }

    private void SeparaValoresPeliculas(String Texto) {
       String Vector[] = Texto.split(",");
       CodGenero = Integer.parseInt(Vector[0]);
       CodPelicula = Integer.parseInt(Vector[1]); 
       DesPelicula = Vector[2];
       Precio = Integer.parseInt(Vector[3]); 
    }

    

}
