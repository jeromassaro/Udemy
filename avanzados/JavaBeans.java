package avanzados;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Jeronimo");
        p.setEdad(24);
        System.out.println("p = " + p);
    }
}

class Persona implements Serializable {

    private String nombre;
    private int edad;

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
