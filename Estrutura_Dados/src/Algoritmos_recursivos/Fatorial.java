package Algoritmos_recursivos;

/**
 *
 * @author Alunos
 */
public class Fatorial {
    
    public int numero, valorCalculado = 1;
    

    
    public int calcularFatorialRecursivo(int numero){
        if (numero <= 0) {
            return valorCalculado = 1; // O fatorial de 0 é 1
        } else {
            return valorCalculado = numero * calcularFatorialRecursivo(numero - 1);
        }
    }
    
    public int calcularFatorialInterativa(int numero){
        if (numero <= 0) {
            return valorCalculado = 1; // O fatorial de 0 é 1
        } else {

        for (int i = 1; i <= numero; i++) {
            valorCalculado *= i;
            }
        return valorCalculado;
        }
        
    }
    

    
}
    

