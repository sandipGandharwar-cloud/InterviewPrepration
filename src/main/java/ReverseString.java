import org.junit.Assert;

public class ReverseString {
    public static String reverseStr(String str){
        if(str==null || str.isEmpty()){
            return str;
        }
        char[] strarr = str.toCharArray();
        int i=0;
        int j= strarr.length-1;
        while(i<j){
            swap(strarr,i,j);
            i++;
            j--;
        }
        return new String(strarr);
    }

    public static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j]= temp;
    }
    public static void main(String[] args){
        Assert.assertEquals("sandip",reverseStr("pidnas"));
        Assert.assertEquals("aba",reverseStr("aba"));
    }
}
