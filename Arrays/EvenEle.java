package Arrays;

import java.util.Arrays;

public class EvenEle {
    public static void main(String[] args) {
        int arr[] = {10,12,25,40,23,19};
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            } else {
                System.out.println("Odd ");
            }
        }

    }
}
