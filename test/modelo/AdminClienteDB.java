package modelo;

import dao.CRUD;
import dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AdminClienteDB extends Conexion implements CRUD {
    
    public AdminClienteDB(){ 
    }
    
    @Override
    public Object insertar(Object obj) {
        Connection conex = abrirConexion();
        Cliente objCliente = (Cliente) obj;
        try {
            String sql = "INSERT INTO cliente(doc, nom_completo, direcc, telefono, correo) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, objCliente.getDoc());
            preparedStatement.setString(2, objCliente.getNom_completo());
            preparedStatement.setString(3, objCliente.getDirecc());
            preparedStatement.setString(4, objCliente.getTelefono());
            preparedStatement.setString(5, objCliente.getCorreo());
            
            preparedStatement.execute();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            while (rs.next()) {
                objCliente.setIdc(rs.getInt(1));
            }
            preparedStatement.close();

            System.out.println("La inserción del cliente fue exitoso. ");
        } catch (SQLException e) {

            System.out.println("Error al insertar el cliente: " + e.getMessage());
        }
        cerrarConexion();
        return objCliente;
                

    }

    @Override
    public boolean actualizar(Object obj) {
        Cliente objCliente = (Cliente) obj;
        boolean flag = false;
        Connection conex = abrirConexion();
        try {
            String sql = "UPDATE cliente SET doc=?,nom_completo=?,direcc=?,telefono=?,correo=?  WHERE idc=?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objCliente.getDoc());
            preparedStatement.setString(2, objCliente.getNom_completo());
            preparedStatement.setString(3, objCliente.getDirecc());
            preparedStatement.setString(4, objCliente.getTelefono());
            preparedStatement.setString(5, objCliente.getCorreo());
            preparedStatement.setInt(6, objCliente.getIdc());
            int totalFilasafectadas = preparedStatement.executeUpdate();
            if (totalFilasafectadas > 0) {
                flag = true;
            }
            preparedStatement.close();
            System.out.println("La inserción del cliente fue exitoso. ");
        } catch (SQLException e) {
            System.out.println("Error al insertar el cliente: " + e.getMessage());
        }
        return flag;
    }

    @Override
    public boolean eliminar(Object obj) {
        Cliente objCliente = (Cliente) obj;
        boolean flag = false;
        Connection conex = abrirConexion();
        try {
            String sql = "DELETE FROM cliente WHERE idc=?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objCliente.getIdc());
            int totalFilasafectadas = preparedStatement.executeUpdate();
            if (totalFilasafectadas > 0) {
                flag = true;
            }
            preparedStatement.close();

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: "+e.getMessage());
            System.out.println("Error al eliminar el cliente: " + e.getMessage());
        }
        cerrarConexion();
        return flag;
        
    }

    @Override
    public List<Object> listarTodo() {
        List<Object> rowsQuery = new ArrayList<Object>();
        Connection conex = abrirConexion();
        Cliente objCliente;
        try {
            String sql = "SELECT * FROM cliente ORDER BY idc ASC";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                objCliente = new Cliente();
                objCliente.setIdc(resultSet.getInt("idc"));
                objCliente.setDoc(resultSet.getString("doc"));
                objCliente.setNom_completo(resultSet.getString("nom_completo"));
                objCliente.setDirecc(resultSet.getString("direcc"));
                objCliente.setTelefono(resultSet.getString("telefono"));
                objCliente.setCorreo(resultSet.getString("correo"));  
                
                rowsQuery.add(objCliente);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
            System.out.println("Error en la adquisición de datos. "+e.getMessage());
        }
        cerrarConexion();
        return rowsQuery;
    }

    @Override
    public Object listarUno(Object obj) {
        Connection conex = abrirConexion();
        Cliente objCliente = (Cliente) obj;
        boolean flag = false;
        try {
            String sql = "SELECT * FROM cliente WHERE idc = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objCliente.getIdc());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                objCliente.setIdc(resultSet.getInt("idc"));
                objCliente.setDoc(resultSet.getString("doc"));
                objCliente.setNom_completo(resultSet.getString("nom_completo"));
                objCliente.setDirecc(resultSet.getString("direcc"));
                objCliente.setTelefono(resultSet.getString("telefono"));
                objCliente.setCorreo(resultSet.getString("correo"));  
                flag = true;
            }
            if (!flag) {
                objCliente.setIdc(0);
            }   
            preparedStatement.close();
            System.out.println("La inserción del cliente fue exitoso. ");
        } catch (SQLException e) {
            System.out.println("Error al insertar el cliente: " + e.getMessage());
        }
        cerrarConexion();
        return objCliente;
    }
}


