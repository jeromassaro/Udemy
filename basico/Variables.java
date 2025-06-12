public class Variables {
    public static void main(String[] args) {
        final String Titulo = "Udemy Java";
        System.out.println("Titulo = " + Titulo);
        /*
        int edad = 24;
        double peso = 68.7;
        boolean masculino = true;
        char sexo = 'M';
        String nombre = "Jeronimo";
        System.out.println(nombre + " " + edad + " " + peso + " " + sexo);
        */

        String nombre_completo = "Jeronimo Massaro";
        int edad = 24;
        double altura = 1.7;
        String pais = "Argentina";
        char casado = 's';
        System.out.println("Nombre completo: " + nombre_completo + "\nEdad: " + edad + "\nAltura: " + altura +
                "\nPais: " + pais + "\nCasado o Soltero: " + casado);

        System.out.println();

        String nombreProducto = "Coca-Cola";
        double precio = 2499.99;
        int stock = 42;
        boolean onSale = true;
        System.out.println("Nombre del Producto : " + nombreProducto + " Precio : " + precio
                + " Stock: " + stock + " onSale = " + onSale);

        nombreProducto = "Pepsi";
        precio = 2299.99;
        stock = 0;
        onSale = false;
        System.out.println("Nombre del Producto : " + nombreProducto + " Precio : " + precio
                + " Stock: " + stock + " onSale = " + onSale);

        var nombreProducto2 = "Manteca";
        var precio2 = 999.2;
        var stock2 = 239;
        var onSale2 = true;
        System.out.println("Nombre del Producto : " + nombreProducto2 + " Precio : " + precio2
                + " Stock: " + stock2 + " onSale = " + onSale2);

        System.out.println();

        String nombreCliente = "Obdulio";
        int dias = 32;
        double tarifaDiaria = 1.5;
        boolean hasView = false;
        System.out.println("Nombre del Cliente : " + nombreCliente + " Dias: " + dias
                + " Tarifa Diaria: " + tarifaDiaria + " hasView = " + hasView);

        dias = 20;
        hasView = true;
        System.out.println("Nombre del Cliente : " + nombreCliente + " Dias: " + dias
                + " Tarifa Diaria: " + tarifaDiaria + " hasView = " + hasView);

    }
}
