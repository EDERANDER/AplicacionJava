
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaevaluaciones = 0;
        int cantidad = 3;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la nota que le darias a Matrix");
            nota = teclado.nextDouble();
            mediaevaluaciones += nota/cantidad;
        }
        System.out.println(mediaevaluaciones);
    }
}
