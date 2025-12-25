package academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio;

public class Idade {

    public String verificarmaioridade(int idade){
        if (idade>=18){
            return "VOCÊ É MAIOR DE IDADE" ;
        }else {
            return "VOCÊ É MENOR DE IDADE" ;
        }
    }
}
