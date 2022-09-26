package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal{
    // Atributos
    private ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    // Constructores

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.listado.add(this);
    }

    public Anfibio() {
        this.listado.add(this);
    }

    // Getter & Setter

    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    // Métodos

    public static int cantidadAnfibios(){
        return Anfibio.ranas+Anfibio.salamandras;
    }

    public  String movimiento(){

        return "saltar";
    }

    public Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio.ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio.salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }


}
