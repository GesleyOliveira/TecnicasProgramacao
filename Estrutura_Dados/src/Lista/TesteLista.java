package Lista;

import Lista.ListaLigada;

public class TesteLista {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        System.out.println(lista.exibirLista());
        lista.adicionar("x", 2);
        System.out.println(lista.exibirLista());
        lista.remover(1);
        System.out.println(lista.exibirLista());
    }
    
}
