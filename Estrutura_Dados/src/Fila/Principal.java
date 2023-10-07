package Fila;


public class Principal {
    
    public static void main(String[] args) {
        /*Fila filaPessoa = new Fila();
        
        filaPessoa.adicionar("Gesley");
        filaPessoa.adicionar("Laura");
        filaPessoa.adicionar("Pedro");
        filaPessoa.adicionar("João");*/
        
        FilaPrioritaria filaPessoaPrioritaria = new FilaPrioritaria();
        
        for(int i = 0; i < 10; i++){
            filaPessoaPrioritaria.adicionar((int)Math.round(Math.random()*1000));
        }
        
        for (int i = filaPessoaPrioritaria.tamanho(); i>0; i--){
            System.out.println("Remover: " + filaPessoaPrioritaria.remover().toString());
        }
        
        
        /*for (int i = filaPessoa.tamanho(); i>0; i--){
            System.out.println("Remover: " + filaPessoa.remover().toString());
        }*/
        
    }
}
