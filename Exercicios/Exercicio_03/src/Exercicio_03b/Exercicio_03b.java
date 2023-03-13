package Exercicio_03b;
    import java.util.Date;
    import java.text.SimpleDateFormat;
public class Exercicio_03b {
    public static void main(String args[]) {
        Date ano = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        System.out.println("O ano atual é " + sdf.format(ano));    
    }
}
