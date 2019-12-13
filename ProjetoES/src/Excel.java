	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * Esta classe foi feita para colocar o excel numa matriz, de modo a facilitar a sua iteração e
 * utilizacao dos seus valores para fazermos o solicitado no enunciado.
 * @author Leonardo Piorla
 *
 */
	public class Excel {
		private File excel;

		public Excel(File f){
			excel = new File("Long-Method.xlsx");
				
		}
		/**Este metodo foi criado para passar o excel para uma matriz.
		 * Usamos para isso funcoes do Apache de forma a que consigamos trabalhar sobre o excel fornecido.
		 * Primeiramente vamos buscar o ficheiro excel. De seguida a primeira e única folha do ficheiro.
		 * Depois associamos a duas variaveis de inteiros os valores das lninhas e das colunas e criamos uma matriz
		 * de celulas com o tamanho armazenado nessas variaveis.
		 * Por ultimo percorremos o nosso excel e adicionamos o valor de cada celula na respetiva
		 * posicao da sua matriz.
		 * @return Uma matriz composta pelas celulas existentes no nosso ficheiro excel.
		 * @throws InvalidFormatException exeção
		 * @throws IOException exeção
		 */
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
