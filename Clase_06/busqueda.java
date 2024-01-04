package Clase_06;

import java.util.Scanner;

public class busqueda {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String nombreBuscar = Sc.nextLine();

        String[] ListaNombres = {"Ana Julia ", "Batriz Ledezma", "Rosa Figueroa", "Amelia Romina","Carla Yennifer", "Yelisse"};

        for (String nombre : ListaNombres){
            if (nombre.toLowerCase().contains(nombreBuscar.toLowerCase())){
                System.out.println("El nombre que buscas es: " + nombre);
            }
        }
    }
}
