package techproed.utilities;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.IOException;
public class ExcelUtils {
    private Workbook workbook;
    private Sheet sheet;
    private String path;
    //Constuctor: Excel path'ine ve Excel'deki sayfaya ulaşmak için 2 parametreli cons. oluşturduk
    public ExcelUtils(String path,String sheetName){
        this.path = path;
        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Satir ve sütun sayilari girildiğinde, o hücredeki veriyi return eder
    public String getCellData(int rowNum,int colNum){
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        return cell.toString();
    }
    //Exceldeki satir sayisini return eder
    public int rowCount(){
        return  sheet.getLastRowNum();
    }
    //Exceldeki sütun sayisini return eder
    public int columnCount(){
        return sheet.getRow(0).getLastCellNum();
    }
    //Exceldeki dataları alabilmek için 2 boyutlu bir array method oluşturalım
    public String[][] getDataArray() {
        String[][] data = new String[rowCount()][columnCount()];
        for (int i = 1; i <=rowCount() ; i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i,j);
                data[i-1][j]=value;
            }
        }
        return data;
    }
}
