import java.io.File;
import java.util.Date;

public class CreateFolder {
    public static void creatFolder(String path){
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder is created");
        }else{
            System.out.println("Folder is already present");
        }
    }

    public static String timeStamp(){
        Date now = new Date();
        String Timestamp = now.toString().replace(":", "-");
        return Timestamp;
    }
    public static void main(String[] args){

        String subpath  = System.getProperty("user.home")+"/Downloads/TimeStampFolder515646/"+timeStamp();
        creatFolder(subpath);
    }
}
