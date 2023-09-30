package ExercicioAula;


import ExercicioAula.PilhaString;
import ExercicioAula.ExercicioPilha;
import ExercicioAula.PilhaInteger;
import java.lang.Math.*;


public class Principal {

    public static void main(String[] args) {
                
        PilhaInteger p = new PilhaInteger();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        
        while(!p.pilhaVazia()){
            System.out.println(p.desempilhar());
        }
        
        PilhaString pString = new PilhaString();
        pString.empilhar("A");
        pString.empilhar("B");
        pString.empilhar("C");
        
        while(!pString.pilhaVazia()){
            System.out.println(pString.desempilhar());
        }
        
        System.out.println(ExercicioPilha.palindromo("Tenet"));
        
        System.out.println(ExercicioPilha.validaBalanceamento("{{[(())]}}"));
        
        PilhaInteger pInteger = new PilhaInteger();
        String resp = "Empilhado: ";
        for(int i=0; i<10; i++){
            pInteger.empilhar((int) Math.round(Math.random()*1000));
            resp += pInteger.ExibirTopo() + " ";
        }
        
        System.out.println(resp);
        pInteger = ExercicioPilha.ordenaPilhaInt(pInteger);
        System.out.println("Ordenado: " + ExercicioPilha.ordenaPilhaInt(pInteger));
    }
    
}
