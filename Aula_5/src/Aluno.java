/**
 *
 * @author Alunos
 */
public class Aluno extends Pessoa {
    int ra;
    Pessoa responsavel;
    double mediaFinal;
    
    public Aluno(String nome){
        super(nome);
    }
    public Aluno(String nome, int ra, Pessoa responsavel, double mediaFinal){
        this(nome);
        this.ra=ra;
        this.responsavel=responsavel;
        this.mediaFinal=mediaFinal;
    }
        @Override
        public String getNome() {
        return "Sr." + super.getNome();
    }
}
