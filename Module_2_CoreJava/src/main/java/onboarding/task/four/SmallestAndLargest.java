package onboarding.task.four;

public class SmallestAndLargest {
    public static void main(String args[]) {
        int[] num = {10,9,4,6,18,2};
        int small=num[0],large=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]<small){
                small=num[i];
            }
            else{
                large=num[i];
            }
        }
        System.out.println("Smallest:"+small+" Largest:"+large);
    }
}
