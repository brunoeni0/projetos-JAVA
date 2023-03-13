package exercicio_01;
import java.util.Date;
import java.text.DateFormat;
public class Exercicio_01 {
    public static void main(String args[]) {
        DateFormat df = DateFormat.getTimeInstance();
        Date data = new Date();
        System.out.println("A hora do sistema é: " + df.format(data));
    }
}
