import java.util.Scanner;

public class Envios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COSTO_NACIONAL = 10;
        final int COSTO_INTERNACIONAL = 20;

        System.out.println("Ingrese el peso del paquete");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el tipo de envio Nacional o Internacional");
        String envio = sc.nextLine();

        double costo = switch (envio) {
        case "Nacional" -> peso * COSTO_NACIONAL;
        case "Internacional" -> peso * COSTO_INTERNACIONAL;
        default -> {
            System.out.println("El tipo de envio no es valido");
            yield 0;
        }
        };
        if (costo != 0){
            System.out.println("costo = " + costo);
        }
    }

}
