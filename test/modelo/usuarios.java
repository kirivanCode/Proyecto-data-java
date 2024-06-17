/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.CRUD;
import dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ivan
 */
public class usuarios extends javax.swing.JFrame{
     Conexion cc = new Conexion();
     Connection con =cc.abrirConexion();
     
     
public void agregarusuario() throws SQLException{
    String sql = "INSERT INTO usuarios(usuario,contraseña)VALUES(?,?)";
    
    try{
        PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, txtUsuario.);
    }
    
}
     
}
