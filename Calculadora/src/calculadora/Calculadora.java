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

    
}
