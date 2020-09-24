package masterpass;
/**
 * @author rafael
 */
public class Senha {
    
    private int numeroSenha;
    private char tipoSenha;

    public Senha(int numeroSenha, char tipoSenha)
    {
        this.numeroSenha = numeroSenha;
        this.tipoSenha = tipoSenha;
    }

    public Senha()
    {
        this(0, ' ');
    }

    public int getNumeroSenha()
    {
        return numeroSenha;
    }

    public void setNumeroSenha(int numeroSenha)
    {
        this.numeroSenha = numeroSenha;
    }

    public char getTipoSenha()
    {
        return tipoSenha;
    }

    public void setTipoSenha(char tipoSenha)
    {
        this.tipoSenha = tipoSenha;
    }
}
