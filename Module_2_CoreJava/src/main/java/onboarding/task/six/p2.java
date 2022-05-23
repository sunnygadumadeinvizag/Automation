package onboarding.task.six;

public class p2 {
    public static void main(String args[]) {
        int[] arr1={2,1,1,2,1};
        int lsum=0,rsum=0;
        for (int i = 0; i < arr1.length ; i++) {
            rsum=arr1[i]+rsum;
        }
        for(int i=0;i<arr1.length;i++){
            lsum=lsum+arr1[i];
            rsum=rsum-arr1[i];
            if(lsum==rsum ){
                System.out.println("Returning true");
                break;
            }

        }
        if(lsum!=rsum ){
            System.out.println("Returning false");
        }
    }
}