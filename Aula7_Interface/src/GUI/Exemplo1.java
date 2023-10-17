package GUI;

import javax.swing.JFrame;


public class Exemplo1 {
    
    private JFrame janela;
    
    public Exemplo1(){
        janela = new JFrame("Primeira Janela");
        janela.setSize(400, 300);
        janela.setVisible(true); // define que a janela estará vísivel;
    }
    
    public static void main(String[] args){
        Exemplo1 p = new Exemplo1();
    }
}
