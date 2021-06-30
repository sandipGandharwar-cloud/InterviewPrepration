import java.util.*;

public class RemoveDupEleFrmStr {

    public static void main(String[] args){
        ArrayList<String> strArr = new ArrayList<String>(Arrays.asList("Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"));
        Set<String> strArr1 = new LinkedHashSet<String>(strArr);
        ArrayList<String> strArr2 = new ArrayList<String>(strArr1);
        System.out.println(strArr2);
        Collections.sort(strArr2);
        System.out.println(strArr2);
    }
}
