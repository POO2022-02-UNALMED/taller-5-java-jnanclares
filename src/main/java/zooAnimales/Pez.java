package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    // Atributos
    private ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    // Constructores

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.listado.add(this);
    }

    public Pez(){
        this.listado.add(this);
    }

    // Getter & Setter


    public ArrayList<Pez> getListado() {
        return listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }


    // Metodos

    public static int cantidadPeces(){
        return Pez.bacalaos+Pez.salmones;

    }

    public String movimiento(){

        return "nadar";
    }

    public Pez crearSalmon(String nombre, int edad, String genero){
        Pez.salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public Pez crearBacalao(String nombre, int edad, String genero){
        Pez.bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }

}
