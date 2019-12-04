public class StartState extends State {

    StartState(Tokenizer tokenizer) {
        super(tokenizer);
    }

    @Override
    public void get_number(char c) {
        tokenizer.currentState = tokenizer.numberReading;
        tokenizer.currentState.get_number(c);
    }

    @Override
    public void get_alpha(char c) {
        tokenizer.currentState = tokenizer.nameReading;
        tokenizer.currentState.get_alpha(c);
    }

    @Override
    public void get_math_symbol(char c) {
        tokenizer.currentState = tokenizer.mathSymbolReading;
        tokenizer.currentState.get_math_symbol(c);
    }

    @Override
    public void get_square_bracket(char c) {
        // передать выше
    }

    @Override
    public void get_round_bracket(char c) {
        // это просто токен. Если не добавлять вызов функции
    }

    @Override
    public void get_curly_bracket(char c) {
        // передать выше
    }

    @Override
    public void get_semicolon(char c) {
        throw new RuntimeException("");
    }

    @Override
    public void get_space(char c) {
        // pass
    }
}
