/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Fatorial {
    
    public int fatorial, numero, valorCalculado;
    
    Fatorial(int numero){
        this.numero = numero;
    }
    
    public static long calcularFatorialRecursivo(int numero){
        if (numero <= 0) {
            return 1; // O fatorial de 0 é 1
        } else {
            return numero * calcularFatorialRecursivo(numero - 1);
        }
    }
    
    public static long calcularFatorialInterativa(int numero){
        if (numero <= 0) {
            return 1; // O fatorial de 0 é 1
        }

        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
}
