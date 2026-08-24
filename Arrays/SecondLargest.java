package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,15,25,27,29};
        int large = arr[0];
        int sl = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > large){
                sl = large;
                large = arr[i];
            } else if(arr[i] != large ){
                sl = arr[i];
            }
        }
        System.out.println(sl);
    }
}
