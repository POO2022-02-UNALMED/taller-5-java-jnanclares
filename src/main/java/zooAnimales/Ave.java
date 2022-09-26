package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    // Atributos
    private ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    // Constructores
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.listado.add(this);
    }

    public Ave(){
        this.listado.add(this);
    }

    //Getter & Setter


    public ArrayList<Ave> getListado() {
        return listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }


    // Métodos

    public static int cantidadAves(){
        return Ave.aguilas+Ave.halcones;
    }

    public String movimiento(){

        return "volar";
    }

    public Ave crearHalcon(String nombre, int edad, String genero){
        Ave.halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");

    }

    public Ave crearAguila(String nombre, int edad, String genero){
        Ave.aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }



}
