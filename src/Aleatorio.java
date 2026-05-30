import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    static Random aleatorio = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        int veces;

        System.out.println("¿Cuántos números aleatorios quieres?");
        veces = scanner.nextInt();

        while (veces <= 0) {
            System.out.println("Introduce un número positivo:");
            veces =scanner.nextInt();
            }


        while (veces > 0) {
            int numero = aleatorio.nextInt(10);
            System.out.println("Tu numero aleatorio es: " + numero);
            veces--;
        }


    }
}