package com.AppJava.Modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodioPorMinuto;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorMinuto() {
        return episodioPorMinuto;
    }

    public void setEpisodioPorMinuto(int episodioPorMinuto) {
        this.episodioPorMinuto = episodioPorMinuto;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
