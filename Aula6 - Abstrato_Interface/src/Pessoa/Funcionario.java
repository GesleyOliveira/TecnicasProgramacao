package Pessoa;

public abstract class Funcionario extends Pessoa {
    public abstract double calculaSalario();
    private double salarioBase;
    
    
    public Funcionario(String nome, String genero, int idade, double salarioBase){
        super(nome, genero, idade);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public String getNome(){
        if (super.getGenero().equals("masculino")){ 
            return "Sr. " + super.getNome();
        } else {
            return "Sra. " + super.getNome(); 
        }
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void registrarPonto(){
/* === Acessar o BD e registrar o horário == */
    }
}
