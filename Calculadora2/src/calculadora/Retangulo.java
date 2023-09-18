package calculadora;

enum FormasGeometricas{
    QUADRADO, 
    RETANGULO
}

public class Retangulo {
    private double area, perimetro, lado1, lado2;
    public FormasGeometricas tipo;
    
    public void setLado(double lado){
        this.lado1 = lado;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }
    
     public FormasGeometricas getTipo() {
        return tipo;
    }
    
    public Retangulo(double lado){
        this.lado1 = lado;
        this.lado2 = lado; 
        this.tipo = FormasGeometricas.QUADRADO;       
    }
    
    public Retangulo(double lado1, double lado2){
        this(lado1);
        this.lado2 = lado2;
        this.area = lado1 * lado2;
        this.tipo = FormasGeometricas.RETANGULO;
    }
    
    public String getQuadrado(){
        return ("Quadrado com .... de lado, perímetro de .... e área de ....");
    }
    
    public String getRetangulo(){
        return ("Retangulo com .... por .... de lado, perímetro de .... e área de ....");
    }
    
}
