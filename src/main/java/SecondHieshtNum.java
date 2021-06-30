import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SecondHieshtNum {
    public static void main(String[] args){
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i< arr.length;i++){
            arrayList.add(new Integer(arr[i]));
        }
LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(arrayList);
        System.out.println(linkedHashSet);
//        int n = arr.length;
//
//        if(arr[n-2] < arr[n-1]){
//            System.out.println(arr[n-2]);
//        }
    }

}