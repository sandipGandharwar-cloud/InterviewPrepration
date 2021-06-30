import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintDupCharFrmStr {
    public static void DupStrChar(String str){
    char[] string = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(Character ch : string){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }else{
                charMap.put(ch,1);
            }
        }
        Set<HashMap.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for(HashMap.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string : ");
        String inputString = sc.nextLine();
        DupStrChar(inputString);
    }
}
