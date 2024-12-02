public class Main {
    public static void main(String[] args) {

        int fechaLanzamiento = 2000;

        String sinopsis = """
                Es una pelicula muy buena por parte de los directores
                """ + fechaLanzamiento;

        System.out.println(sinopsis);

        for (int i = 0; i < fechaLanzamiento ; i++) {
            System.out.println(i + " ");
        }

    }
}

