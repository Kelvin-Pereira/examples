package pessoa.avancado;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("KELVIN", 20);
        pessoa.accept(new EnderecoImpl());

        System.out.println(pessoa.getEndereco());
    }

}
