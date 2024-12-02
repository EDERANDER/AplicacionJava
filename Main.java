public class Main {
    public static void main(String[] args) {

        int fechaLanzamiento = 2000;

        double media = (8.2 + 6.0 + 4.4) / 3;

        String sinopsis = """
                Es una pelicula muy buena por parte de los directores
                """ + fechaLanzamiento;

        System.out.println(sinopsis);

        int clasficacion = (int) (media / 2);

        System.out.println(clasficacion);



    }
}

