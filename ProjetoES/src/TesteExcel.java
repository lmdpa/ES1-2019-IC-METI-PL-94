

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteExcel {
	
	Excel e;
	File f;
	Cell [][]cell;
	
	@BeforeEach
	void setUp() {
		e = new Excel(f);
		f = new File ("Long-Method.txt");
		e = new Excel(f);
		
	}
	
	

	@Test
	void test() throws InvalidFormatException, IOException {
		 cell = e.passarMatriz();	
		
	}

}
