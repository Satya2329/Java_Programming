package LoopControl;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {123,456,789};
        System.out.println("Array is ");

        for(int i =0; i<arr.length; i++){
            int num = arr[i];
            int rev =0;

            while(num>0){
                int digit = num %10;
                rev = rev *10 + digit;
                num = num/10;
            }
            arr[i] = rev;
        }
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int value =0; value<arr.length; value++){
            System.out.print(value + " ");
        }
    }
}
