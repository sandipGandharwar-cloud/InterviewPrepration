import java.util.Scanner;

public class StrDupChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputString = sc.nextLine();
        char string[] = inputString.toCharArray();
        int coun;
        for(int i=0;i<string.length;i++){
            coun=1;
            for(int j=i+1;j<string.length;j++){
                if(string[i]==string[j] && string[i]!=' '){
                    coun++;
                    string[j]=0;
                }
            }
            if(coun > 1 && string[i] !=0) {
                System.out.println(string[i]+" : "+coun);
            }
        }
    }
}
