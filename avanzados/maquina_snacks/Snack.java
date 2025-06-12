package avanzados.maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {

    private String nombre;
    private double precio;
    private final int idSnack;
    static int contador = 0;

    public Snack(){
        this.idSnack = ++Snack.contador;
    }

    public Snack(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdSnack() {
        return this.idSnack;
    }

    public static int getContador() {
        return Snack.contador;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack='" + this.idSnack + '\'' +
                ", nombre=" + this.nombre +
                ", precio=" + this.precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return Double.compare(precio, snack.precio) == 0 && idSnack == snack.idSnack && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, idSnack);
    }
}
