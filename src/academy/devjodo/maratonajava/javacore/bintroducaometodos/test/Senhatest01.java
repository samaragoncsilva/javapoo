package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Senha;

public class Senhatest01 {
    public static void main(String[] args) {
        Senha senha=new Senha();
        String resultado;
        resultado= senha.verificarsenha("samar2A5");
        System.out.println(resultado);
    }
}
