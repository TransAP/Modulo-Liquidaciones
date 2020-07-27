/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SISTEMAS
 */
public class listarLiquidaciones extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;
    conexion conexionBase = new conexion();
    Connection con = null;
    
    String sw="1";
    String drives = "";
    
    int sw2=0;
    
    int boton;//guarda el valor de un boton de listado presionado
    
    
    public listarLiquidaciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLiquidaciones = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        cbRuta = new javax.swing.JComboBox<>();
        btnGeneral = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtGestion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbGestion = new javax.swing.JComboBox<>();
        btnReparar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("LISTADO");

        tbLiquidaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbLiquidaciones);

        btnListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        cbRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NACIONAL", "INTERNACIONAL", "CISTERNAS", "COBIJA", "GUAYARAMERIN" }));
        cbRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRutaActionPerformed(evt);
            }
        });

        btnGeneral.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGeneral.setText("LISTADO GENERAL");
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("PLACA");

        txtGestion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtGestion.setText("TODAS LAS GESTIONES");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("RUTA");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("GESTION");

        cbGestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODO", "2020", "2019" }));

        btnReparar.setText("REPARAR");
        btnReparar.setEnabled(false);
        btnReparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepararActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImprimir)
                                .addGap(495, 495, 495))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGestion)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbGestion, 0, 183, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReparar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPlaca)
                                    .addComponent(cbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtGestion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnNuevo)
                            .addComponent(btnImprimir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(cbGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListar)
                            .addComponent(cbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnGeneral))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReparar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo =new DefaultTableModel();
        tbLiquidaciones.setModel(modelo);
        boton=3;
        drives="";
        
        String gestion = (String)cbGestion.getSelectedItem();
        
        try{                                            
            con = conexionBase.getConection();
            
            String sql = "";
            if(gestion=="TODO"){
                sql = "SELECT correlativo, fecha, fecha_pago_real, empresa, propietario, chofer, placa, cliente, drives, liquido_pagable FROM comprobante WHERE ruta=? AND estado='activo'";
                ps = con.prepareStatement(sql);
                ps.setString(1, sw);
                rs = ps.executeQuery();
            }else{
                sql = "SELECT correlativo, fecha, fecha_pago_real, empresa, propietario, chofer, placa, cliente, drives, liquido_pagable FROM comprobante WHERE ruta=? AND gestion=? AND estado='activo'";
                ps = con.prepareStatement(sql);
                ps.setString(1, sw);
                ps.setString(2, gestion);
                rs = ps.executeQuery();
            }                        
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
                    
            modelo.addColumn("CORRELATIVO");
            modelo.addColumn("FECHA");
            modelo.addColumn("FECHA PAGO");
            modelo.addColumn("EMPRESA");
            modelo.addColumn("PROPIETARIO");
            modelo.addColumn("CHOFER");
            modelo.addColumn("PLACA");
            modelo.addColumn("CLIENTE");
            modelo.addColumn("DRIVE");
            modelo.addColumn("PAGO");
            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i < cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                
                modelo.addRow(filas);
            }
            txtGestion.setText("GESTION "+gestion);
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        tbLiquidaciones.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(1).setPreferredWidth(40);
        tbLiquidaciones.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbLiquidaciones.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbLiquidaciones.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbLiquidaciones.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbLiquidaciones.getColumnModel().getColumn(6).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(7).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(8).setPreferredWidth(5);
    }//GEN-LAST:event_btnListarActionPerformed

    private void cbRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRutaActionPerformed
        String cadena = cbRuta.getSelectedItem().toString();
        if(cadena=="NACIONAL"){
            sw="1";
        } else{
            if(cadena=="INTERNACIONAL"){
                sw="2";
            }else{
                if(cadena=="CISTERNAS"){
                    sw="3";
                }else{
                    if(cadena=="COBIJA"){
                        sw="4";
                    }else{
                        sw="5";
                    }
                }
            }
        }
    }//GEN-LAST:event_cbRutaActionPerformed

    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralActionPerformed
        DefaultTableModel modelo =new DefaultTableModel();
        tbLiquidaciones.setModel(modelo);
        boton=1;
        
        String gestion = (String)cbGestion.getSelectedItem();
        
        try{                        
            con = conexionBase.getConection();
            
            String sql ="";
            
            if(gestion=="TODO"){
                sql = "SELECT fecha, correlativo, fecha_pago_real, empresa, propietario, chofer, placa, cliente, drives, liquido_pagable FROM comprobante WHERE estado='activo'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            }else{
                sql = "SELECT fecha, correlativo, fecha_pago_real, empresa, propietario, chofer, placa, cliente, drives, liquido_pagable FROM comprobante WHERE estado='activo' AND gestion=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, gestion);
                rs = ps.executeQuery();
            }           
            
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("FECHA");
            modelo.addColumn("CORRELATIVO");
            modelo.addColumn("FECHA PAGO");
            modelo.addColumn("EMPRESA");
            modelo.addColumn("PROPIETARIO");
            modelo.addColumn("CHOFER");
            modelo.addColumn("PLACA");
            modelo.addColumn("CLIENTE");
            modelo.addColumn("DRIVE");
            modelo.addColumn("PAGO");
            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i < cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                
                modelo.addRow(filas);
            }
            txtGestion.setText("GESTION "+gestion);
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        tbLiquidaciones.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(1).setPreferredWidth(40);
        tbLiquidaciones.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbLiquidaciones.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbLiquidaciones.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbLiquidaciones.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbLiquidaciones.getColumnModel().getColumn(6).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(7).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(8).setPreferredWidth(5);
    }//GEN-LAST:event_btnGeneralActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modelo =new DefaultTableModel();
        tbLiquidaciones.setModel(modelo);
        boton=2;
        
        String gestion = (String)cbGestion.getSelectedItem();
        
        try{                        
            con = conexionBase.getConection();
            
            String sql = "";
            
            if(gestion=="TODO"){
                sql = "SELECT placa, correlativo, fecha, fecha_pago_real, empresa, propietario, chofer, cliente, drives, liquido_pagable FROM comprobante WHERE placa=? AND estado='activo'";
                ps = con.prepareStatement(sql);
                ps.setString(1, txtPlaca.getText().toUpperCase());
                rs = ps.executeQuery();
            }else{
                sql = "SELECT placa, correlativo, fecha, fecha_pago_real, empresa, propietario, chofer, cliente, drives, liquido_pagable FROM comprobante WHERE placa=? AND gestion=? AND='activo'";
                ps = con.prepareStatement(sql);
                ps.setString(1, txtPlaca.getText().toUpperCase());
                ps.setString(2, gestion);
                rs = ps.executeQuery();
            }                      
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("PLACA");            
            modelo.addColumn("CORRELATIVO");
            modelo.addColumn("FECHA");
            modelo.addColumn("FECHA PAGO");
            modelo.addColumn("EMPRESA");
            modelo.addColumn("PROPIETARIO");
            modelo.addColumn("CHOFER");
            modelo.addColumn("CLIENTE");
            modelo.addColumn("DRIVE");
            modelo.addColumn("PAGO");
            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i < cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                
                modelo.addRow(filas);
            }
            txtGestion.setText("GESTION "+gestion);
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        tbLiquidaciones.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(1).setPreferredWidth(40);
        tbLiquidaciones.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbLiquidaciones.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbLiquidaciones.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbLiquidaciones.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbLiquidaciones.getColumnModel().getColumn(6).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(7).setPreferredWidth(5);
        tbLiquidaciones.getColumnModel().getColumn(8).setPreferredWidth(5);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepararActionPerformed
        /*String correlativo ="", anio="", gestion="";
        int largo;
        
        try{                        
            PreparedStatement ps = null;
            ResultSet rs= null;
            
            conexion conexionBase = new conexion();
            Connection con = null;
            con = conexionBase.getConection();
            
            String sql = "SELECT correlativo FROM comprobante WHERE estado='activo'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
               correlativo=rs.getString("correlativo");
               largo=correlativo.length()-1;
               System.out.println(largo+"");
               anio=correlativo.substring(largo);
               System.out.println(anio);
               switch(anio){
                    case "9":
                       gestion="2019";
                       break;
                    case "0":
                       gestion="2020";
                       break;
               }
               System.out.println(gestion);
               try{
                   ps = con.prepareStatement("UPDATE comprobante SET gestion=? WHERE correlativo=?");
                   ps.setString(1, gestion);
                   ps.setString(2, correlativo);
                   int res = ps.executeUpdate();
               }catch(Exception e){
                   System.err.println(e);
               }
            }           
            JOptionPane.showMessageDialog(null, "GESTIONES MODIFICADAS CORRECTAMENTE");
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }

        */
        
        String drives="", correlativo="", vacio="";
        try{
            con = conexionBase.getConection();
            
            String sql = "SELECT correlativo, drive1, drive2, drive3, drive4, drive5, drive6 FROM comprobante WHERE estado='activo'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                correlativo=rs.getString("correlativo");
                if (rs.getString("drive1").isEmpty() == false) {
                    drives = drives + "(" + rs.getString("drive1") + ")";
                }
                if (rs.getString("drive2").isEmpty() == false) {
                   drives = drives + "(" + rs.getString("drive2") + ")";
                }
                if (rs.getString("drive3").isEmpty() == false) {
                    drives = drives + "(" + rs.getString("drive3") + ")";
                }
                if (rs.getString("drive4").isEmpty() == false) {
                    drives = drives + "(" + rs.getString("drive4") + ")";
                }
                if (rs.getString("drive5").isEmpty() == false) {
                    drives = drives + "(" + rs.getString("drive5") + ")";
                }
                if (rs.getString("drive6").isEmpty() == false) {
                    drives = drives + "(" + rs.getString("drive6") + ")";
                }
                try{
                   ps = con.prepareStatement("UPDATE comprobante SET drives=? WHERE correlativo=?");
                   ps.setString(1, drives);
                   ps.setString(2, correlativo);
                   int res = ps.executeUpdate();
               }catch(Exception e){
                   System.err.println(e);
               }
               drives="";
            }
            JOptionPane.showMessageDialog(null, "AGRUPAR DRIVES REALIZADO CORRECTAMENTE");
            
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnRepararActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila;
        String x;
        
        switch (boton) {
            case 1:
                try {
                    fila = tbLiquidaciones.getSelectedRow();
                    if (fila == -1) {
                        JOptionPane.showMessageDialog(null, "NO SE A SELECCIONADO NINGUNA FILA");
                    } else {
                        DefaultTableModel modelo = (DefaultTableModel) tbLiquidaciones.getModel();
                        x = (String) modelo.getValueAt(fila, 1);
                        new editarDesdeLista(x).setVisible(true);
                    }
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 2:
                try {
                    fila = tbLiquidaciones.getSelectedRow();
                    if (fila == -1) {
                        JOptionPane.showMessageDialog(null, "NO SE A SELECCIONADO NINGUNA FILA");
                    } else {
                        DefaultTableModel modelo = (DefaultTableModel) tbLiquidaciones.getModel();
                        x = (String) modelo.getValueAt(fila, 1);
                        new editarDesdeLista(x).setVisible(true);
                    }
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 3:
                try {
                    fila = tbLiquidaciones.getSelectedRow();
                    if (fila == -1) {
                        JOptionPane.showMessageDialog(null, "NO SE A SELECCIONADO NINGUNA FILA");
                    } else {
                        DefaultTableModel modelo = (DefaultTableModel) tbLiquidaciones.getModel();
                        x = (String) modelo.getValueAt(fila, 0);
                        new editarDesdeLista(x).setVisible(true);
                    }
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        new registrarLiquidacion().setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
          
        int fila;
        String a = "";
        String flete ="";
        
        switch (boton) {
            case 1:
                try {
                    fila = tbLiquidaciones.getSelectedRow();
                    if (fila == -1) {
                        JOptionPane.showMessageDialog(null, "NO SE A SELECCIONADO NINGUNA FILA");
                    } else {
                        DefaultTableModel modelo = (DefaultTableModel) tbLiquidaciones.getModel();
                        a = (String) modelo.getValueAt(fila, 1);
                    }
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 2:
                try {
                    fila = tbLiquidaciones.getSelectedRow();
                    if (fila == -1) {
                        JOptionPane.showMessageDialog(null, "NO SE A SELECCIONADO NINGUNA FILA");
                    } else {
                        DefaultTableModel modelo = (DefaultTableModel) tbLiquidaciones.getModel();
                        a = (String) modelo.getValueAt(fila, 1);
                    }
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 3:
                try {
                    fila = tbLiquidaciones.getSelectedRow();
                    if (fila == -1) {
                        JOptionPane.showMessageDialog(null, "NO SE A SELECCIONADO NINGUNA FILA");
                    } else {
                        DefaultTableModel modelo = (DefaultTableModel) tbLiquidaciones.getModel();
                        a = (String) modelo.getValueAt(fila, 0);
                    }
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
               
        try{
            con = conexionBase.getConection(); 
            String sql = "SELECT flete4 FROM comprobante WHERE correlativo=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, a);
            rs = ps.executeQuery();
            
            if(rs.next()){
                flete=rs.getString("flete4");               
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTE EL COMPROBANTE");
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        if (flete.equals("0.00")) {
            sw2 = 1;
        } else {
            sw2 = 0;
        }
        
        try{
            Map<String,Object> parametros = new HashMap<String,Object>();
            parametros.put("x", a);
            
            String RutaReporte="";
            
            if(sw2==0){
                RutaReporte =System.getProperty("user.dir")+"\\reportes\\Liquidacion.jasper";  // PARA EMPAQUETAR
                //RutaReporte =System.getProperty("user.dir")+"\\src\\reportes\\Liquidacion.jasper"; // PARA DESARROLLO
            }else{
                RutaReporte =System.getProperty("user.dir")+"\\reportes\\Liquidacion_2.jasper";  // PARA EMPAQUETAR
                //RutaReporte =System.getProperty("user.dir")+"\\src\\reportes\\Liquidacion_2.jasper"; // PARA DESARROLLO
            }
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile(RutaReporte);
            
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parametros, con);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("IMPRESION DE LIQUIDACION");
            view.setVisible(true);
            
        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"ERROR AL CARGAR EL REPORTE");
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    
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
            java.util.logging.Logger.getLogger(listarLiquidaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listarLiquidaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listarLiquidaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listarLiquidaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarLiquidaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGeneral;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReparar;
    private javax.swing.JComboBox<String> cbGestion;
    private javax.swing.JComboBox<String> cbRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLiquidaciones;
    private javax.swing.JLabel txtGestion;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
