package Clases;

public class Habitaciones {
    private int cantPersonas;
    private boolean ocupada;
    
    public Habitaciones(int cantidad){
        this.cantPersonas = cantidad;
        this.ocupada = false;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "cantPersonas=" + cantPersonas + ", ocupada=" + ocupada + '}';
    }
    
    
}
