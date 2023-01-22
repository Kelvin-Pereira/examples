package pessoa.avancado;

import java.util.function.IntFunction;

public class EnderecoImpl implements IntFunction<String> {
    @Override
    public String apply(int value) {
        return switch (value) {
            case 20 -> "casa";
            case 30 -> "Apartamento";
            default -> "";
        };
    }
}
