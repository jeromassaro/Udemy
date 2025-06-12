package avanzados;

public interface Traductor {

    public abstract void traducir();

    default void iniciarTraductor(){
        System.out.println("iniciando traductor");
    }
}

class Ingles implements Traductor{
    public void traducir(){
        System.out.println("Translate");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduire");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("iniciando traductor Frances");
    }
}

class prueba {
    public static void main(String[] args) {
        Traductor traductor = new Frances();
        Traductor traductor2 = new Ingles();

        traductor.iniciarTraductor();
        traductor.traducir();

        System.out.println();

        traductor2.iniciarTraductor();
        traductor2.traducir();
    }
}
