
package Classes;

import java.awt.*;
import java.util.*;

public class Controle {
    
    //Atributos
    
    private java.util.List<Object> listaProfessores;
    
    public Controle(){
        listaProfessores = new ArrayList<>();
    }
    
    //Método para criar um novo professor e adiciona-lo a listaProfessores
    public void addProfessor(String nome, EnumGenero genero, int idade){
        //Criar o professor.
        listaProfessores.add(new Professor(nome, genero, idade));
    }
}
