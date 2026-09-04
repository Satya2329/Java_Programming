package BasicCode;

public class SecondLarge {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,6};
        int large = arr[0];
        int secondlarge = arr[0];
       for(int i=0; i<arr.length; i++){
        if(arr[i] > large){
            secondlarge = large;
            large = arr[i];
        } else if (arr[i] > secondlarge && arr[i] != large){
            secondlarge = arr[i];
        }
       }
       System.out.println(secondlarge);
    }
}


