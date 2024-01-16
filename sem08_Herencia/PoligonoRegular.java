package sem08_Herencia;

import java.util.Scanner;

public abstract class PoligonoRegular extends Figura {
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargarDatos(){
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingresa la altura en cm");
        altura  = numero.nextDouble();
        System.out.println("Ingresa la base en cm");
        base  = numero.nextDouble();
    }

    @Override
    public abstract double calcularArea();
}