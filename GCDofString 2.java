public class GCDofString {

    public static String gcdOfStrings(String s1, String s2) {

   if(!(s1+s2).equals(s2+s1)){
    return "";
   }

   int gcd= gcd(s1.length(),s2.length());

   return s1.substring(0, gcd);


        
    }
    public static int gcd(int a, int b){

        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args){

        String s1 = "AAAA";
        String s2 = "AA";
        System.out.println(gcdOfStrings(s1, s2));
    }

    
}
