package onboarding.task.six;

public class p3 {
    public static void main(String args[]) {
        int[] arr1={2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        int clumpCount=0;
        boolean clumpFound=false;
        for (int i = 0; i < arr1.length ; i++) {
            clumpFound=false;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    clumpFound=true;
                    i=j;
                }
                else{
                    break;
                }
            }
            if(clumpFound==true){
                ++clumpCount;
            }

        }
        System.out.println(clumpCount);

    }
}