/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    
    String nome;
    int idade;
    Pessoa mae, pai;
    
    List<Pessoa> filhos = new ArrayList<>();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String nomeFilhos(){
        String mensagem="Meus filhos sao ";
        int i;
        for( i=0;i<filhos.size();i++)
        {
            mensagem+=filhos.get(i).nome + ", ";     
        }
        
        return mensagem;
    }
    
}
