import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.sun.rowset.internal.Row;

import javafx.scene.control.Cell;


public class LerExcel {
	public static void main(String[] args) throws IOException {
		File excel = new File("Long-Method.xlsx");
		FileInputStream fis = new FileInputStream (excel);
		
		//Ir buscar o ficheiro Excel
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//Primeira folha do filheiro
		XSSFSheet folha = workbook.getSheetAt(0);
		
		//Iterar nas linhas
		Iterator<org.apache.poi.ss.usermodel.Row> rowIt = folha.iterator();
		
		while(rowIt.hasNext()) {
			org.apache.poi.ss.usermodel.Row row = rowIt.next();
		//Iterar celulas da mesma linha
			Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();
				System.out.print(cell.toString() + ";");	
			}
			
			System.out.println();
		}
		
		workbook.close();
		fis.close();
	}
	
	
	// Regras................
	//is long method
	
	public boolean ilm_regra1(int LOC, int CYCLO,int max_LOC, int max_CYCLO) {
		boolean is_long_method;
		if(  LOC >= max_LOC && CYCLO >= max_CYCLO )
			is_long_method = true;
		else is_long_method = false;
	return is_long_method;
	}
	
	
	public boolean ilm_regra2(int LOC, int CYCLO,int max_LOC, int max_CYCLO) {
		boolean is_long_method;
		if( LOC >= max_LOC || CYCLO >= max_CYCLO)
			is_long_method = true;
		else is_long_method = false;
	return is_long_method;
	}
	
	// is feature envy
	
	public boolean ife_regra1(int ATFD, double LAA,double max_ATFD, double max_LAA) {
		boolean is_feature_envy;
		if( ATFD >= max_ATFD && LAA < max_LAA )
			is_feature_envy = true;
		else is_feature_envy = false;
	return is_feature_envy;
	}
	
	public boolean ife_regra2(int ATFD, double LAA,double max_ATFD, double max_LAA) {
		boolean is_feature_envy;
		if( ATFD > max_ATFD || LAA < max_LAA )
		is_feature_envy = true;
		else is_feature_envy = false;
	return is_feature_envy;
	}
	
}


