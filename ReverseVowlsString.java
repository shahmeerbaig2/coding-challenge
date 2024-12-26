public class ReverseVowlsString {

    public static String reverseVowels(String s) {
        char [] arr= s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!isVowls(arr[i])){
                i++;
            }else if(!isVowls(arr[j])){
                            j--;
                        }else{
                            char temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            i++;
                            j--;
                        }
                        
                    }
                    return String.valueOf(arr);
                }
            
                private static boolean isVowls(char c) {
                    String vowels = "aeiouAEIOU";
                    return vowels.indexOf(c) != -1;
                    // TODO Auto-generated method stub
                    
                }
            
                public static void main(String[] args) {

        String s = "hello";
        System.out.println("before reversing vowls:" +s);
        System.out.println("after reversing vowls:" +reverseVowels(s));
    }

    
}
