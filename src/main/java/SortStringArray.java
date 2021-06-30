import java.util.Arrays;
import java.util.Collections;

public class SortStringArray {
    public static void main(String args[])
    {
//defining an array of type String
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
//sorts array in descending order
        Arrays.sort(countries, Collections.reverseOrder());
//prints the sorted string array in descending order
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
    }
}
