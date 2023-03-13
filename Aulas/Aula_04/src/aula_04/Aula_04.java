package aula_04;
public class Aula_04 {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        int numero = 5;
        
        int valor = 5 + numero++; // O valor é igual a 10 porque nóis usamos o pós inclemento.
        //int valor = 5 + ++numero; agora vai sair o valor 11 porque agora nóis usamos o pre inclemento.
        System.out.println("O valor é igual a " + valor);
        
        int x = 4;
        x -= 2; // x = x - 2;
        x *= 4;
        System.out.println("O valor de X é igual a " + x);
        
        float v = 5.3f;
        float y = -3.5f;
        System.out.println("O Valor arredondado para cima fica " + Math.ceil(v));
        System.out.println("O Valor arredondado para baixo fica " + Math.floor(v));
        System.out.println("O valor arrendondado normal fica " + Math.round(v));
        System.out.println("O valor absoluto é " + Math.abs(y));
        
        double ale = Math.random();
        System.out.println("O número foi " + ale);
        
        int rand = (int) Math.round(15 + Math.random() * (50 - 15));
        // int rand = (int) Math.round(Math.random()) * 10;
        System.out.println("O valor aleatório foi " + rand);
    }
    
}
