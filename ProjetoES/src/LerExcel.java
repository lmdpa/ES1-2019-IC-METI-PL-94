import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class LerExcel {

	public static void main(String[] args) throws IOException {
		File excel = new File("Long-Method.xlsx");
		FileInputStream fis = new FileInputStream (excel);
		
		//Ir buscar o ficheiro Excel
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//Primeira folha do filheiro
		XSSFSheet folha = workbook.getSheetAt(0);
		
		//Iterar nas linhas
		Iterator<Row> rowIt = folha.iterator();
		
		while(rowIt.hasNext()) {
			Row row = rowIt.next();
		//Iterar celulas da mesma linha
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				System.out.print(cell.toString() + ";");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}
}


