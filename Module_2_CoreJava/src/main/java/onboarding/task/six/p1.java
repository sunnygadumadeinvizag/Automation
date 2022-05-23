package onboarding.task.six;

public class p1 {
    public static void main(String args[]) {
        int[] arr1={1,2,3,4,5,6,6,6,4};
        int maxSpan=1;
        for (int i = 0; i < arr1.length ; i++) {
            for(int j=arr1.length-1 ; maxSpan<=(j-i+1)&&j>i;j--){
                if(arr1[i]==arr1[j]){
                    if(maxSpan<(j-i+1)) {
                        maxSpan = j - i + 1;
                    }
                }
            }
        }
        System.out.println("MaxSpan:"+maxSpan);
    }
}