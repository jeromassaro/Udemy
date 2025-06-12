package avanzados;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4);
        System.out.println();
        imprimirNumeros(5,6,7,8,9,10,11,12);
        System.out.println();
        imprimirNumeros2("Jero",55,200,131);
        System.out.println();
        imprimirNumerosEach(11,31313,4555,67);
    }

    public static void imprimirNumeros(int... numeros){
       for (int i = 0; i < numeros.length; i++){
           System.out.println("Numero["+i+"] : " + numeros[i]);
       }
    }

    public static void imprimirNumeros2 (String nombre, int... numeros){
        System.out.println("Nombre : " + nombre);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numero["+i+"] : " + numeros[i]);
        }
    }

    public static void imprimirNumerosEach (int... numeros){
        int i = 0;
        for (int num : numeros){
            System.out.println("Numero["+i+"] : " + num);
            i++;
        }
    }
}
