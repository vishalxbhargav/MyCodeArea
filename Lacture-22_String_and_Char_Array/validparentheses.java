import java.util.Stack;

public class validparentheses {
    public static  boolean validParen(String input) {

        if(input.isEmpty()) {
            return true;
        }

        else {
            for (int i = 0; i < input.length() - 1; i++) {
                if ((input.charAt(i) == '(' && input.charAt(i + 1) == ')') ||
                        (input.charAt(i) == '{' && input.charAt(i + 1) == '}') ||
                        (input.charAt(i) == '[' && input.charAt(i + 1) == ']')) {
                    input = input.substring(0, i) + input.substring(i + 2);
                    System.out.println("Input is " + input);
                    validParen(input);
                }
            }
            return false;
        }
    }
    public static boolean validParenstack(String input) {

        if (input.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    if(stack.isEmpty()) {
                          return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')|| (current == '}' && peekChar != '{')|| (current == ']' && peekChar != '[')) {
                        return false;  // for a valid input, a close brackets must have an open brackets
                    } else {
                        stack.pop();
                    }
                }
            }
            return true; 
        }
    }
    public static void main(String[] args) {
        String s="({[()](())})";
        System.out.println(validParenstack(s));
    }
}
