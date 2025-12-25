package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Salario;

public class Salarioteste01 {
    public static void main(String[] args) {
        Salario salario=new Salario();
        double resultado;
        resultado=salario.aumentosalario(1200);
        System.out.printf("%.0f%n",resultado);

    }
}
