
package Classes;

public final class Professor extends Funcionario{
    private float salarioHora, qtdHoras;
    
    public Professor(String nome, String genero, int idade, double salarioBase, float salarioHora){
        super(nome, genero, idade, salarioBase);
        this.salarioHora = salarioHora;
    }
    
    @Override
    public double calculaSalario(){
        return super.getSalarioBase() + (salarioHora * qtdHoras);
    }
    @Override
    public String getNome(){
        if (super.getGenero().equals("masculino")){
            return "Professor " + super.getNome();
        } else {
            return "Professora " + super.getNome();
        }
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public float getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(float qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
}
