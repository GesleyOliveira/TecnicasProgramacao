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
public class Aula2 {
    public static void main(String[] args) {
        // TODO code application logic here
        //List<Pessoa> arvoreG = new ArrayList(Pessoa);
        PessoaPrivada[] arvore = new PessoaPrivada[10];
        //Avos
        arvore[0] = new PessoaPrivada("José");
        arvore[1] = new PessoaPrivada("Maria");
        //Pais
        arvore[2] = new PessoaPrivada("Mauricio", 80);
        arvore[3] = new PessoaPrivada("Creusa", 75);
        //Eu
        arvore[4] = new PessoaPrivada("Gesley", 29, arvore[3]);
        //Irmaos
        arvore[5] = new PessoaPrivada("William", 48, arvore[3]);
        
        System.out.println(arvore[4].getNome() + " => Mae" + arvore[4].getMae().getNome());
        
    }
    
}
