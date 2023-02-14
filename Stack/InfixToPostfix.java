package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static int prec(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }
    public static String infixtopostfix(String str) {
        String result = "";
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch <= 'z' && ch >= 'a'){
                result += ch;
            } else if (ch == '(') {
                stk.push(ch);
            } else if (ch == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    result += stk.pop();
                }
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } else {
                while (!stk.isEmpty() && prec(stk.peek()) > prec(ch)) {
                    result += stk.pop();
                }
                stk.push(ch);
            }
        }
        while (!stk.isEmpty()) {
            result += stk.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "(a+b/c)*(a/k-l)";
        System.out.println(infixtopostfix(str));
    }
}
