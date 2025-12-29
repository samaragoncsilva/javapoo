package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Impressoraestudante;

public class Estudanteteste01 {
    public static void main(String[] args) {
        Estudante estudante01=new Estudante();
        Estudante estudante02=new Estudante();
        Impressoraestudante impressora=new Impressoraestudante();

        estudante01.nome= "bernardo";
        estudante01.idade= 15;
        estudante01.sexo= 'M';

        estudante02.nome="bia";
        estudante02.idade= 20;
        estudante02.sexo= 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);



    }
}
