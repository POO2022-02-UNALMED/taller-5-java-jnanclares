package zooAnimales;

import gestion.Zona;

public class Animal {

    //Atributos
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    //Constructores
    Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.totalAnimales++;
    }

    public Animal() {}

    // Getter & Setter

    public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    // Métodos
    String movimiento() {
        return "desplazarse";
    }

    void totalPorTipo(){
        String total = "Mamiferos: " + Mamifero.cantidadMamiferos() +"\n"+
                "Ave: " + Ave.cantidadAves() +"\n"+
                "Reptil: " + Reptil.cantidadReptiles() +"\n"+
                "Pez: " + Pez.cantidadPeces() +"\n"+
                "Anfibio: " + Anfibio.cantidadAnfibios();
    }


    @Override
    public String toString() {
        if (this.zona.getNombre() != null){
            return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat() + " y mi genero es " + getGenero() +
                ", la zona en que me ubico es " + zona.getNombre() + ", en el zoo " + zona.getZoo().getNombre();
        }
        return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat() + " y mi genero es " + getGenero();
    }
}
