package Classes;
import Pessoa.*;
import java.util.List;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pessoa = new Colegial("Gesley", "Masculino", 29);
        System.out.println("Meu nome é " + pessoa.getNome());
        
        Colegial a1, a2;
        
        a1 = new Colegial("Gesley", "Masculino", 29);
        a2 = new Colegial("Oliveira", "Masculino", 29);
        System.out.println("Meu nome é " + a1.getNome());
        
        Funcionario f;
        
        
        
    }
    
}
