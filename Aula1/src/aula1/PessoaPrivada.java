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

//Exercício 1 da Aula 25/08
public class PessoaPrivada {
    private String nome;
    private int idade;
    private aula1.PessoaPrivada mae, pai;
    public List<aula1.PessoaPrivada> filhos = new ArrayList<>();
    public List<aula1.PessoaPrivada> irmaos = new ArrayList<>();
    
    
    
    //construtor 
    //O que identifica o construtor, é que ele não tem retorno
    public PessoaPrivada(String nome){
        this.nome=nome;
    }
    public PessoaPrivada(String nome, int idade) {
       this(nome);
       this.idade=idade;
    }
    public PessoaPrivada(String nome, int idade, PessoaPrivada M){
        this(nome, idade);
        this.mae=M;
        M.addFilhos(this);
        
        for(int i=0;i<M.filhos.size();i++){
            if (filhos.get(i) != this);
                this.irmaos.add(M.filhos.get(i));
                }
    }
    //****************
    //Setters
    //Void significa que não vai retornar nada
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void serMae(PessoaPrivada mae){
        this.mae=mae;
    }
    public void setPai(PessoaPrivada pai){
        this.pai=pai;
    }
    //****************
    //Getters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public PessoaPrivada getMae(){
        return this.mae;
    }
    public PessoaPrivada getPai(){
        return this.pai;
    }
    //***************
    public String nomeFilhos(){
        String mensagem="Meus filhos sao ";
        int i;
        for( i=0;i<filhos.size();i++)
        {
            mensagem+=filhos.get(i).nome;
            if (i < filhos.size()-1){
                mensagem+=", ";
            }
        }
        
        return mensagem;
    }
    
    public int qtdFilhos(){
        return this.filhos.size();
    }
    
    public String nomeIrmaos(){
        String mensagem="Meus irmaos sao ";
        int i;
        for( i=0;i<irmaos.size();i++)
        {
            mensagem+=irmaos.get(i).nome;
            if (i < irmaos.size()-1){
                mensagem+=", ";
            }
        }
        
        return mensagem;
    }
    
    public int qtdIrmaos(){
        return this.irmaos.size();
    }
    public void addFilhos(PessoaPrivada P){
       filhos.add(P);
       
    }
}

