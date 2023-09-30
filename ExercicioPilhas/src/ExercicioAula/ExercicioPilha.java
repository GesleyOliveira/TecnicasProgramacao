package ExercicioAula;


import java.util.*;


public class ExercicioPilha {
    
    public static String palavraInvertida = "";

    public static boolean palindromo(String palavra){
        
        // Para converter Char para String utilize Character.toString(char);
        PilhaString pilha = new PilhaString();
        for (int i=0; i<palavra.length(); i++){
            pilha.empilhar(Character.toString(palavra.charAt(i)));   
        }
        
        while(!pilha.pilhaVazia()){
            //Desempilhar e concatenar em uma nova String
            palavraInvertida+= pilha.desempilhar();
        }
        if(palavra.toUpperCase().equals(palavraInvertida.toUpperCase())){
            return true;
        } else {
        return false;
        }
    }
    
    public static boolean validaBalanceamento(String expressao){
        
        PilhaString pilha = new PilhaString();
        for (int i=0; i<expressao.length(); i++){
            
            switch(expressao.charAt(i)){
                case '(':
                    pilha.empilhar(")");
                    break;
                case '[':
                    pilha.empilhar("]");
                    break;
                case '{':
                    pilha.empilhar("}");
                    break;    
            }
            
            if(expressao.charAt(i) == ')' || 
                expressao.charAt(i) == ']' ||
                    expressao.charAt(i) == '}'){
                if(pilha.ExibirTopo().equals(Character.toString(expressao.charAt(i)))){
                    pilha.desempilhar();
                } else {
                    return false;
                }
            }
        }
               
       if (pilha.pilhaVazia()){
           return true;
       } else {
           return false;
       }
       
    }
    
    public static PilhaInteger ordenaPilhaInt(PilhaInteger pilhaEntrada){
        
        List<PilhaInteger> aux = new ArrayList<>();
        aux.add(new PilhaInteger());
        boolean empilhado = false;
        PilhaInteger pilhaSaida = new PilhaInteger();
        //int temp = 0;
        
        while(!pilhaEntrada.pilhaVazia()){
            for(int indiceTemp = 0; indiceTemp < aux.size(); indiceTemp++){
            
            if(aux.get(indiceTemp).pilhaVazia()){
               aux.get(indiceTemp).empilhar(pilhaEntrada.desempilhar());
               empilhado = true;
            } else if (pilhaEntrada.ExibirTopo() >= aux.get(indiceTemp).ExibirTopo()) {
                aux.get(indiceTemp).empilhar(pilhaEntrada.desempilhar());
                empilhado = true;
            } else {
                aux.get(indiceTemp);
            }  
            
            }
        }
        return null;
    }
    
}
