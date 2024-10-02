
import java.util.Date;

public class Prendas {
    private String nombre;
    private String diseniador;
    private Date anioColeccion;
    private double precio;

    public Prendas(String nombre, String deseniador, Date anioColeccion, double precio) {
        this.nombre = nombre;
        this.diseniador = diseniador;
        this.anioColeccion = anioColeccion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getdiseniador() {
        return diseniador;
    }

    public Date getAnioColeccion() {
        return anioColeccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiseniador(String diseniador) {
        this.diseniador = diseniador;
    }

    public void setAnioColeccion(Date anioColeccion) {
        this.anioColeccion = anioColeccion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}