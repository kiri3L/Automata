public abstract class State {
    StringBuilder token;
    Tokenizer tokenizer;
    State(Tokenizer tokenizer){
        this.token = new StringBuilder();
        this.tokenizer = tokenizer;
    }
    public abstract void get_number(char c);            // 0-9
    public abstract void get_alpha(char c);             // A-Z a-z _
    public abstract void get_math_symbol(char c);       // + - * / < > = & | ^
    public abstract void get_square_bracket(char c);    // [ ]
    public abstract void get_round_bracket(char c);     // ( )
    public abstract void get_curly_bracket(char c);     // { }
    public abstract void get_semicolon(char c);         // ;
    public abstract void get_space(char c);             // ' '
    public void final_state(){
        token = new StringBuilder();
        tokenizer.currentState = tokenizer.finalState;
    }
}
