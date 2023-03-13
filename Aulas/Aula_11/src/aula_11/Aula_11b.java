package aula_11;
    import java.util.Arrays;
public class Aula_11b {
    public static void main(String args[]) {
        double num[] = {3.5, 2.75, 9, -4.5, -7};
        Arrays.sort(num);
        int pos = Arrays.binarySearch(num, 9);
        System.out.println("Encontrei o valor na posição " + pos);
        System.out.println("");
        for (double valor: num){
            System.out.print(valor + " ");
        }
        System.out.println("\n");
    }
}
