package BasicCode;

public class CommomEleInTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 50, 60, 70};

        System.out.println("Common elements:");

        for (int i = 0; i < arr1.length; i++) {
            boolean alreadyProcessed = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    alreadyProcessed = true;
                    break;
                }
            }

            if (alreadyProcessed) {
                continue;
            }

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}