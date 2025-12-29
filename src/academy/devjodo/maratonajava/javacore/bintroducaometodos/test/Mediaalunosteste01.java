package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Iprimirmediaturma;
import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.MediaTurma;

public class Mediaalunosteste01 {
    public static void main(String[] args) {
        MediaTurma mediaturma=new MediaTurma();
        Iprimirmediaturma imprimirmediaturma=new Iprimirmediaturma();
        mediaturma.notas= new double[]{5,7,8,9,4,3,2, 8};
        double resultado;
        resultado=imprimirmediaturma.imprime(mediaturma);
        System.out.println("MEDIA DA TURMA PRIMEIRO BIMESTRE(TURMA 02-MAT)");
        System.out.printf("%.1f%n",resultado);


        }
    }

