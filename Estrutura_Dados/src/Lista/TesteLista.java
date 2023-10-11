package Lista;


public class TesteLista {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        /*lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        System.out.println(lista.exibirLista());
        lista.adicionar("x", 2);
        System.out.println(lista.exibirLista());
        lista.remover(1);
        System.out.println(lista.exibirLista());*/
        lista.adicionar(440, ListaLigada.TipoOrdenacao.DECRESCENTE);
        lista.adicionar(10, ListaLigada.TipoOrdenacao.DECRESCENTE);
        lista.adicionar(550, ListaLigada.TipoOrdenacao.DECRESCENTE);
        lista.adicionar(2500, ListaLigada.TipoOrdenacao.DECRESCENTE);
        System.out.println(lista.exibirLista());
        lista.getLista2(550);
        System.out.println(lista.getLista2(10));
    }
    
}
