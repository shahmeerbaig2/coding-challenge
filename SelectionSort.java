public class SelectionSort {

    public static void Sort(int arr[]){
        int length = arr.length;

        for(int i=0;i<length-1;i++){
            
            int minIndex = i;
            for(int j=i+1;j<length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                
    
            }
            int temp = arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
           

            }
            display(arr
            );
        }
        public static void display(int  arr[]){

            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }

    

    public static void main(String args[]){
        int[] arr = {64, 34, 25, 12, 22};
        Sort(arr);
        display(arr);

    }
    
}
