package academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio;

public class Senha {
    public String verificarsenha(String senha) {
        if (senha.length() < 8) {
            return "senha fraca";
        }
        else if (senha.matches(".*[A-Z].*") && senha.matches(".*[0-9].*")){
            return "senha excelente";
        }
        return "senha boa";
    }
}

