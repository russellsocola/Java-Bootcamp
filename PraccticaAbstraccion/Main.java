package PraccticaAbstraccion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Personaje> personajes = new ArrayList<>();

        Personaje p1 = new Personaje();
        p1.recibirDano(50);

        Item casco = new Item();
        casco.setDefenza(5);

        Item escudo = new Item();
        escudo.setDefenza(30);

        Item botas = new Item();
        botas.setDefenza(2);

        Item espada = new Item();
        espada.setAtaque(60);

        p1.getItems().add(casco);
        p1.getItems().add(escudo);
        p1.getItems().add(botas);
        p1.getItems().add(espada);

        Personaje p2 = new Personaje();
        Item escudoDeMadera = new Item();
        escudo.setDefenza(15);
        p2.getItems().add(escudoDeMadera);

        int ataque = p1.getAtaqueTotal();
        int puntosDano = p2.getDefenzaTotal() - ataque;
        p2.recibirDano(puntosDano);
    }
}
