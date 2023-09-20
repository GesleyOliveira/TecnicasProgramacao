
package Pessoa;


public final class Colegial extends Aluno {
    
    public Colegial(String nome, String genero, int idade){
        super(nome, genero, idade);
    }
    
    public void setNota(String nota){
        if(Integer.parseInt(nota) >= 0 && Integer.parseInt(nota) <= 10){
            super.nota = Float.parseFloat(nota);
        } else {
            super.nota = 0;
        }
    }
}
