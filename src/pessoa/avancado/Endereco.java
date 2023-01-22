package pessoa.avancado;


import java.util.function.IntFunction;

public interface Endereco {

    void accept(IntFunction<String> func);

}
