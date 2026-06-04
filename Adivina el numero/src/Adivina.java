import java.util.Random;
import java.util.Scanner;

public class Adivina{
    static Random aleatorio = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        int veces = 0;
        int eleccionint;
        String eleccion;
        String continuar = "si";

        while (continuar.equals("si")){
            System.out.println("***Generando nuevo número...***");
            System.out.println("Introduce tu elección:");
            int numero = aleatorio.nextInt(100)+1;
            eleccion =scanner.nextLine();

            while (!filtronumero(eleccion)){
                System.out.println("Introduce un número");
                eleccion =scanner.nextLine();
            }

            eleccionint = Integer.parseInt(eleccion);
            veces++;

            while(eleccionint!=numero){

                if (eleccionint<1 || eleccionint>100 ){
                    System.out.println("Intento inválido, introduce un número entre 1 y 100");
                    eleccion =scanner.nextLine();

                    while (!filtronumero(eleccion)){
                        System.out.println("Introduce un número");
                        eleccion =scanner.nextLine();
                    }

                    eleccionint = Integer.parseInt(eleccion);
                }

                else if (numero < eleccionint){
                    System.out.printf("El número %d es mayor que el que buscas. %n",eleccionint);
                    System.out.println("Introduce tu elección:");
                    eleccion =scanner.nextLine();

                    while (!filtronumero(eleccion)){
                        System.out.println("Introduce un número");
                        eleccion =scanner.nextLine();
                    }

                    eleccionint = Integer.parseInt(eleccion);
                    veces++;

                }else{
                    System.out.printf("El número %d es menor que el que buscas. %n",eleccionint);
                    System.out.println("Introduce tu elección:");
                    eleccion =scanner.nextLine();

                    while (!filtronumero(eleccion)){
                        System.out.println("Introduce un número");
                        eleccion =scanner.nextLine();
                    }

                    eleccionint = Integer.parseInt(eleccion);
                    veces++;
                }
            }
            System.out.printf("¡Has acertado! El número era %d y has necesitado %d intentos. %n ",numero,veces);
            veces=0;
            System.out.printf("¿Quieres seguir jugando?(si/ no). %n");
            scanner.nextLine();
            continuar=scanner.nextLine();

            while (!continuar.equals("si") && !continuar.equals("no")){
                System.out.println("¿Quieres seguir jugando?(si/ no). ");
                continuar=scanner.nextLine();
            }
            }
    }
    public static boolean filtronumero(String entrada) {

        boolean salida=false;

        for (char c : entrada.toCharArray()) {
            if (!Character.isDigit(c)) {
                return (salida);
            }
        }
        salida=true;
        return (salida);
    }
}