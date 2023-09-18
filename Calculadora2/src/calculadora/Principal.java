package calculadora;


public class Principal {
    public static void main(String[] args) {
        //Utilizando a classe Calculadora
        Calculadora calc = new Calculadora();
        calc.soma(10, 5);
        System.out.println("A soma dos valores 10 e 5 é: " + calc.getResultadoString()); 
        System.out.println("A soma dos valores 10 e 5 é: " + calc.getResultadoString());
        
        calc.sub(10, 5);
        System.out.println(calc.getResultadoString());
        
        
        System.out.println("O número decimal " + 10 + " em binário é: " + calc.convertDecToBin(10));
        System.out.println("O número binário " + 1010 + " em decimal é: " + calc.convertBinToDec(1010));
        
        
        
    }
    
}
