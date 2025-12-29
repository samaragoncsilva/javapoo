package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Imprimirbatimentos;
import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Relogiocardiaco;

public class Relogiocardiacoteste01 {
    public static void main(String[] args) {
        Relogiocardiaco relogiocardiaco=new Relogiocardiaco();
        Imprimirbatimentos imprimirbatimentos=new Imprimirbatimentos();
        relogiocardiaco.batimentos=new int[]{40};

        String resultado;
        resultado=imprimirbatimentos.imprime(relogiocardiaco);
        System.out.println(resultado);
    }
}
