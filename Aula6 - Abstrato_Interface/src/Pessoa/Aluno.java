
package Pessoa;

public abstract class Aluno extends Pessoa {
    protected float nota;
    public abstract String exibirNotas();
    public abstract void setNota(String nota);
    
    public Aluno(String nome, String genero, int idade){
        super(nome, genero, idade);
    }
    
    @Override
    public String getNome(){
        if (super.getGenero().equals("masculino")){
            return "Aluno " + super.nome;
        } else {
            return "Aluna " + super.nome;
        }
    }
}
