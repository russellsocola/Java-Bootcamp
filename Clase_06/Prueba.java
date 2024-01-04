package Clase_06;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        //Cargar 3 numeros mostrar el menor y el mayor
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero ");
        Integer n1 = sc.nextInt();
        System.out.println("Ingresa el primer numero ");
        Integer n2 = sc.nextInt();
        System.out.println("Ingresa el primer numero ");
        Integer n3 = sc.nextInt();

        if (n1>n2 && n2>n3){
            System.out.println("El numero mayor es "+ n1+" Y el menor es "+n3);
        } else if (n2>n1 && n1>n3) {
            System.out.println("El numero mayor es "+ n2+" Y el menor es "+n3);
        } else if (n3>n1 && n2>n1) {
            System.out.println("El numero mayor es "+ n3+" Y el menor es "+n1);
        }else if (n1> n2 && n3>n2){
            System.out.println("El numero mayor es "+ n1+" Y el menor es "+n2);
        }
    }
}
