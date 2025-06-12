package avanzados;

import org.w3c.dom.css.Rect;

public class Abstracta {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5,10);
        Circulo c = new Circulo(3);

        System.out.println("Area del Rectangulo: " + r.area());
        r.dibujar();
        System.out.println("Area del Circulo: " + c.area());
        c.dibujar();
    }
}

abstract class FiguraGeometrica {
    public abstract double area();
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {

    public int base;
    public int altura;
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura;
    }
    public void dibujar() {
        System.out.println("Dibujando rectangulo");
    }
}

class Circulo extends FiguraGeometrica {
    public int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }

    public double area() {
        return this.radio * this.radio * Math.PI;
    }

    public void dibujar() {
        System.out.println("Dibujando Circulo");
    }
}
