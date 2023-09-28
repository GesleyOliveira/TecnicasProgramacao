
package Pessoa;


public final class Colegial extends Aluno {
    
    public Colegial(String nome, String genero, int idade){
        super(nome, genero, idade);
    }
    
    public Colegial(String nome, String genero, int idade, float nota){
        super(nome, genero, idade, nota);
    }
    
    public void setNota(String nota){
        if(Integer.parseInt(nota) >= 0 && Integer.parseInt(nota) <= 10){
            super.nota = Float.parseFloat(nota);
        } else {
            super.nota = 0;
        }
    }
    
    public String exibirNotas(){
        return String.valueOf(super.nota);
    }
    
    
}
