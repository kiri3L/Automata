public class Tokenizer {

    static boolean is_number(char c){
        return c >= '0' && c <= '9';
    }

    static boolean is_alpha(char c){
        return (c >= 'A' && c <= 'Z') || ( c >= 'a' && c <= 'z') || (c == '_');
    }

    static boolean is_math_symbol(char c){
        return (c == '+') || (c == '-') || (c == '*') || (c == '/') || (c == '<') || (c == '>') || (c == '=') || (c == '&') || (c == '|') || (c == '^') || (c == '!');
    }

    State currentState;

    State finalState;
    State startState;
    State nameReading;
    State numberReading;
    State mathSymbolReading;

    String input_string;
    int position;
    Token token;

    Tokenizer(String input_string){
        this.position = 0;
        this.input_string = input_string;
        this.startState = new StartState(this);
        this.finalState = new FinalState(this);
        this.nameReading = new NameReading(this);
        this.numberReading = new NumberReading(this);
        this.mathSymbolReading = new MathSymbolReading(this);

        this.currentState = this.startState;
    }

    public boolean has_next_token(){
        return input_string.length() > position;
    }

    public Token next_token(){
        if(!has_next_token()){
            throw new RuntimeException("Input string is empty");
        }
        char c;
        do{
            c = input_string.charAt(position);
            position++;
            if(is_alpha(c)){
                currentState.get_alpha(c);
            }
            else if(is_number(c)){
                currentState.get_number(c);
            }
            else if(is_math_symbol(c)){
                currentState.get_math_symbol(c);
            }
            else if(c == '(' || c == ')'){
                currentState.get_round_bracket(c);
            }
            else if(c == '[' || c == ']'){
                currentState.get_square_bracket(c);
            }
            else if(c == '{' || c == '}') {
                currentState.get_curly_bracket(c);
            }
            else if(c == ';'){
                currentState.get_semicolon(c);
            } else if(c == ' ' || c == '\t' || c == '\n'){
                currentState.get_space(c);
            }
            else {
                throw new RuntimeException("Invalid symbol");
            }
        } while (has_next_token() || currentState == finalState);
        this.currentState = this.startState;
        return this.token;
    }
}
