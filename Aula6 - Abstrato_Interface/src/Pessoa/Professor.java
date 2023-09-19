
package Pessoa;

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
            return "Professor " + super.nome;
        }else{
            return "Professora " + super.nome;
        }
    }
}
