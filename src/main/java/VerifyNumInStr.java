import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VerifyNumInStr {
    public static boolean numIsString(String str){
//        Pattern pattern = Pattern.compile(".*[^0-9].*");
        Pattern pattern = Pattern.compile("\\d");
        return !pattern.matcher(str).matches();
    }
    public static boolean stringIsString(String str){
        Pattern pattern = Pattern.compile(".*\\\\D.*");
        return !pattern.matcher(str).matches();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String string = sc.nextLine();
        System.out.println("String is number : "+numIsString(string));
        System.out.println("String is string : "+stringIsString(string));
   }
}
