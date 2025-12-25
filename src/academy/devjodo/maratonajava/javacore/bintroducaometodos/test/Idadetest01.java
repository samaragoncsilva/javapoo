package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Idade;

public class Idadetest01 {
    public static void main(String[] args) {
        Idade idade=new Idade();
        String resultado;
        resultado=idade.verificarmaioridade(20);
        System.out.println(resultado);
    }
}
