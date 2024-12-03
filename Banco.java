import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double saldo = 0;
        String menu = """
                1 Consultar
                2 Retirar
                3 Despositar
                4 Salir
                Ingrese opcion:
                """;
        while (true){
            System.out.println(menu);
            opcion = scanner.nextInt();
            switch (opcion){

                case 1:

                    System.out.println("Su saldo es " + saldo);
                    break;
                case 2:

                    System.out.println("Cuanto quiere retirar? ");
                    double cantidad = scanner.nextDouble();
                    if(saldo >= cantidad){
                        saldo -= cantidad;
                    }else {
                        System.out.println("Fondos insufucientes...");
                    }
                    break;
                case 3:
                    System.out.println("Cuanto quiere depositar? ");
                    double cantidad2 = scanner.nextDouble();

                    if(cantidad2 > 0){
                        saldo += cantidad2;
                    }else {
                        System.out.println("Cantidad a depositar menor a 0");
                    }

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta..");
            }
        }

    }
}
