package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Imprimirlogin;
import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Usuario;

public class Usuariotest01 {
    public static void main(String[] args) {
        Usuario usuario=new Usuario();
        Imprimirlogin imprimirlogin=new Imprimirlogin();
        usuario.nomeusuario="tadeu745";
        usuario.senha="tAdDeu30";
        String resultado;
        resultado= imprimirlogin.imprime(usuario);
        System.out.println(resultado);

    }
}
