package Fila;

import java.util.*;

public class FilaPrioritaria {
    //Variavel fila está sendo declarada
    private List<Object> fila;
    
    public FilaPrioritaria(){
        //Variavel fila está sendo instanciada...
        fila = new ArrayList<>();
    }
    
    public void adicionar(Object item){
        // Os itens serão adicionados em ordem crescente 
        // Valores menores no início e maiores no final
        boolean foiAdicionado = false;
        if (fila.isEmpty()){
            fila.add(item);
        } else {
            // código para adicionar de forma ordenada;
            for (int i=0; i < fila.size(); i++){
                if(Integer.parseInt(fila.get(i).toString()) > Integer.parseInt(item.toString())){
                    fila.add(i, item);
                    foiAdicionado = true;
                    break;
                }
            }
            if (foiAdicionado == false){
            fila.add(item);
        }
        }
        
    }
    
    public Object remover(){
        if(!fila.isEmpty())
            return fila.remove(0);
        else
            return null;
    }
    
    public Object exibirInicio(){
        return fila.get(0);
    }
    
    public int tamanho(){
        return fila.size();
    }
    
}
