package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    // Atributos
    private ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    // Constructores

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.listado.add(this);
    }

    public Reptil(){
        this.listado.add(this);
    }

    // Getter & Setter

    public ArrayList<Reptil> getListado() {
        return listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }


    // Métodos

    public static int cantidadReptiles(){
        return Reptil.serpientes+Reptil.iguanas;

    }

    public String movimiento(){

        return "reptar";
    }

    public Reptil crearIguana(String nombre, int edad, String genero){
        Reptil.iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);

    }

    public Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil.serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }

}
