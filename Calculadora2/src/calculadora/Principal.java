package calculadora;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.soma(10, 5);
        System.out.println(calc.getResultadoString());
        
        calc.sub(10, 5);
        System.out.println(calc.getResultadoString());
        
        
        System.out.println(calc.convertDecToBin(10));
              
        
    }
    
}
