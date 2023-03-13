package aula_08;
public class Aula_08 {
    public static void main(String[] args) {
        int c = 0;
        while (c < 10) {
            c++;
            if (c == 2 || c == 4 || c == 6){
                continue;
            }
            System.out.println("Contando " + c);
            if (c == 7) {
                break;
            }
        }
    }
}
