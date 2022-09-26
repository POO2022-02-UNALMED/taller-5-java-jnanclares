package gestion;
import java.util.ArrayList;

public class Zoologico {

    // Atributos
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(){}

    // Getter & setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    //Metodos

    void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }

    void cantidadTotalAnimales(){

    }

}
