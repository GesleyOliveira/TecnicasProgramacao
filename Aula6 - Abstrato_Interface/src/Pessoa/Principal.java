package Pessoa;
import Pessoa.*;
import java.util.List;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l;
        
        Pessoa pessoa = new Colegial("Gesley", "Masculino", 29);
        System.out.println("Meu nome é " + pessoa.getNome());
        
        Aluno a1, a2;
        
        a1 = new Aluno("Gesley", "Masculino", 29, 10.0);
        a2 = new Aluno("Oliveira", "Masculino", 29, 9.0);
        System.out.println("Meu nome é " + a1.getNome());
        
        Funcionario f;
        
        
        
    }
    
}
