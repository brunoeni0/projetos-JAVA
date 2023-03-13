package aula_03b;
public class aula_03b {
    public static void main(String args[]) {
        int valor = 5;
        String nome = Integer.toString(valor);
        System.out.println("O valor é " + nome);
        
        String x = "9";
        int num = Integer.parseInt(x);
        System.out.println("O número é " + num);
        
        String algo = "5.5";
        float f = Float.parseFloat(algo);
        System.out.printf("O resultado foi %.2f \n", f);
    }
}
