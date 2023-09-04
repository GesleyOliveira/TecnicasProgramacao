/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        
         Pessoas arvore[]=new Pessoas[20];      
        //1ºGeração
        arvore[0]= new Pessoas("Maria I");
        arvore[1]=new Pessoas("Pedro III");
        //2ºGeração
        arvore[2]=new Pessoas("Dom Jose", arvore[0], arvore[1], "01/01/1761");
        arvore[3]=new Pessoas("Joao VI", arvore[0], arvore[1], "01/01/1767");
        arvore[4]=new Pessoas("Mariana Vitoria", arvore[0], arvore[1], "01/01/1768");
        //Esposas
        arvore[5] = new Pessoas("Carlota Joaquina");
        arvore[6]= new Pessoas("Maria Leopoldina");
        arvore[7]= new Pessoas("Teresa Cristina");
        //3ºGeração
        arvore[8]=new Pessoas("Dom Pedro I", arvore[5], arvore[3], "01/01/1798");
        arvore[9]=new Pessoas("Miguel I", arvore[5], arvore[3], "01/01/1801");
        arvore[10]=new Pessoas("Isabel Maria", arvore[5], arvore[3], "01/01/1801");
        //4ºGeração
        arvore[11]=new Pessoas("Dom Pedro II", arvore[6], arvore[8], "01/01/1825");        
         //5ºGeração
        arvore[12]=new Pessoas("Princesa Isabel", arvore[7], arvore[11], "01/01/1846");
        //Esposo
        arvore[13]=new Pessoas("Conde d'Eu");        
        //6º Geração
        arvore[14]=new Pessoas("Pedro de Alcantara", arvore[12], arvore[13], "01/01/1875");
         
        // Imprime o resultado no console
        int i=0;
        System.out.println(arvore[i].nome +" tem "+ arvore[i].getQtdFilhos()+" filhos ("+ arvore[i].listaFilhos()+ ") e " 
        + arvore[i].getQtdIrmaos() + " irmaos (" + arvore[i].listaIrmaos()+ ") \n ===========");
        i=2;
        System.out.println(arvore[i].nome +" tem "+ arvore[i].getQtdFilhos()+" filhos ("+ arvore[i].listaFilhos()+ ") e " 
        + arvore[i].getQtdIrmaos() + " irmaos (" + arvore[i].listaIrmaos()+ ") \n ===========");
        i=3;
        System.out.println(arvore[i].nome +" tem "+ arvore[i].getQtdFilhos()+" filhos ("+ arvore[i].listaFilhos()+ ") e " 
        + arvore[i].getQtdIrmaos() + " irmaos (" + arvore[i].listaIrmaos()+ ") \n ===========");
        i=4;
        System.out.println(arvore[i].nome +" tem "+ arvore[i].getQtdFilhos()+" filhos ("+ arvore[i].listaFilhos()+ ") e " 
        + arvore[i].getQtdIrmaos() + " irmaos (" + arvore[i].listaIrmaos()+ ") \n ===========");
        
        System.out.println(arvore[2].nome+"==> Meus sobrinhos sao: \t"+arvore[2].listaSobrinhos()+"\n ===========");
        System.out.println(arvore[11].nome +"==> Meus tios sao: \t"+arvore[11].listaTios() +"\n ===========");  
        System.out.println(arvore[14].nome+ "==> Meus avos sao: \t"+arvore[14].listaAvos()); 
        
       // Imprime os Ascendentes
        String resp= listaAscendentesPaternos(arvore[11],2);
        System.out.println(arvore[11].nome+": "+ resp);
        resp= listaAscendentesPaternos(arvore[11]);
        System.out.println(arvore[11].nome+": "+ resp);
    }
    
    public static String listaAscendentesPaternos(Pessoas p){
        
        if(p.pais[1] != null){
            return " => " + p.getNomePai()+listaAscendentesPaternos(p.pais[1]);
        }
        return "";
    }
    public static String listaAscendentesPaternos(Pessoas p,int iGeracao){
        
        if (iGeracao>0){
            if(p.pais[1] != null){
                return " => " + p.getNomePai()+listaAscendentesPaternos(p.pais[1],iGeracao-1);
            }
        }
        return "";
    }
    
}
