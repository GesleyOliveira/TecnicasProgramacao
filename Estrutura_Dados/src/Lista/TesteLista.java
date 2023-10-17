package Lista;

import javax.swing.JOptionPane;


public class TesteLista {
   
    
    public static void main(String[] args) {
        
        String listaEntrada = JOptionPane.showInputDialog("Entre com um número para importar: "); //Usando Swing entrada
        int numero = Integer.parseInt(listaEntrada); // Convertendo, pois a entrada do Swing input dialog é String
    
        ListaLigada lista = new ListaLigada();
        /*lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        System.out.println(lista.exibirLista());
        lista.adicionar("x", 2);
        System.out.println(lista.exibirLista());
        lista.remover(1);
        System.out.println(lista.exibirLista());*/
        lista.adicionar(numero, ListaLigada.TipoOrdenacao.DECRESCENTE);
        lista.adicionar(numero, ListaLigada.TipoOrdenacao.DECRESCENTE);
        lista.adicionar(numero, ListaLigada.TipoOrdenacao.DECRESCENTE);
        lista.adicionar(numero, ListaLigada.TipoOrdenacao.DECRESCENTE);
        System.out.println(lista.exibirLista());
        lista.getLista2(550);
        System.out.println(lista.getLista2(10));
    }
    
}
