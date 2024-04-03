import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        System.out.println("--------------------------");

        

        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero !!!!!!");
        }
        

        try {
            String[] frutas = {"Manzana", "Banana", "Naranja"};
            
            System.out.println(frutas[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera del rango!! ");
        }



        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error, has intentado acceder a un elemento que no existe!!");
        }
        System.out.println("Mi programa sigue......");



        try {
            int numero = Integer.parseInt("texto");
        } catch (NumberFormatException e) {
            System.out.println("No puedo convertir eso a integer!! ");
        }
        System.out.println("Mi programa sigue....");
        
        

       


    }
}
