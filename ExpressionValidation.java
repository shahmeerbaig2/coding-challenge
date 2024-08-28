import java.util.Stack;

public class ExpressionValidation {
    public static boolean validateExpression(String expression) { 

        Stack<Character> stack = new Stack<>();

        for(char c: expression.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else if(c==')'){
                if(stack.isEmpty()||stack.pop()!='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

    public static void main(String args[]){
        String expression1 = "(1+3)*4"; 

        String expression2 = "((1+3)*4"; 

        String expression3 = "(1+3))*4"; 



        String expression4 = "(1+3)*4)"; 
        System.out.println(validateExpression(expression1)); // true
        System.out.println(validateExpression(expression2));
        System.out.println(validateExpression(expression3));
        System.out.println(validateExpression(expression4));
        

        
        }
    
}
