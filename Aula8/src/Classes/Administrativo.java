package Classes;


public final class Administrativo extends Funcionario {
    
    public Administrativo(String nome, String genero, int idade, double salarioBase){
        super(nome, genero, idade, salarioBase);
    }
    
    @Override
    public double calculaSalario(){
        return super.getSalarioBase();
    }
}
