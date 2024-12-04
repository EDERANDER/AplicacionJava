import com.AppJava.Modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Avengers: End Game");
        pelicula.setDuracionMinutos(120);
        pelicula.setFechaLanzamiento(2021);
        pelicula.setIncluidoEnElPlan(true);

        pelicula.muestraFichaTecnica(pelicula);


    }
}
