package SamuelAndresCorreaHerrera;

public class ObjTeatro {
    int Numserie;
    int Total;
    String Nombre;
    int Precio;
    public ObjTeatro(int numserie, String nombre, int precio, int total) {
        Numserie = numserie;
        Nombre = nombre;
        Precio = precio;
        Total = total;
    }
    public int getNumserie() {
        return Numserie;
    }
    public void setNumserie(int numserie) {
        Numserie = numserie;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getTotal() {
        return Total;
    }
    public void setTotal(int total) {
        Total = total;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    
}
