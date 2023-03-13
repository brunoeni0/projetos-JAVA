package exercicio_03;
    import java.awt.Toolkit;
    import java.awt.Dimension;
public class Exercicio_03 {
    public static void main(String args[]) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tela = tk.getScreenSize();
        System.out.print("O tamanho da tela é de ");
        System.out.println(tela.width + " X " + tela.height);
        
    }
}
