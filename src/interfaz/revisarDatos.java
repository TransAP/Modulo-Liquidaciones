/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SISTEMAS
 */
public class revisarDatos extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;
    public revisarDatos() {
        initComponents();
        Cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrincipal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPrincipal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cargar(){
    DefaultTableModel modelo =new DefaultTableModel();
        tbPrincipal.setModel(modelo);

        try{          
            PreparedStatement ps = null;
            ResultSet rs= null;
            
            conexion conexionBase = new conexion();
            Connection con = null;
            con = conexionBase.getConection();
            
            String sql = "";
            sql = "SELECT correlativo, flete1, flete2, flete3, flete4, flete5, flete6, total_fletes, importe1, importe2, importe3, importe4, importe5, importe6, total_anticipos, porcentaje, retencion, rastreo, semirremolque, otros1, otros2, otros3, otros4, total_deducciones, liquido_pagable FROM comprobante";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
                    
            modelo.addColumn("CORRELATIVO");
            modelo.addColumn("FLETE1");
            modelo.addColumn("FLETE2");
            modelo.addColumn("FLETE3");
            modelo.addColumn("FLETE4");
            modelo.addColumn("FLETE5");
            modelo.addColumn("FLETE6");
            modelo.addColumn("T.FLETES");
            modelo.addColumn("ANTICIPO1");
            modelo.addColumn("ANTICIPO2");
            modelo.addColumn("ANTICIPO3");
            modelo.addColumn("ANTICIPO4");
            modelo.addColumn("ANTICIPO5");
            modelo.addColumn("ANTICIPO6");
            modelo.addColumn("T.ANTICIPO");
            modelo.addColumn("PORCENTAJE");
            modelo.addColumn("IMPUESTO");          
            modelo.addColumn("RASTREO");
            modelo.addColumn("SEMI");
            modelo.addColumn("OTROS1");
            modelo.addColumn("OTROS2");
            modelo.addColumn("OTROS3");
            modelo.addColumn("OTROS4");
            modelo.addColumn("T.DEDUCCIONES");
            modelo.addColumn("L.PAGABLE");
            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i < cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                
                modelo.addRow(filas);
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(revisarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(revisarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(revisarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(revisarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new revisarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPrincipal;
    // End of variables declaration//GEN-END:variables
}
