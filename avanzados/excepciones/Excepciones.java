package avanzados.excepciones;

public class Excepciones {
    public static void main(String[] args) {
        try {
            int num = 10;
            int num2 = 0;
            System.out.println("Resultado de la division :" + Aritmetica.divison(num, num2));
        }catch(Exception e) {
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Se reviso la operacion");
        }
    }
}
