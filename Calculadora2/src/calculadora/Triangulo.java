package calculadora;


enum TipoTriangulo{
    TRIANGULO_RETANGULO,
    TRIANGULO_OBTUSANGULO,
    TRIANGULO_ACUTANGULO
}

public class Triangulo {
    private double base, altura, angulo, segmentoAB, segmentoAC, x, perimetro;
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
            this.angulo = angulo;
        }
        else{
            this.angulo = angulo;
        }
        classificarTriangulo();
    }
    
    public void classificarTriangulo(){
        if (angulo == 90){
            tipo = TipoTriangulo.TRIANGULO_RETANGULO;
            x = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        } else if (angulo > 90) {
            tipo = TipoTriangulo.TRIANGULO_OBTUSANGULO;
            angulo = 90;
            x = Math.sqrt((Math.pow(segmentoAB, 2) + Math.pow(segmentoAC, 2))-(2*segmentoAB*segmentoAC*Math.cos(angulo)));
            base = segmentoAB;
            altura = segmentoAC;
        } else {
            tipo = TipoTriangulo.TRIANGULO_ACUTANGULO;
            angulo = 90;
            x = Math.sqrt((Math.pow(segmentoAB, 2) + Math.pow(segmentoAC, 2))-(2*segmentoAB*segmentoAC*Math.cos(angulo)));
            base = segmentoAB;
            altura = segmentoAC;
        }
    } 
    
    public double calcularPerimetro() {
        perimetro = base + altura + x;
        return perimetro;
    }
    
    public double calcularArea() {
        double senAngulo = Math.sin(Math.toRadians(angulo));
        return (0.5) * base * altura * senAngulo;
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
            ", perímetro de " + String.format("%.2f", calcularPerimetro()) + " e área de " + calcularArea();
    }
       
}
