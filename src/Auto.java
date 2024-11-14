public class Auto extends Transporte{
    String tipo;
    double cilindraje;

    public Auto(int capacidad, double velocidad, String tipo, double cilindraje) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
    public Auto(String tipo, double cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

    public Auto(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    public Auto() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void prenderRadio(){
        System.out.println("Se enciende el radio");
    }
}
