package Clase_07_POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente Cliente1 = cargarCliente();
    }

    private static Cliente cargarCliente(){

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Ingrese nombre del cliente");
        cliente.setNombre(sc.nextLine());

        System.out.println(cliente.getNombre());

        System.out.println("Ingrese apellido del cliente");
        cliente.setApellido(sc.nextLine());

        System.out.println(cliente.getApellido());

        System.out.println("Ingrese la edad del Cliente");
        cliente.setEdad(sc.nextInt());

        System.out.println(cliente.getEdad());
        return cliente;
    }
}
