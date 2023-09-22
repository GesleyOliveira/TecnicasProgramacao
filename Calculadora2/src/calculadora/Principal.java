package calculadora;


public class Principal {
    public static void main(String[] args) {
        //Utilizando a classe Calculadora
        
        Calculadora calc = new Calculadora();
        
        calc.soma(10, 5);
        System.out.println("O cálculo dos valores: " + calc.getResultadoString()); 
        
        calc.sub(10, 5);
        System.out.println("O cálculo dos valores: " + calc.getResultadoString());
        
        calc.mult(10, 5);
        System.out.println("O cálculo dos valores: " + calc.getResultadoString());
        
        calc.div(10, 5);
        System.out.println("O cálculo dos valores: " + calc.getResultadoString());
        
        //Utilizando a classe Calculadora Binário e Decimal
        
        System.out.println("O número binário " + 1010 + " em decimal é: " + calc.convertBinToDec(1010));
        
        System.out.println("O número decimal " + 10 + " em binário é: " + calc.convertDecToBin(10));
        
        //Utilizando a classe Retangulo
        
        Retangulo retangulo = new Retangulo(5, 8);
        System.out.println("O " + retangulo.getTipo() + retangulo.getMensagem());
        
        //Utilizando a classe Triangulo
        
        Triangulo triangulo = new Triangulo(10, 10);
        triangulo.getDescricao();
        System.out.println("O " + triangulo.getDescricao());
           
        
    }
    
    
}
