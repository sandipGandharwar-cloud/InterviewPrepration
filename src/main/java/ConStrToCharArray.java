public class ConStrToCharArray {

    public static void main(String args[]){
        String str = "Hello";
        char[] str1 = str.toCharArray();
        System.out.println(str1);// if you want to print complete string at time
        for (int i=0; i<str.length();i++){
            System.out.println(str1[i]);// if you want to print complete string char by char
        }
    }
}
