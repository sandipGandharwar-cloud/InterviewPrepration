import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String args[]){
        File file = new File("C:\\Users\\User\\Documents\\file\\readFile.txt");
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter(file));
            bw.write("This is first line.\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter(file,true));
            bw.write("This is second line.");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader( new FileReader(file));
            String str;
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
