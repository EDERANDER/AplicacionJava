import java.util.Scanner;

public class Desiciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esribe el nombre de tu pelicular:");
        String pelicula = scanner.nextLine();

        System.out.println("Escribe fecha de lanzamiento:");
        int fecha = scanner.nextInt();

        System.out.println("Escribe que nota le das a esta pelicula:");
        double nota = scanner.nextDouble();

        System.out.println("Datos: ");
        System.out.println("nombre"+pelicula);
        System.out.println("fecha"+fecha);
        System.out.println("nota"+nota);



    }
}