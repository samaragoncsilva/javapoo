package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Imposto;

public class Impostoteste01 {
    public static void main(String[] args) {
        Imposto imposto=new Imposto();
        double resultado;
        resultado= imposto.valorcomimposto(20);
        System.out.printf("%.0f%n",resultado);
    }
}
