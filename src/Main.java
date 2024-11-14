public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(5,60.0, "Gasolina", 1.6);
        Auto auto3 = new Auto(2,110.0);
        Auto auto4 = new Auto("Gasolina", 1.0);
        Bicicleta bicicleta1 = new Bicicleta();
        //Sin parametros
        auto1.mostrarDatos();
        //Con parametros clase padre
        auto3.mostrarDatos();
        //Parametros clase hija
        auto4.mostrarDatos();
        //Sin parametros y luego asignar con setters
        bicicleta1.mostrarDatos();
        bicicleta1.setMarchas(21);
        bicicleta1.setTipo("BMX");
        bicicleta1.setCapacidad(1);
        bicicleta1.setVelocidad(20.0);
        bicicleta1.mostrarDatos();
    }
}