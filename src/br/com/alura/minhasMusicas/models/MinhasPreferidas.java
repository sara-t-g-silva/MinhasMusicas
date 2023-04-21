package br.com.alura.minhasMusicas.models;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo()+"é preferido pela maioria dos ouvintes");
        }else{
            System.out.println(audio.getTitulo()+"não é ruim! Seu gosto é peculiar");
        }
    }
}
