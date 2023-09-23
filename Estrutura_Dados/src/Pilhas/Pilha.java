/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Pilha implements InterfacePilha{
    
    @Override
    public void empilhar(Object item){
        pilha.add(item);
    }
    
    @Override
    public Object desempilhar(){
        if(!pilha.isEmpty()){
            return pilha.remove(pilha.size()-1);
        } else {
            return null;}
    }
    
    @Override
    public boolean pilhaVazia(){
        return pilha.isEmpty();
    }
}
