
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alunos
 */
public class Funcionario extends Pessoa {
    int matricula;
    double salarioMes;
    String funcao;
    
    public Funcionario(String nome){
        super(nome);
    }
    public Funcionario(String nome, int matricula, String superior, String funcao){
        this(nome);
        this.matricula=matricula;
        this.funcao=funcao;
    }
}