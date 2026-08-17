package Arrays;

public class LessThan {
    public static void main(String[] args) {
        int[] arr = {25,26,28,29,45,23};
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 30){
                System.out.println(arr[i]);
            } 
        }
    }
}
