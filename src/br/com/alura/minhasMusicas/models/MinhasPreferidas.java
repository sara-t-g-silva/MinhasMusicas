package br.com.alura.minhasMusicas.models;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo()+" seu gosto musical está parecido com a maioria dos ouvintes");
        }else{
            System.out.println(audio.getTitulo()+" Seu gosto diverge um pouco do que a maioria dos ouvintes escutam");
        }
    }
}
