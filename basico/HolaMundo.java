public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Jeronimo Massaro");
        System.out.println("Tengo 24 años");
        System.out.println("Soy de Argentina");
      //
      //  var cadena1 = "Hola Mundo";
      //  System.out.println("cadena1 = " + cadena1);
      //
      //  var subcadena1 = cadena1.substring(0, 4);
      //  System.out.println("subcadena1 = " + subcadena1);
      //
      //  var subcadena2 = cadena1.substring(5);
      //  System.out.println("subcadena2 = " + subcadena2);
      //
      //  var builder = new StringBuilder();
      //  builder.append("Hola ");
      //  builder.append("Mundo");
      //  System.out.println("builder = " + builder.toString());
      //
      //  cadena1 = String.join(" ", cadena1, builder.toString());
      //  System.out.println("cadena1 = " + cadena1);

        var nombre = "Jeronimo Massaro";
        var edad = 24;
        var altura = 1.7;

        System.out.printf("Nombre : %s , Edad : %d , Altura : %.2f%n",nombre,edad,altura);

        var mensaje = """
                Nombre : %s
                Edad : %03d
                Altura : %.2f
                """.formatted(nombre,edad,altura);
        System.out.println("mensaje \n" + mensaje);

    }
}