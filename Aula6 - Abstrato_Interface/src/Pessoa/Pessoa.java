package Pessoa;

public abstract class Pessoa {
    
    private String nome;
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
    
    //   ***** Getter *****
    
    public String getNome(){
        return nome;
    } //Obrigatório a declaração no 'filho'
    
    public String getGenero() {
        return genero;
    }
    
    public int getIdade() {
        return idade; 
    }
    
    //   ***** Setter *****
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
