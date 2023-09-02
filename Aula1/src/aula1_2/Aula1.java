/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Alunos
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg, msg2;
        Pessoa gesley = new Pessoa("Gesley", 29);
        Pessoa dalila = new Pessoa("Dalila", 60);
        Pessoa mauricio;
        mauricio = new Pessoa("Mauricio", 80);
        
        //Filhos
        Pessoa joao, maria, pedro;
        joao= new Pessoa("Joao", 10);
        pedro = new Pessoa("Pedro", 15);
        
        gesley.nome="Gesley";
        dalila.nome="Dalila";
        
        gesley.idade=29;
        
        gesley.mae=dalila;
        gesley.pai=mauricio;
        gesley.filhos.add(joao);
        gesley.filhos.add(pedro);
                
        
        
        //msg = gesley.nome + " tem " + gesley.idade + " anos ";
        msg = gesley.mae.nome + " e mae do " + gesley.nome
                + " e " + gesley.pai.nome + " e o pai";
        msg2 = "Gesley tem " + gesley.filhos.size() + " filhos.";
        System.out.println(msg + "\n" + msg2
                + "\n"+ gesley.nomeFilhos());
    }
    
}
