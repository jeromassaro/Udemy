package intermedio.base_de_datos.presentacion;

import intermedio.base_de_datos.datos.ClienteDAO;
import intermedio.base_de_datos.datos.iClienteDAO;
import intermedio.base_de_datos.dominio.Cliente;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }
    private static void zonaFitApp() {
        var salir = false;
        var consola = new Scanner(System.in);
        iClienteDAO clienteDAO = new ClienteDAO();
        while (!salir) {
            try {
                int opcion = mostrarMenu(consola);
                salir = ejercutarOpciones(consola,clienteDAO,opcion);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Zona Fit 
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Opcion :
                """);
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejercutarOpciones(Scanner consola,iClienteDAO clienteDAO, int opcion) {
        switch (opcion) {
            case 1 -> {
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("Ingrese el ID del Cliente a buscar");
                int id = Integer.parseInt(consola.nextLine());
                Cliente c = new Cliente(id);
                clienteDAO.agregarCliente(c);
            }
            case 3 -> {
                System.out.println("Ingrese el nombre del nuevo cliente");
                String nombre = consola.nextLine();
                System.out.println("Ingrese el apellido del nuevo cliente");
                String apellido = consola.nextLine();
                System.out.println("Ingrese la membresia del nuevo cliente");
                int membresia = Integer.parseInt(consola.nextLine());
                Cliente c = new Cliente();
                c.setNombre(nombre);
                c.setApellido(apellido);
                c.setMembresia(membresia);
                clienteDAO.agregarCliente(c);
            }
            case 4 -> {
                System.out.println("Ingrese el id del cliente a modificar");
                int id = Integer.parseInt(consola.nextLine());
                System.out.println("Ingrese el nombre del nuevo cliente");
                String nombre = consola.nextLine();
                System.out.println("Ingrese el apellido del nuevo cliente");
                String apellido = consola.nextLine();
                System.out.println("Ingrese la membresia del nuevo cliente");
                int membresia = Integer.parseInt(consola.nextLine());
                Cliente c = new Cliente(id);
                c.setNombre(nombre);
                c.setApellido(apellido);
                c.setMembresia(membresia);
                clienteDAO.modificarCliente(c);
            }
            case 5 -> {
                System.out.println("Ingrese el id del cliente a eliminar");
                int id = Integer.parseInt(consola.nextLine());
                var c = new Cliente(id);
                clienteDAO.eliminarCliente(c);
            }
            case 6 -> {
                System.out.println("Saliendo del sistema");
                return true;
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
        return false;
    }
}
