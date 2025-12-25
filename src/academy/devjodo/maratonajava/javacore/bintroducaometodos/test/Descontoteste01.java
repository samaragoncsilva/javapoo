package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Desconto;

public class Descontoteste01 {
    public static void main(String[] args) {
        Desconto desconto=new Desconto();
        double resultado;
        resultado= desconto.valorcomdesconto(180);
        System.out.printf("%.0f%n",resultado);
    }
}
