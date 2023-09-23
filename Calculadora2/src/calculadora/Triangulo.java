package calculadora;

import java.lang.Math;

enum TipoTriangulo{
    TRIANGULO_RETANGULO,
    TRIANGULO_OBTUSANGULO,
    TRIANGULO_ACUTANGULO
}

public class Triangulo {
    private double base, altura, angulo, segmentoAB, segmentoAC;
    private TipoTriangulo tipo;
    private String mensagem;
    
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.angulo = 90;
        classificarTriangulo();
        
    }
    
    public Triangulo(double segmentoAB, double segmentoAC, double angulo){
        this.segmentoAB = segmentoAB;
        this.segmentoAC = segmentoAC;
        
        if (angulo <= 0 || angulo > 90){
            this.angulo = 90;
        }
        else{
            this.angulo = angulo;
        }
        classificarTriangulo();
    }
    
    public void classificarTriangulo(){
        if (angulo == 90){
            tipo = TipoTriangulo.TRIANGULO_RETANGULO;
            a2 + b2 = c2;
            Math.pow(base,2) + Math.sqrt(altura,2) = Math.sqrt(c,2);
            100 + 25 = c
            Math.root(c,2)
            segmentoAB = base + altura )
        } else if (angulo > 90) {
            tipo = TipoTriangulo.TRIANGULO_OBTUSANGULO;
        } else {
            tipo = TipoTriangulo.TRIANGULO_ACUTANGULO;
        }
    } 
    
    private double calcularPerimetro() {
        double cosAngulo = Math.cos(Math.toRadians(angulo));
        return segmentoAB + segmentoAC + 2 * Math.sqrt(segmentoAB * segmentoAC * (1-cosAngulo));
    }
    
    private double calcularArea() {
        double senAngulo = Math.sin(Math.toRadians(angulo));
        return (0.5) * segmentoAB * segmentoAC * senAngulo;
    }
    
    /*public String getClassificarTriangulo(){
        return classificarTriangulo;
    }*/
    
    public String getDescricao() {
        String tipoDescricao = "";
        switch (tipo) {
            case TRIANGULO_RETANGULO:
                tipoDescricao = "Triângulo Retângulo";
                break;
            case TRIANGULO_OBTUSANGULO:
                tipoDescricao = "Triângulo Obtusângulo";
                break;
            case TRIANGULO_ACUTANGULO:
                tipoDescricao = "Triângulo Acutângulo";
                break;
        }
        return tipoDescricao + " com base de " + base + ", altura de " + altura +
            ", perímetro de " + calcularPerimetro() + " e área de " + calcularArea();
    }
       
}
