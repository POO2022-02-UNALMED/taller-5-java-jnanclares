package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal {
    // Atributos
    private ArrayList<Mamifero> listado = new ArrayList<Mamifero>();

    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    // Constructores

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.listado.add(this);
    }

    public Mamifero(){
        this.listado.add(this);
    }

    // Getter & Setter


    public ArrayList<Mamifero> getListado() {
        return listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }


    // Métodos

    public static int cantidadMamiferos(){
        return Mamifero.caballos+Mamifero.leones;
    }

    public Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero.caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);

    }

    public Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero.leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }


}
