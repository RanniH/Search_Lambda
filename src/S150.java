import java.util.Stack;

public class S150 {
    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                int number = Integer.parseInt(tokens[i]);
                stack.push(number);
            } else {
                int secondN = stack.pop();
                int firstN = stack.pop();
                int sum = 0;
                switch (tokens[i]) {
                    case "+"->{sum = firstN + secondN; break;}
                    case "-"->{sum = firstN - secondN; break;}
                    case "*"->{sum = firstN * secondN; break;}
                    case "/"->{sum = firstN / secondN; break;}
                }
                stack.push(sum);
            }
        }
        return stack.pop();
    }
}
