package sem08_Herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Figura> figuras = new ArrayList<>();
    public static void main(String[] args) {

        boolean mostrarMenu = true;

        do {

            System.out.println("!!!------------Menu------------!!!");
            System.out.println("!(1) Crear una Figura: ");
            System.out.println("!(2) Mostrar una sumatoria de areas de las figuras");
            System.out.println("!(0) SALIR ");
            Scanner teclado = new Scanner(System.in);

            int respuesta = teclado.nextInt();

            if (respuesta == 1){
                crearFigura();
            }
            if (respuesta == 2) {
                mostrarSumatoriaFiguras();

            }
            if (respuesta == 0) {
                mostrarMenu = false;
            }
        }while (mostrarMenu);
    }

    private static void mostrarSumatoriaFiguras(){
        double sumatoriaAreas = 0;
        for (Figura figura : figuras){
            sumatoriaAreas+= figura.calcularArea();
        }
        System.out.println("La sumatoria de Area de todas las figuras es: "+ sumatoriaAreas+"  Cm");
    }
    private static void crearFigura() {
        System.out.println("¿Que figura desea crear ?");
        System.out.println("Opcion 1: Circulo");
        System.out.println("Opcion 2: Cuadrado");
        System.out.println("Opcion 3: Triangulo");

        Scanner numero = new Scanner(System.in);
        int numero1 = numero.nextInt();

        if (numero1 == 1){
            Circulo cir = new Circulo();
            cir.cargarDatos();
            System.out.println("El area total es :" + cir.calcularArea());
            figuras.add(cir);
        }
        if (numero1 == 2){
            Cuadrado cua = new Cuadrado();
            cua.cargarDatos();
            System.out.println("El area total es: "+ cua.calcularArea());
            figuras.add(cua);
        }
        if (numero1 == 3){
            Triangulo tri = new Triangulo();
            tri.cargarDatos();
            System.out.println("El area total es : "+ tri.calcularArea());
            figuras.add(tri);
        }
    }
}
