package Classe;

import java.util.List;
import java.util.ArrayList;

public class Controle {
    private List <Pessoa> listaPessoa ;
    
    
    public Controle(){
        listaPessoa = new ArrayList <>();
    }
    
    public void addPessoa(String nome, int idade, EnumGenero genero){
       listaPessoa.add(new Professor(nome, genero, idade));
    }
    
    //Método para criar um novo professor e adiciona-lo a listaProfessores
    public void addProfessor(String nome, int idade, EnumGenero genero){
        //Criar o professor.
        listaPessoa.add(new Professor(nome, genero, idade));
    }
    
     public void addFundamental(String nome, int idade, EnumGenero genero){
        listaPessoa.add(new Fundamental(nome, genero, idade));
    }
    
    public void addAlunoColegial(String nome, int idade, EnumGenero genero){
        listaPessoa.add(new Colegial(nome, genero, idade));
    }
    
      public boolean removerPessoa(int indice){
        if(indice>=0 && indice< listaPessoa.size()){
            listaPessoa.remove(indice);
            return true;
        }
        else
            return false;
    
    }
    public List<Pessoa> getListaPessoa() {
        return listaPessoa;
    }
    
  
    
   
}
