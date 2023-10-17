
package GUI;

import javax.swing.JFrame;

public class Exemplo2 {
    
    private JFrame janela;
    //Construtor
    public Exemplo2(){
        janela = new JFrame("Segunda Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setVisible(true);        
    }
    
    public static void main(String[] args) {
        new Exemplo2(); // Não será manipulado, então não precisa criar uma variável auxiliar;
    }
}
