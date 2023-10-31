package Algoritmos_recursivos;

/**
 *
 * @Gesley
 */
public class Principal {
    public static void main(String[] args) {
        // Exercício 1
        Fatorial fatorial = new Fatorial();
        int numero = 5; 
        System.out.println("Fatorial de " + numero + " (Recursivo): " + fatorial.calcularFatorialRecursivo(numero));
        System.out.println("Fatorial de " + numero + " (Iterativo): " + fatorial.calcularFatorialInterativa(numero));

        // Exercício 2
        TorreHanoi torreHanoi = new TorreHanoi();
        int discos = 3; 
        System.out.println("Resolvendo a Torre de Hanoi para " + discos + " discos:");
        torreHanoi.resolverTorreHanoi(discos, "Origem", "Auxiliar", "Destino");
    }
}

        