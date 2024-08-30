import java.util.Stack;

public class EvaluatingPrefixExpression {
    public static int evaluatePrefix(String expression) {
        Stack<Integer> operands = new Stack<>();
        int result = 0;

        // Split the expression into tokens and process from right to left
        String[] tokens = expression.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            // If the token is an operator, pop two operands, evaluate, and push the result
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int operand1 = operands.pop();
                int operand2 = operands.pop();
                result = evaluateSingleOperator(token.charAt(0), operand1, operand2);
                operands.push(result);
            } else {
                // If the token is an operand, push it onto the stack
                operands.push(Integer.parseInt(token));
            }
        }

        // The final result is at the top of the stack
        return operands.pop();
    }

    public static int evaluateSingleOperator(char operator, int operand1, int operand2) {
        int result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "- + 7 * 4 5 + 2 0";
        System.out.println(evaluatePrefix(expression)); // Output should be 8 - (6 / 3) + 2 = 8 - 2 + 2 = 8
    }

    
}
