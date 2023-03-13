package aula_11;
public class Aula_11 {
    public static void main(String[] args) {
        /*String[] l = {"a" ,"b" ,"c" ,"d", "e", "f"};
        for (int c=0; c<=l.length-1; c++){
            System.out.println("Na posição "+ c + " temos o valor " + l[c]);
        }
        System.out.println("Total de casas de L " + l.length);*/
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
            "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c=0; c< 12; c++){
            System.out.println("No mês " + mes[c] + " Tem " + total[c] + " dias.");
        }
    }
    
}
