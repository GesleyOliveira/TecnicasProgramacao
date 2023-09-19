package Pessoa;

public abstract class Pessoa {
    protected String nome;
    private String genero;
    private int idade;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, String genero){
        this(nome);
        this.genero = genero;
    }
    
    public Pessoa(String nome, String genero, int idade){
        this(nome, genero);
        this.idade = idade;
    }
    
    public abstract String getNome(); //Obrigatório a declaração no 'filho'
    
    public String getGenero(){
        return genero;
    }
    
    public int getIdade(){
        return idade;
    }
}
