class Removeduplicates{
    

    static int removeduplicates(int arr[],int n){
        if (n == 0 || n == 1)
            return n;
        int j=0;
        int[] temp = new int[n];
        for(int  i=0; i<n-1;i++){
            if(arr[i]!=arr[i+1]){

                temp[j++]=arr[i];

            }

        }
        temp[j++]=arr[n-1];

        for(int i=0; i<j;i++){
            arr[i]=temp[i];
        }
        return j;
        }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,9, 10 };

        int size=arr.length;

        size=removeduplicates(arr,size);

        for(int i = 0; i<size;i++){
            System.out.print(arr[i] + " ");

        }


    }
}