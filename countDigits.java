public class countDigits {
    public static void main(String[] args){
        int num = 7789;
        int count = 0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("the number of digits in the number is " + count);
    }
    
}
