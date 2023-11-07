
package Classes;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Serializador {
    
    public static void gravar(String caminho, Object objeto)throws FileNotFoundException,IOException{
        
        FileOutputStream outFile= new FileOutputStream(caminho);
        ObjectOutputStream outObj = new ObjectOutputStream(outFile);
        
        try {
            outObj.writeObject(objeto);
        } catch (Exception e) {
            new Exception("Erro ao gravar em arquivo!", e);
        }finally{
            outObj.close();
        }
        
        
    }
    public static Object ler(String caminho)throws FileNotFoundException,IOException, ClassNotFoundException{
        
        FileInputStream inFile = new FileInputStream(caminho);
        try(ObjectInputStream inObj = new ObjectInputStream(inFile)) {
            Object objeto = inObj.readObject();
            return objeto;
        }catch(Exception e){
            new Exception("Erro ao ler o arquivo", e);
        }
        
        return null;
        
    }
}
