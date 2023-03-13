package Exercicio_11b;
    import java.util.GregorianCalendar;
    import java.text.SimpleDateFormat;
public class Exercicio_11b {
    public static void main(String args[]) {
        GregorianCalendar ano = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int atual = Integer.parseInt(sdf.format(ano.getTime()));
        int bis;
        if (atual % 4 == 0 & atual % 100 != 0 | atual % 400 == 0) {
            bis = 29;
        } else {
            bis = 28;
        }
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
            "Jun","Jul", "Agu", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, bis, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c=0; c < 12; c++){
            System.out.println("O mês " + mes[c] + " tem " + dias[c] + " dias.");
        }
    }
}
