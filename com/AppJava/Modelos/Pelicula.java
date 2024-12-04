package com.AppJava.Modelos;

public class Pelicula extends Titulo{
    private String director;

    private void setDirector(String director){
        this.director = director;
    }

    private  String getDirector(){
        return  this.director;
    }
}
