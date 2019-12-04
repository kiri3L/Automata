import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                System.out.println(s.charAt(i));
                System.out.println(Tokenizer.is_alpha(s.charAt(i)));
                System.out.println(Tokenizer.is_number(s.charAt(i)));
                System.out.println(Tokenizer.is_math_symbol(s.charAt(i)));
                System.out.println();
            }

        }
    }
}
