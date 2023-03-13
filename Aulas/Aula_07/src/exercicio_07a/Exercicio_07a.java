package exercicio_07a;
    import java.util.Scanner;
public class Exercicio_07a {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Quantas pernas tem? ");
        int quant = scn.nextInt();
        String tipo;
        
        tipo = switch (quant) {
            case 1 -> "Saci";
            case 2 -> "Bípedi";
            case 4 -> "Quadrúpede";
            case 6, 8 -> "Aranha";
            default -> "ET";
        };
        
        System.out.println("A criatura é do tipo " + tipo);
    }
}
