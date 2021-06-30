import java.util.Scanner;

public class ReverseMultiWordString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        String reverString = "";
        for(String string : str1){
            String reveseWord = "";
            for(int i=string.length()-1 ; i>=0;i--){
                reveseWord = reveseWord+string.charAt(i);
            }
            reverString = reverString+reveseWord+" ";
        }
        System.out.println(reverString);

    }

}
