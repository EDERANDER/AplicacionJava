package com.AppJava.Modelos;

public class Titulo {

        private String nombre;
        private int fechaLanzamiento;
        private int duracionMinutos;
        private boolean incluidoEnElPlan;
        private double sumaDeEvaluaciones;
        private static int cantidadevaluaciones = 0;

        public void muestraFichaTecnica(Titulo otraPelicula){
            System.out.println("Name: " + otraPelicula.getNombre());
            System.out.println("Date: " + otraPelicula.getFechaLanzamiento());
            System.out.println("Duration: " + otraPelicula.getDuracionMinutos());
            System.out.println("Include in the app: " + otraPelicula.getIncluidoEnElPlan());
        }

        public void evalua(double nota){
            if (nota >= 0 && nota <= 10){
                this.sumaDeEvaluaciones += nota;
                Titulo.cantidadevaluaciones++;
            }else{
                System.out.println("Valores incorrectos");
            }
        }

        public double calculaMedia(){

            return this.getSumaDeEvaluaciones() / Titulo.getCantidadevaluaciones();
        }

        public static int getCantidadevaluaciones() {
            return cantidadevaluaciones;
        }

        public double getSumaDeEvaluaciones() {
            return sumaDeEvaluaciones;
        }

        //set y getter para nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return nombre;
        }
        //set y getter para fecha lanzamiento
        public void setFechaLanzamiento(int fechaLanzamiento) {
            this.fechaLanzamiento = fechaLanzamiento;
        }
        public int getFechaLanzamiento() {
            return fechaLanzamiento;
        }
        //set y getter para duracion en minutos
        public void setDuracionMinutos(int duracionMinutos) {
            this.duracionMinutos = duracionMinutos;
        }
        public int getDuracionMinutos() {
            return duracionMinutos;
        }
        //set y getter para incluido en el plan
        public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
            this.incluidoEnElPlan = incluidoEnElPlan;
        }
        public boolean getIncluidoEnElPlan() {
            return incluidoEnElPlan;
        }
}
