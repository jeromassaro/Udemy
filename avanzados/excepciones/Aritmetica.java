package avanzados.excepciones;

public class Aritmetica {
    public static int divison (int a, int b) {
        if (b == 0){
            throw new RuntimeException("Division entre Cero");
        }
        else return a / b;
    }
}
