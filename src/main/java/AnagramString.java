import java.util.Arrays;

public class AnagramString {

    public static boolean iAnagram(String word, String anagram){
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }
    public static void main(String[] args){
        String str1="army";
        String str2="mary";
        System.out.println(iAnagram(str1,str2));

    }
}
