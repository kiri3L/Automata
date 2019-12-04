public class FinalState extends State {

    public FinalState(Tokenizer tokenizer) {
        super(tokenizer);
    }

    @Override
    public void get_number(char c) {
        throw new RuntimeException("Final state");
    }

    @Override
    public void get_alpha(char c) {
        throw new RuntimeException("Final state");
    }

    @Override
    public void get_math_symbol(char c) {
        throw new RuntimeException("Final state");
    }

    @Override
    public void get_square_bracket(char c) {
        throw new RuntimeException("Final state");
    }

    @Override
    public void get_round_bracket(char c) {
        throw new RuntimeException("Final state");
    }

    @Override
    public void get_curly_bracket(char c) {
        throw new RuntimeException("Final state");
    }

    @Override
    public void get_semicolon(char c) {
        throw new RuntimeException("Final state");
    }

    @Override
    public void get_space(char c) {
        throw new RuntimeException("Final state");
    }
}
