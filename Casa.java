public class Casa {
    
    
    private String nombrePropietario;
    private int precio;
    private boolean alquilada;
    
    public Casa (int precioDeLaCasa, boolean estaAlquilada) {
        precio = precioDeLaCasa;
        alquilada = estaAlquilada;
        nombrePropietario = "Alejandro Redondo";
    }
    
    public String getPropietario() {
        return nombrePropietario;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public boolean getAlquilada() {
        return alquilada;
    }
    
    public void setPropietario(String nuevoPropietario) {
        nombrePropietario = nuevoPropietario;
    }
    
    public void sumarPrecio(int precioASumar) {
        precio = precio + precioASumar;
    }
    
    public void cambiarEstadoAlquilada() {
        if (alquilada) {
            alquilada = false;
        }
        else {
            alquilada = true;
        }
    }
}
