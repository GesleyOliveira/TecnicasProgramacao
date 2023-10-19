
package Classes;

public abstract class Aluno extends Pessoa {
    protected float nota;
    public abstract String exibirNotas();
    public abstract void setNota(String nota);
    
    public Aluno(String nome, String genero, int idade){
        super(nome, genero, idade);
    }
    
    public Aluno(String nome, String genero, int idade, float nota){
        super(nome, genero);
        this.nota = nota;
    }
    
    @Override
    public String getNome(){
        String genero = super.getGenero().toUpperCase();
        if (genero.equals(("MASCULINO"))){
            return "Aluno " + super.getNome();
        } else {
            return "Aluna " + super.getNome();
        }
    }

    public float getNota() {
        return nota;
    }
    
    
}
