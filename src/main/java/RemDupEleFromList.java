import java.util.*;
import java.util.stream.Collectors;

public class RemDupEleFromList {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,7,7,8,8,9,9));
        System.out.println("Array list with dup element : "+arrList);
        //LinkedHashSet:
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(arrList);
        ArrayList<Integer> arrList1 = new ArrayList<Integer>(linkedHashSet);
        System.out.println("uni element : "+arrList1);

        // JDK 8 - Stream:
        ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,7,7,8,8,9,9));
        List<Integer> list = markList.stream().distinct().collect(Collectors.toList());
        System.out.println("uni element : "+list);
    }
}
