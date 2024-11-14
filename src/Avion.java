public class Avion extends Transporte{
    String tipo;
    String altitudMaxima;

    public Avion(int capacidad, double velocidad, String tipo, String altitudMaxima) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.altitudMaxima = altitudMaxima;
    }

    public Avion() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(String altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public void darAviso(){
        System.out.println("Se activa el aviso de emergencia");
    }
}
