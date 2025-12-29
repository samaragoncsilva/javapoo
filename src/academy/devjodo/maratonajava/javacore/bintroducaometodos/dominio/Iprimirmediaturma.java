package academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio;

public class Iprimirmediaturma {

        public double imprime(MediaTurma mediaturma){

        double soma=0;

        for (int i=0; i<mediaturma.notas.length;i++){
            soma+=mediaturma.notas[i];
        }

        return soma/mediaturma.notas.length;
    }
}
