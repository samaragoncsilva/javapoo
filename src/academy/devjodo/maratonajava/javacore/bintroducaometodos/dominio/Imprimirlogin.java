package academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio;

public class Imprimirlogin {
    public String imprime(Usuario usuario){

        if (usuario.nomeusuario.equals("tadeu2006") && usuario.senha.equals("Tadeu50A")){
            return "LOGIN VALIDO";
        }else {
            return "LOGIN INVALIDO";
        }

    }

}
