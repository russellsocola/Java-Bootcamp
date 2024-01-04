package Clase_07_POO;

public class Cliente {
    private String nombre;
    private String apellido;
    private Integer edad;

    public void mostrarDatos(){
        System.out.println("El nombre es: "+ nombre+ " "+ apellido );
        System.out.println("La edad es: "+ edad );
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String value){
        nombre = value;
    }
    public String getApellido(){
        return apellido;
    }

    public void setApellido(String value){
        apellido = value;
    }
    public Integer getEdad(){
        return edad;
    }

    public void setEdad(Integer value){
        edad = value;
    }
}
