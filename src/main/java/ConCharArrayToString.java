public class ConCharArrayToString {

        public static String toString(char[ ] a){
            String string = new String(a);
            return string;
        }

        public static void main(String args[]){

            char[] str1 = {'s','a','n','d','i','p'};
            System.out.println(toString(str1));


        }
}
