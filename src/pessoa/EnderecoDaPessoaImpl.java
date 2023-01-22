package pessoa;

public class EnderecoDaPessoaImpl implements EnderecoDaPessoa{
    @Override
    public void visit(Pessoa pessoa) {
        padrao(pessoa);
    }

    public void padrao(Endereco padra) {
        throw new IllegalStateException();
    }

}
