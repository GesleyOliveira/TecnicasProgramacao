
package Pessoa;


public final class Fundamental extends Aluno {
    
    public Fundamental(String nome, String genero, int idade){
        super(nome, genero, idade);
    }
    
    public void setNota(String nota){
        if(Integer.parseInt(nota) >= 0 && Integer.parseInt(nota) <= 10){
            super.nota = Float.parseFloat(nota);
        } else {
            super.nota = 0;
        }
    }
    
    public String exibirNotas(){
        if (super.nota <= 10 && super.nota >= 9){
            return "A";
        }
        else if (super.nota < 9 && super.nota >= 7){
            return "B";
        }
        else if (super.nota < 7 && super.nota >= 6){
            return "C";
        }
        else {
            return "D";
        }
    }
    
    @Override
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    
}
