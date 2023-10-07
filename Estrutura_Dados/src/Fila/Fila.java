package Fila;

import java.util.*;

public class Fila {
    //Variavel fila está sendo declarada
    private List<Object> fila;
    
    public Fila(){
        //Variavel fila está sendo instanciada...
        fila = new ArrayList<>();
    }
    
    public void adicionar(Object item){
        fila.add(item);
    }
    
    public Object remover(){
        if(!fila.isEmpty()){
            return fila.remove(0);
        } else {
            return null;
        }   
    }
    
    public Object exibirInicio(){
        return fila.get(0);
    }
    
    public int tamanho(){
        return fila.size();
    }
    
}
