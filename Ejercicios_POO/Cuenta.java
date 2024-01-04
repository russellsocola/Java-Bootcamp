package Ejercicios_POO;

public class Cuenta {
    private String Titular;
    private float cantidad;

    public Cuenta(){

    }

    public void setTitular(String value){
        Titular= value;
    }
    public String getTitular(){
        return Titular;
    }

    public void setCantidad(float value){
        cantidad= value;
    }

    public float getCantidad(){
        return cantidad;
    }

    public void Mostrar(){
        System.out.println("Titular de la Cuenta  : "+ getTitular());
        System.out.println("Cantidad de la Cuenta  : "+ getCantidad());
    }

    public void Ingresar(float cantida){
    }
}
