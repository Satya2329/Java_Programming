package BasicCode;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]< small){
                sSmall = small;
                small = arr[i];
            } else if(arr[i] < sSmall && arr[i] != small){
                sSmall = arr[i];
            }
        }
        System.out.println(sSmall);
    }
}
