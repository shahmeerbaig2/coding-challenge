public class MergeString {

    public static String merge(String s1, String s2){
        int length= s1.length();
        int length2= s2.length();

        StringBuilder result = new StringBuilder();

        for(int i=0;i<length;i++){
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));
            
            
            

        }

        if (s1.length() > s2.length()) {
            result.append(s1.substring(length));
        } else if (s2.length() > s1.length()) {
            result.append(s2.substring(length));
        }
        return result.toString();

    }

    public static void main(String[] args){

        String s1 = "abc";
        String s2 = "pqrst";

        System.out.println(merge(s1, s2));

    }
    
}
