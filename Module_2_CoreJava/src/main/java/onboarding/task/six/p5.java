package onboarding.task.six;

public class p5 {
    public static void main(String args[]) {
        int[] outer={1, 2, 2, 2,4, 6};
        int[] inner={2,2,4,7};
        int numFoundCount=0,j=0;
        boolean numFound=false;
        for (int i = 0; i < outer.length && inner.length!=0;i++ ) {
            if(outer[i]==inner[j]){
                ++j;
                numFoundCount++;
            }
            if(numFoundCount==inner.length ){
                break;
            }
        }
        if(numFoundCount!=inner.length){
            System.out.println("Returning "+false);
        }
        else{
            System.out.println("Returning "+true);
        }

    }
}