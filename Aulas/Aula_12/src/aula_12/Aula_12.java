package aula_12;
public class Aula_12 {
    static void soma (int a, int b) {
            int s = a + b;
            System.out.println("A soma é " + s);
        }
     static int calcular (int x, int y) {
        int s = x + y;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        soma(5, 2);
        int novo = calcular(3, 8);
        System.out.println("Novo valor " + novo);
    }
}
