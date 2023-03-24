

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(3);
        miCoche.addPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
}
