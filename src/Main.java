

public class Main {

    public static void main(String[] args) {
       //ejercicio funcion suma
        int a = 5;
        int b = 10;
        int c = 15;
        int resultado;
        resultado=suma(a,b,c);
        System.out.println("la suma de los numeros es: " + resultado);
        // ejercicio clase coche
        Coche miCoche = new Coche(3);
        miCoche.addPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");

    }


    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}
