package Arrays;
public class SumArr{
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,60,90,100};
        int sum=arr[0];
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}