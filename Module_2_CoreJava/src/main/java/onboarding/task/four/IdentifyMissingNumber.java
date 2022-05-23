package onboarding.task.four;

public class IdentifyMissingNumber {
    public static void main(String args[]) {
        int[] num = {1, 2, 3, 4,5, 6, 8};
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=i+1){
                System.out.println("Missing Number: "+(i+1));
                break;
            }
        }
    }
}
