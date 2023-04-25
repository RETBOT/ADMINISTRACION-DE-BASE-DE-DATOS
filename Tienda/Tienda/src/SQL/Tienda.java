package SQL;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tienda extends javax.swing.JFrame {
    // Clase para la conexión de la base de datos 
    Conexion c = new Conexion();
    // Modelo de la tabla 
    DefaultTableModel modelo;
    
    String DB = "tienda";
    
    public Tienda() {
        initComponents();
        // Se le ingresa el modelo de la tabla jtProductos
         modelo = (DefaultTableModel)jtProductos.getModel();
    }
    
    // Método para limpiar los jtext
    private void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNombreDB = new javax.swing.JTextField();
        btnCrearDB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCrearTabla = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCambiarDB = new javax.swing.JTextField();
        btnCrearDB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tienda");

        jLabel5.setText("Código producto:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad"
            }
        ));
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Código");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Precio");

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Herramientas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 153, 255))); // NOI18N

        jLabel7.setText("Todos los productos:");

        btnProductos.setText("Buscar");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        jLabel8.setText("Crear Base de datos: ");

        txtNombreDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDBActionPerformed(evt);
            }
        });

        btnCrearDB.setText("Crear");
        btnCrearDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDBActionPerformed(evt);
            }
        });

        jLabel9.setText("Crear Tabla: ");

        btnCrearTabla.setText("Crear");
        btnCrearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTablaActionPerformed(evt);
            }
        });

        jLabel10.setText("Cambiar de Base de datos:");

        btnCrearDB1.setText("Cambiar");
        btnCrearDB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtNombreDB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrearDB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCambiarDB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrearDB1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductos)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearDB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnCrearTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCambiarDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearDB1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método creado para la búsqueda de Productos por código
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // El txtCampo contiene información, entra en el if
        if (txtCampo.getText().length() > 0) {
            // Obtiene el texto 
            String campo = txtCampo.getText();
            
            try {
                // Se eliminan los datos de la tabla 
                modelo.setRowCount(0);
                // Conecta a la base de datos 
                c.ConectarBasedeDatos();
                
                // Y generar la sentencia sql para la consulta
                String sql = "use "+DB+" "
                        + "SELECT codigo, nombre, precio, cantidad FROM producto WHERE codigo = '" + campo + "'";
                // Se ejecuta la sentencia y se obtiene el resultado
                c.resultado = c.sentencia.executeQuery(sql);
                
                // Tamaño de columna de la tabla
                int[] anchos = {50, 200, 50, 50};
                for (int i = 0; i < jtProductos.getColumnCount(); i++) {
                    jtProductos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }
                
                //Entra en el while y pone los resultados en su respectiva columna 
                while (c.resultado.next()) {
                    Object[] filas = new Object[4];
                    for (int i = 0; i < 4; i++) {
                        filas[i] = c.resultado.getObject(i + 1);
                    }
                    modelo.addRow(filas); // y lo agrega a la tabla
                }
                c.DesconectarBasedeDatos(); // Por último desconectamos la base de datos
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.toString()); // en caso de tener algun error 
            }
        } else { // Si no ingresamos nada en el txtCampo
            JOptionPane.showMessageDialog(null, "Ingresa un Código");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    // Método creado para obtener los datos y ponerlos en su respectivo jText
    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        try {
            // Conecta a la base de datos 
            c.ConectarBasedeDatos();
            // Obtenemos las fila
            int Fila = jtProductos.getSelectedRow();
            // Obtiene el producto seleccionado por el mouse 
            String codigo = jtProductos.getValueAt(Fila, 0).toString();
            // Creamos la sentencia 
            String sql = "use "+DB+" "
            + "SELECT codigo, nombre, precio, cantidad FROM producto WHERE codigo="+codigo;
            // La ejecutamos
            c.resultado = c.sentencia.executeQuery(sql);
            
            // Y lo pone en los jText
            while (c.resultado.next()) {
                txtCodigo.setText(c.resultado.getString("codigo"));
                txtNombre.setText(c.resultado.getString("nombre"));
                txtPrecio.setText(c.resultado.getString("precio"));
                txtCantidad.setText(c.resultado.getString("cantidad"));
            }
            // Desconecta la base de datos
            c.DesconectarBasedeDatos();
        } catch (SQLException ex) { // en caso de tener un error lo notifica
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_jtProductosMouseClicked

    //  Método creado para guardar la información del producto
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtNombre.getText().length() > 0 && txtPrecio.getText().length() > 0
        && txtCantidad.getText().length() > 0 && txtCodigo.getText().length() > 0){
        try {
            // Conectamos a la base de datos 
            c.ConectarBasedeDatos();
            // Generamos la sentencia sql, con los datos ingresados de los txt
            String sql = "use "+DB+" "
            + "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES ("
            + "'"+txtCodigo.getText()+"',"
            + "'"+txtNombre.getText()+"',"
            + "'"+txtPrecio.getText()+"',"
            + ""+txtCantidad.getText()+");";

            // Se ejecuta la sentencia 
             c.sentencia.execute(sql);
             
             // Si se ejecutó correctamente, entonces notifica al usuario
            JOptionPane.showMessageDialog(null, "Producto Guardado");
            
            // Creamos un arreglo 
            Object[] fila = new Object[4];
            // Para almacenar los datos ingresados 
            fila[0] = txtCodigo.getText();
            fila[1] = txtNombre.getText();
            fila[2] = txtPrecio.getText();
            fila[3] = txtCantidad.getText();
            // Y después los ingresamos a la tabla
            modelo.addRow(fila);
            // borra los datos de los jText
            limpiar();
           // se desconecta de la base de datos para evitar errores
         c.DesconectarBasedeDatos();
        } catch (SQLException ex) { // En caso de tener un error, lo notifica al usuario.
           JOptionPane.showMessageDialog(null, "Error al Guardar Producto");
            System.out.println(ex);
        }
        }else{
         JOptionPane.showMessageDialog(null, "Llena los todos los campos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
   
   //  Método creado para modificar la información del producto
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // se indica la fila a modificar
        
        if(txtNombre.getText().length() > 0 && txtPrecio.getText().length() > 0
        && txtCantidad.getText().length() > 0 && txtCodigo.getText().length() > 0){
            // Obtenemos las fila
            int Fila = jtProductos.getSelectedRow();
            // Obtiene el codigo seleccionado por el mouse 
            String codigo = jtProductos.getValueAt(Fila, 0).toString();
        try {
            // Conectamos a la base de datos 
            c.ConectarBasedeDatos();
            // Generamos la sentencia sql, con los datos ingresados de los txt
            String sql = "use "+DB+" "
                    + "UPDATE producto SET "
                    + "nombre='"+ txtNombre.getText()+"', "
                    + "precio='"+ txtPrecio.getText()+"', "
                    + "codigo='"+ txtCodigo.getText()+"', "
                    + "cantidad="+ txtCantidad.getText()+" "
                    + "WHERE codigo='"+ codigo+"'";
            // Se ejecuta la sentencia 
             c.sentencia.execute(sql);
            // Si se ejecutó correctamente, entonces notifica al usuario
            JOptionPane.showMessageDialog(null, "Producto Modificado");
            // Y después los ingresamos a la tabla
            jtProductos.setValueAt(txtCodigo.getText(), Fila, 0);
            jtProductos.setValueAt(txtNombre.getText(), Fila, 1);
            jtProductos.setValueAt(txtPrecio.getText(), Fila, 2);
            jtProductos.setValueAt(txtCantidad.getText(), Fila, 3);
            
            // borra los datos de los jText
            limpiar();
           // se desconecta de la base de datos para evitar errores
            c.DesconectarBasedeDatos();
        } catch (SQLException ex) {
            // En caso de tener un error, lo notifica al usuario.
            JOptionPane.showMessageDialog(null, "Error al Modificar Producto");
             System.out.println(ex);
        }
        }else{
         JOptionPane.showMessageDialog(null, "Llena los todos los campos");
        }
    }//GEN-LAST:event_btnModificarActionPerformed
//  Método creado para eliminar la información del producto
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            // Conectamos a la base de datos 
            c.ConectarBasedeDatos();
            // Obtenemos las fila
            int Fila = jtProductos.getSelectedRow();
           // Obtiene el producto seleccionado por el mouse 
            String codigo = jtProductos.getValueAt(Fila, 0).toString();
             // Generamos la sentencia sql, con los datos ingresados del producto
            String sql = "use "+DB+" DELETE FROM producto WHERE codigo= '"+codigo+"'";
            // Se ejecuta la sentencia 
            c.sentencia.execute(sql);
            // se elimina de la tabla 
            modelo.removeRow(Fila);
            // Si se ejecutó correctamente, entonces notifica al usuario
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
             // borra los datos de los jText
            limpiar();
           // se desconecta de la base de datos para evitar errores
            c.DesconectarBasedeDatos();
        } catch (SQLException ex) {
            // En caso de tener un error, lo notifica al usuario.
            JOptionPane.showMessageDialog(null, "Error al Eliminar Producto");
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        try {
            // Se eliminan los datos
            modelo.setRowCount(0);
            // Conectamos a la base de datos 
            c.ConectarBasedeDatos();
             // Generamos la sentencia sql para generar todos los productos
            String sql = "use "+DB+" "+
            "SELECT codigo, nombre, precio, cantidad FROM producto ";
            // Se ejecuta la sentencia  
            c.resultado = c.sentencia.executeQuery(sql);
            
            // Tamaño de columna de la tabla
            int[] anchos = {50, 200, 50, 50};
            for (int i = 0; i < jtProductos.getColumnCount(); i++) {
                jtProductos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            //Entra en el while y pone los resultados en su respectiva columna 
            while (c.resultado.next()) {
                Object[] filas = new Object[4];
                for (int i = 0; i < 4; i++) {
                    filas[i] = c.resultado.getObject(i + 1);
                }
                modelo.addRow(filas); // y lo agrega a la tabla
            }
            // se desconecta de la base de datos para evitar errores
            c.DesconectarBasedeDatos();
        } catch (Exception ex) {
            // En caso de tener un error, lo notifica.
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnCrearDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDBActionPerformed
        
        if(txtNombreDB.getText().length() > 0){
             DB = txtNombreDB.getText();
        }else{
            txtNombreDB.setText(DB);
        }
        
        try {
            // Se eliminan los datos
            modelo.setRowCount(0);
            // Conectamos a la base de datos 
            c.ConectarBasedeDatos();
             // Generamos la sentencia sql para generar todos los productos
            String sql = "create database " + DB;
           
            // Se ejecuta la sentencia  
            c.sentencia.execute(sql);
            JOptionPane.showMessageDialog(null,"Se creó correctamente la Base de datos "+DB);
            // se desconecta de la base de datos para evitar errores
            c.DesconectarBasedeDatos();
        } catch (Exception ex) {
            // En caso de tener un error, lo notifica.
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        
    }//GEN-LAST:event_btnCrearDBActionPerformed

    private void btnCrearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTablaActionPerformed
         try {
            // Se eliminan los datos
            modelo.setRowCount(0);
            // Conectamos a la base de datos 
            c.ConectarBasedeDatos();
             // Generamos la sentencia sql para generar todos los productos
            String sql = "use "+DB+" "
                    + "CREATE TABLE producto ( "
                    + "id int NOT NULL IDENTITY(1,1) PRIMARY KEY," 
                    + "codigo varchar(20) NOT NULL," 
                    + "nombre varchar(50) NOT NULL," 
                    + "precio decimal(10,2) NOT NULL," 
                    + "cantidad int NOT NULL);";
            
            // Se ejecuta la sentencia  
            c.sentencia.execute(sql);
            JOptionPane.showMessageDialog(null,"Se creó correctamente la tabla producto");
            // se desconecta de la base de datos para evitar errores
            c.DesconectarBasedeDatos();
        } catch (Exception ex) {
            // En caso de tener un error, lo notifica.
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_btnCrearTablaActionPerformed

    private void btnCrearDB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDB1ActionPerformed
        // TODO add your handling code here:
        if(txtCambiarDB.getText().length() > 0){
         DB = txtCambiarDB.getText();
         JOptionPane.showMessageDialog(null, "Estás en -> "+DB);
         
        }
        else {
           JOptionPane.showMessageDialog(null, "Introduce un valor");
           JOptionPane.showMessageDialog(null, "Estás en -> "+DB);
        }
    }//GEN-LAST:event_btnCrearDB1ActionPerformed

    private void txtNombreDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDBActionPerformed

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearDB;
    private javax.swing.JButton btnCrearDB1;
    private javax.swing.JButton btnCrearTabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnProductos;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField txtCambiarDB;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDB;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
