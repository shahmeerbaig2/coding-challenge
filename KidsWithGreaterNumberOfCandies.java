import java.util.ArrayList;
import java.util.List;

public class KidsWithGreaterNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> Kids= new ArrayList<Boolean>(candies.length);

        for(int i=0; i<candies.length;i++){

            if(candies[i]+extraCandies>=max(candies)){

                Kids.add(i, true);
        }

        else{
            Kids.add(i, false);
        }
    }
        return Kids;

    }
    public static int max(int[] candy ){

        int max = candy[0];
        for(int i=0; i<candy.length;i++){

            if(candy[i]>max){
                max = candy[i];
            }
        }
        return max;

    }

    public static void main(String [] args){

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
       List<Boolean> arr= kidsWithCandies(candies, extraCandies);

        //i want to store that array in a variable
        //i want to print that array

        for(int i=0; i<arr.size();i++){

            System.out.println(arr.get(i));
        }

    }
    
}
