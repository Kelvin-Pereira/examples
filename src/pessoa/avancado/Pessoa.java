package pessoa.avancado;

import java.util.function.IntFunction;

public class Pessoa implements Endereco {

    private String nome;
    private Integer idade;
    private String endereco;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void accept(IntFunction<String> func) {
        this.endereco = func.apply(this.idade);
    }

}
