public class SwapString {
    public static void main(String[] args){

        String str1="sandip";
        String str2="gandharwar";

        str1= str1+str2;
        System.out.println(str1);
        str2=str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);
        str1=str1.substring(str2.length());
        System.out.println("After : " + str1 + " " + str2);
    }
}
