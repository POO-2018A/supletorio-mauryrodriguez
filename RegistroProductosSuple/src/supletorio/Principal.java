package supletorio;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    ArrayList<Object> productos = new ArrayList<>();
    ClsControlador controlador = new ClsControlador();
    ArrayList<String> caracteristicas = new ArrayList<>();
    
    public Principal() {
        initComponents();
        getContentPane().setBackground(Color.green);
        productos = controlador.extraerObjetos("productos.dat");
        llenarGrid();
        
        lblTipo.setVisible(false);
        lblCapacidad.setVisible(false);
        lblRam.setVisible(false);
        lblProcesador.setVisible(false);
        lblColor.setVisible(false);
        lblVelocidad.setVisible(false);
        
        txtTipo.setVisible(false);
        txtCapacidad.setVisible(false);
        txtRam.setVisible(false);
        txtProcesador.setVisible(false);
        txtColor.setVisible(false);
        txtVelocidad.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        lblMarcaProducto = new javax.swing.JLabel();
        lblCategoriaProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtMarcaProducto = new javax.swing.JTextField();
        cmbCategoriaProducto = new javax.swing.JComboBox<>();
        panel2 = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        lblCapacidad = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        lblProcesador = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtProcesador = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtVelocidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnAñadirProducto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("EucrosiaUPC", 2, 24)); // NOI18N
        jLabel1.setText("PRODUCTOS A REGISTRAR......MAURY COMPANY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 20));

        panel1.setForeground(new java.awt.Color(204, 204, 255));

        lblNombreProducto.setText("Nombre:");

        lblPrecioProducto.setText("Precio:");

        lblMarcaProducto.setText("Marca:");

        lblCategoriaProducto.setText("Categoria:");

        cmbCategoriaProducto.setForeground(new java.awt.Color(51, 51, 255));
        cmbCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTADOR", "ACCESORIO", "COMPONENTE" }));
        cmbCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(lblCategoriaProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMarcaProducto))
                        .addContainerGap(102, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(lblPrecioProducto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(lblNombreProducto)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoriaProducto)
                    .addComponent(cmbCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProducto)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioProducto)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarcaProducto)
                    .addComponent(txtMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblTipo.setText("Tipo:");

        lblCapacidad.setText("Capacidad:");

        lblRam.setText("Ram:");

        lblProcesador.setText("Procesador");

        lblColor.setText("Color:");

        lblVelocidad.setText("Velocidad:");

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(35, 35, 35)
                        .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCapacidad)
                            .addComponent(lblRam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapacidad)
                            .addComponent(txtRam)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblProcesador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProcesador)))
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblColor)
                        .addGap(38, 38, 38)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblVelocidad)
                        .addGap(18, 18, 18)
                        .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(lblColor)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidad)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelocidad)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRam)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProcesador)
                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        tbProductos.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Marca", "Categoria", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProductos.setSelectionBackground(new java.awt.Color(204, 153, 0));
        jScrollPane2.setViewportView(tbProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 680, 140));

        btnAñadirProducto.setText("Añadir Producto");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 70, -1));

        jLabel2.setText("Suple_Rodriguez_Mauricio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaProductoActionPerformed
        if(cmbCategoriaProducto.getSelectedItem().equals("COMPUTADOR")){

            lblTipo.setVisible(true);
            lblCapacidad.setVisible(true);
            lblRam.setVisible(true);
            lblProcesador.setVisible(true);
            lblColor.setVisible(false);
            lblVelocidad.setVisible(false);

            txtTipo.setVisible(true);
            txtCapacidad.setVisible(true);
            txtRam.setVisible(true);
            txtProcesador.setVisible(true);
            txtColor.setVisible(false);
            txtVelocidad.setVisible(false);
            
        }else if(cmbCategoriaProducto.getSelectedItem().equals("ACCESORIO")){

            lblTipo.setVisible(true);
            lblCapacidad.setVisible(false);
            lblRam.setVisible(false);
            lblProcesador.setVisible(false);
            lblColor.setVisible(true);
            lblVelocidad.setVisible(false);

            txtTipo.setVisible(true);
            txtCapacidad.setVisible(false);
            txtRam.setVisible(false);
            txtProcesador.setVisible(false);
            txtColor.setVisible(true);
            txtVelocidad.setVisible(false);
        }else if(cmbCategoriaProducto.getSelectedItem().equals("COMPONENTE")){

            lblTipo.setVisible(true);
            lblCapacidad.setVisible(true);
            lblRam.setVisible(false);
            lblProcesador.setVisible(false);
            lblColor.setVisible(false);
            lblVelocidad.setVisible(true);

            txtTipo.setVisible(true);
            txtCapacidad.setVisible(true);
            txtRam.setVisible(false);
            txtProcesador.setVisible(false);
            txtColor.setVisible(false);
            txtVelocidad.setVisible(true);
        }
    }//GEN-LAST:event_cmbCategoriaProductoActionPerformed

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        if (cmbCategoriaProducto.getSelectedItem().equals("COMPUTADOR")) {

            caracteristicas.add(" " + txtTipo.getText() + " " + "Capacidad:" + txtCapacidad.getText() + " " + "Ram:" + txtRam.getText() + " " + "Procesador:" + txtProcesador.getText());

        } else if (cmbCategoriaProducto.getSelectedItem().equals("ACCESORIO")) {

            caracteristicas.add(" " + txtTipo.getText() + " " + "Color:" + txtColor.getText());

        } else if (cmbCategoriaProducto.getSelectedItem().equals("COMPONENTE")) {

            caracteristicas.add(" " + txtTipo.getText() + " " + "Capacidad:" + txtCapacidad.getText() + " " + "Velocidad:" + txtVelocidad.getText());
        }

        ClsProducto producto = new ClsProducto(txtNombreProducto.getText(), Double.parseDouble(txtPrecioProducto.getText()), txtMarcaProducto.getText(), (String) cmbCategoriaProducto.getSelectedItem(), caracteristicas);
        productos.add(producto);
        controlador.escribirObjeto("productos.dat", productos);
        productos = controlador.extraerObjetos("productos.dat");
        limpiar();
        Object prodcutoT[] = {producto.getNombre(), producto.getPrecio(), producto.getMarca(), producto.getCategoria(), producto.getDetalles()};
        DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
        model.addRow(prodcutoT);
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
        int numero_caracteres = 10;
        if (txtCapacidad.getText().length() >= numero_caracteres) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
        int numero_caracteres = 10;
        if (txtCapacidad.getText().length() >= numero_caracteres) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRamKeyTyped

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
 
    public void llenarGrid(){
        if(productos.size() > 0){
            ClsProducto product = new ClsProducto();
            DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
            for(int i = 0; i < productos.size(); i ++){
                product = (ClsProducto) productos.get(i);
                Object productoT [] = {product.getNombre(), product.getPrecio(), product.getMarca(), product.getCategoria(), product.getDetalles()};
                model.insertRow(i, productoT);
            }
        }
    }

    
    
    public void limpiar(){
        txtNombreProducto.setText(null);
        txtPrecioProducto.setText(null);
        txtMarcaProducto.setText(null);
        
        txtTipo.setText(null);
        txtCapacidad.setText(null);
        txtRam.setText(null);
        txtProcesador.setText(null);
        txtColor.setText(null);
        txtVelocidad.setText(null);
        
        lblTipo.setVisible(false);
        lblCapacidad.setVisible(false);
        lblRam.setVisible(false);
        lblProcesador.setVisible(false);
        lblColor.setVisible(false);
        lblVelocidad.setVisible(false);
        
        txtTipo.setVisible(false);
        txtCapacidad.setVisible(false);
        txtRam.setVisible(false);
        txtProcesador.setVisible(false);
        txtColor.setVisible(false);
        txtVelocidad.setVisible(false);

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCategoriaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblCategoriaProducto;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarcaProducto;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarcaProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
