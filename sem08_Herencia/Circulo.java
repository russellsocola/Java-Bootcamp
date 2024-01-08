package sem08_Herencia;

import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI* (radio * radio);
    }
    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo en Cm");
        radio =  teclado.nextDouble();
    }
}
