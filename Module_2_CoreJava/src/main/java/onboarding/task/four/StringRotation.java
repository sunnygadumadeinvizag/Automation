package onboarding.task.four;

public class StringRotation {
    public static void main(String args[]) {
        String str1="ABBACDEA";
        String str2="ACDEAABB";
        int countCompare=0,k=0;
        for (int i = 0;str1.length()==str2.length() && i < str1.length() && countCompare!=str1.length(); i++) {
            countCompare=0;
            k=i;
            for(int j=0;j<str1.length();j++){
                if (str1.charAt(j)==str2.charAt(k)){
                    k=k+1;
                    if (k==str1.length()) {
                        k = 0;
                    }
                    ++countCompare;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Str1:"+str1+", Str2:"+str2);
        if(countCompare==str1.length()) {
            System.out.println("Two strings are rotations of each other.");
        }
        else{
            System.out.println("Two strings are not rotations of each other.");
        }
    }
}
