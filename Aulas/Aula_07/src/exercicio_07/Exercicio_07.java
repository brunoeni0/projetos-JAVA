package exercicio_07;
    import java.util.Scanner;
    import java.util.Date;
    import java.text.SimpleDateFormat;
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento: ");
        int nas = Integer.parseInt(scn.next());
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int ano = Integer.parseInt(sdf.format(data));
        int idade = ano - nas;
        System.out.print("Vc tem " + idade + " anos. e tem a situação de voto ");
        if (18 <= idade & idade < 70) {
            System.out.println("Obrigatório.");
        }
        else if (idade < 16) {
            System.out.println("Não pode votar.");
        }
        else {
            System.out.println("Opcional.");
        }
    }
}
