package aula_03;
    import java.util.Scanner;
public class Aula_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String no = teclado.nextLine();
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        float media = numero.nextFloat();
        System.out.printf("%s tirou %.2f na média \n", no, media);
        
        
        String nome = "Gustavo";
        float nota = 8.5f;
        System.out.format("\nA nota de %s é %.2f \n", nome, nota);
    }
    
}
