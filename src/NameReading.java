public class NameReading extends State {

    public NameReading(Tokenizer tokenizer) {
        super(tokenizer);
    }

    @Override
    public void get_number(char c) {
        this.token.append(c);
    }

    @Override
    public void get_alpha(char c) {
        this.token.append(c);
    }

    @Override
    public void get_math_symbol(char c) {

    }

    @Override
    public void get_square_bracket(char c) {

    }

    @Override
    public void get_round_bracket(char c) {

    }

    @Override
    public void get_curly_bracket(char c) {

    }

    @Override
    public void get_semicolon(char c) {

    }

    @Override
    public void get_space(char c) {

    }
}
