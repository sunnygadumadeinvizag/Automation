package onboarding.task.six;

public class p4 {
    public static void main(String args[]) {
        int[] arr1={7, 1, 2, 9, 7, 2, 1};
        int maxMirror=0;
        for (int i = 0; i < arr1.length ; i++) {
            for(int j=arr1.length-1,k=i;k<arr1.length && j>=0;j--){
                if(arr1[k]==arr1[j]){
                    if(maxMirror<k-i+1){
                        maxMirror=k-i+1;
                    }
                    k++;
                }
                else{
                    k=i;
                }
            }
        }
        System.out.println("MaxMirror:"+maxMirror);
    }
}