package aula_05;
public class Aula_05 {
    public static void main(String[] args) {
        int v1, v2, r;
        v1 = 4;
        v2 = 8;
        r = v1 > v2 ? v1-v2 : v1+v2;
        System.out.println("O valor de R é " + r);
        
        String n1, n2, n3, n;
        n1 = "Gustavo";
        n2 = "Gustavo";
        n3 = new String("Gustavo");
        n = n1.equals(n3) ? "são iguais" : "não são iguais";
        System.out.println("Então os valores são iguais? " + n);
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean c;
        //c = (x < y && y < z) ? true : false; && serve como and
        //c = (x < y || y < z) ? true : false; || serve como or
        c = (x < y ^ y == z) ? true : false;// serve para ver se são diferentes 
        System.out.println("O Resultado é " + c);
    }
}
