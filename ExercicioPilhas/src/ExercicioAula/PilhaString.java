package ExercicioAula;


import java.util.ArrayList;
import java.util.List;


public class PilhaString {
        private List<String> pilha = new ArrayList<String>();
    
    public void empilhar(String item){
        pilha.add(item);
    }
    
    public String desempilhar(){
        if(!pilha.isEmpty()){
            return pilha.remove(pilha.size()-1);
        } else {
            return null;
        }
    }
    
    public String ExibirTopo(){
        if(!pilha.isEmpty()){
            return pilha.get(pilha.size()-1);
        } else {
            return null;
        }
    }
    
    public boolean pilhaVazia(){
        return pilha.isEmpty();
    }
}

