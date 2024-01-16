package PraccticaAbstraccion;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    protected int experiencia;
    protected int level;
    protected int hp;
    protected int mana;


    List <Item> items;
    public Personaje() {
        hp = 100;
        mana = 100;
        items = new ArrayList<>();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public boolean estaVivo(){
        if (hp <= 0 ){
            return false;
        }
        return true;
    }
    public void recibirDano(int puntosDano){
        hp -= puntosDano;
        if (hp < 0 ){
            hp= 0;
        }
    }
    public void agregarExperiencia (int puntosExperiencia){
        experiencia += puntosExperiencia;
    }

    public int getDefenzaTotal(){
        int defenzaTotal = 0;
        for (Item item : items){
            defenzaTotal += item.getDefenza();
        }
        return defenzaTotal;
    }
    public int getAtaqueTotal(){
        int ataqueTotal = 0;
        for (Item item : items){
            if (item instanceof Arma){
                ataqueTotal = item.getAtaqueTotal();
            }
        }
        return ataqueTotal;
    }
    public int getMaximoHp(){

        return level*10;

    }
}
