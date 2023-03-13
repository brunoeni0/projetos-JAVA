package aula_06;
    import java.util.Scanner;
    import java.text.SimpleDateFormat;
    import java.util.Calendar;
public class Aula_06 {

    public static void main(String[] args) {
        System.out.print("Digite a primeira nota: ");
        Scanner aluno = new Scanner(System.in);
        float n1 = aluno.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = aluno.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.printf("Sua média é %.2f \n", m);
        if (m > 9) {
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
        
        Scanner pessoa = new Scanner(System.in);
        System.out.print("Digite sua Data de nascimento: ");
        int nasc = pessoa.nextInt();
        Calendar ano = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int atual = Integer.parseInt(sdf.format(ano.getTime()));
        if (atual - nasc >= 18) {
            System.out.println("O voto é obrigatório");
        } else {
            System.out.println("O voto não é obrigatório");
        }
    }
}
