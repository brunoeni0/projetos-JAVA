package exercicio_09;
    import javax.swing.JOptionPane;
public class Exercicio_09 {
    public static void main(String[] args) {
        int num, c = 0, par = 0;
        int impar = 0, maior = 0, media = 0;
        
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "teste do JOptionPane", JOptionPane.INFORMATION_MESSAGE);
        
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor \n(0 interrompe)", "Entrada de Dados", 2));
            if (num == 0) break;
            c++;
            if (num % 2 == 0) par++; else impar++;
            if (num > 100) maior++;
            media += num; 
        } while (c < c+1);
        JOptionPane.showMessageDialog(null,
                "Resultado:" +
                "\n----------------------------" +
                "\nTotal de valores: " + c +
                "\nTotal de pares: " + par +
                "\nTotal de Ímpares: " + impar +
                "\nAcima de 100: " + maior +
                "\nMédia de valores: " + media / c, "Resultado Final", 2);
    }
    
}
