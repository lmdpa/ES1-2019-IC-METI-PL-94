	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Excel {
		private File excel;

		public Excel(File f){
			excel = new File("Long-Method.xlsx");
				
		}
		public Cell [][] passarMatriz() throws InvalidFormatException, IOException {
			//Ir buscar o ficheiro Excel
			XSSFWorkbook workbook = new XSSFWorkbook(excel);		
			//Primeira folha do filheiro
			XSSFSheet folha = workbook.getSheetAt(0);
			int linha = folha.getPhysicalNumberOfRows();
			int coluna= folha.getRow(0).getPhysicalNumberOfCells();
			Cell [][] matriz = new Cell [linha][coluna];
			for (int i = 0; i<linha; i++) {
				for(int j = 0; j<coluna; j++) {
					matriz [i][j] = folha.getRow(i).getCell(j);
				}
			}
			return matriz;
			
		}
		
	}