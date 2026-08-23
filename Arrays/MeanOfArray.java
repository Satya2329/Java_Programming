package Arrays;

public class MeanOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int sum = arr[0];
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("The mean of the array is " + sum/n);
    }
}
