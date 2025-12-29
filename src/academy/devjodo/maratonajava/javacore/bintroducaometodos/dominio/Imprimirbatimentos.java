package academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio;

public class Imprimirbatimentos {

    public String imprime(Relogiocardiaco relogiocardiaco) {


        for (int batimentos : relogiocardiaco.batimentos)
            if (batimentos <= 40) {
                return "batimento critico(emergencia)";
            } else if (batimentos <= 50) {
                return "alerta";
            } else if (batimentos >= 60 && batimentos <= 100) {
                return "normal";
            } else {
                return "emergencia";
            }
        return "";
    }
}






