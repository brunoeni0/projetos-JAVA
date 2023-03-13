package aula_11;
    import java.util.Arrays;
public class Aula_11c {
    public static void main(String args[]) {
        int num[] = new int[5];
        Arrays.fill(num, 7);
        for (int c: num) {
            System.out.print(c + " ");
        }
    }
}
