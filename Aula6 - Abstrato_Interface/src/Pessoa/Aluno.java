
package Pessoa;

public abstract class Aluno extends Pessoa {
    protected float nota;
    public abstract String exibirNotas();
    public abstract void setNota(String nota);
    
    public Aluno(String nome, String genero, int idade){
        super(nome, genero, idade);
    }
    
    public Aluno(String nome, String genero, float nota){
        super(nome, genero);
        this.nota = nota;
    }
    
    @Override
    public String getNome(){
        if (super.getGenero().equals("masculino")){
            return "Aluno " + super.getNome();
        } else {
            return "Aluna " + super.getNome();
        }
    }

    public float getNota() {
        return nota;
    }
    
    
}
