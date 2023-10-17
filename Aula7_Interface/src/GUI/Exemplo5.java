
package GUI;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Exemplo5 implements ActionListener{
    
    private JFrame janela;
    private JButton jb, jb2;
    
    public Exemplo5(){
        janela = new JFrame("Segunda Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        
        jb = new JButton("Ok");
        jb.addActionListener(this);
        
        jb2 = new JButton("Botão");
        jb2.addActionListener(this);
        
        Container c = janela.getContentPane();
        c.add(jb);
        c.add(jb2);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb){
            JOptionPane.showMessageDialog(janela, "OK");
        } else if(e.getSource() == jb2){
            JOptionPane.showMessageDialog(janela, "Botao 2");
        }
    }
    
    public static void main(String[] args) {
        new Exemplo5();
    }
}
