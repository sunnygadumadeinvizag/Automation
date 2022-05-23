package onboarding.task.four;

public class DuplicateCharacters {
    public static void main(String args[]) {
        String name="Sanyasi Naidu Paila";
        System.out.println("String:"+name);
        System.out.println("Duplicate characters in the string with case:");
        String tempString="";
        for(int i=0;i<name.length()/2;i++){
            if(name.indexOf(name.charAt(i))!=name.lastIndexOf(name.charAt(i)) && tempString.indexOf(name.charAt(i))<0){
                System.out.print(name.charAt(i)+" ");
                tempString=tempString+name.charAt(i);
            }
        }
        System.out.println("\nDuplicate characters in the string Ignoring case:");
        name=name.toLowerCase();
        tempString="";
        for(int i=0;i<name.length()/2;i++){
            if(name.indexOf(name.charAt(i))!=name.lastIndexOf(name.charAt(i)) && tempString.indexOf(name.charAt(i))<0){
                System.out.print(name.charAt(i)+" ");
                tempString=tempString+name.charAt(i);
            }
        }

    }
}
