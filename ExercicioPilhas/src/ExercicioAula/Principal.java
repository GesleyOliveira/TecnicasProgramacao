
import ExercicioAula.PilhaString;
import ExercicioAula.ExercicioPilha;


/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {
        
        PilhaInteger p = new PilhaInteger();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        
        while(!p.pilhaVazia()){
            System.out.println(p.desempilhar());
        }
        
        PilhaString pString = new PilhaString();
        pString.empilhar("A");
        pString.empilhar("B");
        pString.empilhar("C");
        
        while(!pString.pilhaVazia()){
            System.out.println(pString.desempilhar());
        }
        
        System.out.println(ExercicioPilha.palindromo("Tenet"));
        
        System.out.println(ExercicioPilha.validaBalanceamento("{{[(())]}}"));
        
    }
    
}
