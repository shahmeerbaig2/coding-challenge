import java.util.Stack;
import java.util.Scanner;
public class EvaluatingPostfixExpression {

    public  static int evaluatePostfix(String expression){
        Stack<Integer> operands = new Stack<>();
        int result =0;

        Scanner parser = new Scanner(expression);

        while(parser.hasNext()){
            String token = parser.next();
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int operand2 = operands.pop().intValue();
                int operand1 = operands.pop().intValue();
                result=evaluateSingleOperator(token.charAt(0), operand1, operand2);
                operands.push(result);
                

            }
            else{
                operands.push(Integer.parseInt(token));

            }

        }

        parser.close();
        return result;




        


    }
    public static int evaluateSingleOperator(char operator,int operand1, int operand2){
int result=0;
        switch (operator) {
            case '+':
               result= operand1 + operand2;
                break;
            case '-':
                result= operand1 - operand2;
                 break;

            case '*':
            result = operand1 * operand2;
            break;
            case '/':
            result = operand1 / operand2;
            break;

        
            default:
                break;
        }
        return result;
    }



    public static void main(String[] args) {
        String expression = "3 4 + 2 *";
        System.out.println(evaluatePostfix(expression));
    }

}