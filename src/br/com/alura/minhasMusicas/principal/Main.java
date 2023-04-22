package br.com.alura.minhasMusicas.principal;

import br.com.alura.minhasMusicas.models.MinhasPreferidas;
import br.com.alura.minhasMusicas.models.Musica;
import br.com.alura.minhasMusicas.models.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("lithium");
        minhaMusica.setCantor("Amy lee");

        for (int i = 0; i < 1000; i++) { // medidas de exemplos para se utilizar poo
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);

    }
}