import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExelFile {
    public void readExelFile(String filepath,String filename,String sheetName) throws IOException {

        File file = new File(filepath);
        FileInputStream newFile = new FileInputStream(file);
        Workbook workbook = null;
        String extension = filename.substring(filename.indexOf("."));
        if(extension.equals(".xlsx")){
            workbook = new XSSFWorkbook(newFile);
        }else if(extension.equals(".xls")){
            workbook = new HSSFWorkbook(newFile);
        }

        Sheet sheetname = workbook.getSheet(sheetName);
        int rowCount = sheetname.getLastRowNum()-sheetname.getFirstRowNum();
        for(int i=0; i<rowCount+1;i++){
            Row row = sheetname.getRow(i);
            for(int j=0; j<row.getLastCellNum();j++){
                System.out.println(row.getCell(j).getStringCellValue()+" || ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ReadExelFile obj = new ReadExelFile();

    }
}
