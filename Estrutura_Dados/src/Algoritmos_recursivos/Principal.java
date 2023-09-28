package Algoritmos_recursivos;

/**
 *
 * @author Alunos
 */
public class Principal {
    
public static void main(String[] args) {
        
        Fatorial fatRec = new Fatorial();
        Fatorial fatIn = new Fatorial();
        
        System.out.println(fatRec.calcularFatorialRecursivo(7));
        System.out.println(fatIn.calcularFatorialInterativa(7));
        
        // Calcula o fatorial de forma iterativa
        /*long fatorialIterativo = calcularFatorialInterativa(numero);
        System.out.println("Fatorial de " + numero + " (iterativo): " + calcularFatorialInterativa(numero));;*/
        
        
    }
}
        