package pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kelvin", 25);

        pessoa.accept( new EnderecoDaPessoaImpl() {
            @Override
            public void visit(Pessoa pessoa1) {
                pessoa1.setTipoEndereco("Casa");
            }
        });

        System.out.println(pessoa.getTipoEndereco());

    }

}
