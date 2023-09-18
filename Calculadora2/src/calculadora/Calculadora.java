package calculadora;

import java.lang.Math;

public class Calculadora {
    
    private double valorA, valorB, resultado;
    private String resultMsg;

    public void soma(double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
        this.resultado = valorA + valorB;
        this.resultMsg = valorA + " + " + valorB + " = " + this.resultado;
    }
    
    public void sub(double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
        this.resultado = valorA - valorB;
        this.resultMsg = valorA + " - " + valorB + " = " + this.resultado;
    }
    
    public void mult (double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
        this.resultado = valorA * valorB;
        this.resultMsg = valorA + " * " + valorB + " = " + this.resultado;
    }
    
    public void div (double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
        this.resultado = valorA / valorB;
        this.resultMsg = valorA + " / " + valorB + " = " + this.resultado;
    }
    
    public String getResultadoString(){
        return resultMsg;
    }
    
    public double getResultadoValor(){
        return resultado;
    }
    
    public String convertDecToBin(int num){
        String msg = "";
        for (int i=0; i < 8; i++ ){
            if (num < 2){
              msg = num % 2 + msg; 
              break;
            }
            msg = num % 2 + msg; 
            num = num / 2;
        } 
        return msg;
    }
    
    public int convertBinToDec(int num){
        int numeroDecimal = 0;
        int base = 2;
        int expoente = 0;
        
        while (num != 0){
            int remainder = num % 10;
            numeroDecimal += remainder * Math.pow(base, expoente);
            num /= 10;
            expoente++;
        }
        
        return numeroDecimal;
    }

    
}
