package intermedio.base_de_datos.datos;

import intermedio.base_de_datos.dominio.Cliente;

import java.util.List;

public interface iClienteDAO {

    List<Cliente> listarClientes();
    boolean buscarClienteID(Cliente cliente);
    boolean agregarCliente(Cliente cliente);
    boolean modificarCliente(Cliente cliente);
    boolean eliminarCliente(Cliente cliente);
}
