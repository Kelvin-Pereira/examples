package pessoa;

public class Pessoa implements Endereco{

    private String nome;
    private Integer idade;

    private String tipoEndereco;

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void accept(EnderecoDaPessoa endereco) {
        endereco.visit(this);
    }
}
