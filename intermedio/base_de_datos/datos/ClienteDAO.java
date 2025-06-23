package intermedio.base_de_datos.datos;

import intermedio.base_de_datos.dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static intermedio.base_de_datos.conexion.Conexion.getConexion;

public class ClienteDAO implements iClienteDAO{

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        var query = "SELECT * FROM cliente ORDER BY id";
        try{
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int membresia = rs.getInt("membresia");
                Cliente c = new Cliente(id,nombre,apellido,membresia);
                clientes.add(c);
            }
        }catch (Exception e){
            System.out.println("Error al listar clientes" + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion" + e.getMessage());
            }
        }
        return clientes;
    }

    @Override
    public boolean buscarClienteID(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String query = "SELECT * FROM cliente WHERE id =?";
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar cliente" + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion" + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String query = "INSERT INTO cliente (nombre,apellido,membresia) " +
                "VALUES (?,?,?)";
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar cliente" + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion" + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String query = "UPDATE cliente SET nombre = ?,apellido = ?,membresia = ? WHERE id =?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar cliente" + e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexion" + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String query = "DELETE FROM cliente WHERE id =?";
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar cliente" + e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion" + e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        iClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.listarClientes();
        for (Cliente cliente : lista) {
            System.out.println(cliente);
        }
        Cliente cliente = new Cliente(1);
        System.out.println(dao.buscarClienteID(cliente) + " " + cliente);

        Cliente cliente2 = new Cliente(4,"testmodificar","mod",10);
        System.out.println(dao.modificarCliente(cliente2));

    }
}
