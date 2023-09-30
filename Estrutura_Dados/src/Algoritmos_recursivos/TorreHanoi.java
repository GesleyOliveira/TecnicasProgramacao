package Algoritmos_recursivos;

import java.util.*;

public class TorreHanoi {
    public int numero;
    private List<Integer> origem, destino, auxiliar = new ArrayList<Integer>();
    
    
    public TorreHanoi(int numero){
                
        if (numero == 1){
            System.out.println("O disco sairá da origem para o destino");
        } else {
            for (int i=0; i<numero(); i++){
            origem += i;   
        }
        }
    }
    
    
    
}
