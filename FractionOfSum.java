import java.util.StringTokenizer;

public class FractionOfSum {
    public static String solve(String solve){
        StringTokenizer st = new StringTokenizer(solve," ");
        int commonDenomenator=1;
        int numeratorSum = 0;

        while(st.hasMoreTokens()){
            String s = st.nextToken();
            if(s.contains("/")){
                int denomenator=Integer.parseInt(s.split("/")[1]);
                commonDenomenator=lcm(commonDenomenator,denomenator);

            }
        }
        st = new StringTokenizer(solve, " "); 

        while (st.hasMoreTokens()) { 

            String fraction = st.nextToken(); 

            if (fraction.contains("/")) { 

                String[] parts = fraction.split("/"); 

                int numerator = Integer.parseInt(parts[0]); 

                int denominator = Integer.parseInt(parts[1]); 

                numeratorSum += numerator * (commonDenomenator / denominator); 

            } else { 

                // It's an integer 

                int numerator = Integer.parseInt(fraction); 

                numeratorSum += numerator * commonDenomenator; 

            } 

        } 

  

        // Step 3: Simplify the result 

        int gcd = gcd(numeratorSum, commonDenomenator); 

        numeratorSum /= gcd; 

        commonDenomenator /= gcd; 

  

        return numeratorSum + "/" + commonDenomenator; 

    } 

         
        
    
    public static int lcm(int a, int b) { 

        return a * (b / gcd(a, b)); 

    } 

    public static int gcd(int a, int b) {

        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    public static void main(String args[]){
        String input = "1 1/2 2/5";
        System.out.println(solve(input));
    }
    
}
