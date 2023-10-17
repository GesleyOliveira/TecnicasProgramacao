
package GUI;

import java.awt.*;
import javax.swing.*;

public class Exemplo3 {
    
    private JFrame janela;
    //Construtor
    public Exemplo3(){
        janela = new JFrame("Segunda Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Atribui o container de janela a variável c
        Container c = janela.getContentPane();
        JLabel rotulo = new JLabel("Elemento JLabel");
        JButton botao = new JButton("Botão Simples");
        c.setLayout(new FlowLayout());
        
        c.add(rotulo);
        c.add(botao);        
        
        janela.setSize(400, 300);
        janela.setVisible(true);        
    }
    
    public static void main(String[] args) {
        new Exemplo3();
    }
    
    
}
