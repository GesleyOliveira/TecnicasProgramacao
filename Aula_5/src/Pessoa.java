/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
     public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
     
     public Pessoa(String nome, String cpf, String telefone){
        this(nome,cpf);
        this.telefone = telefone;
    }
    
    public Pessoa(String nome, String cpf, String telefone, String endereco){
        this(nome, cpf, telefone);
        this.endereco = endereco;
    }
    
}
