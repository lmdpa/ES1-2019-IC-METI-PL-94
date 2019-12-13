import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TresholdsTest {
	Excel e;
	File f;
	Cell [][]cell;
	Tresholds t1,t2,t4,t5,t6;
	
	
	@BeforeEach
	void setUp() throws Exception {
		e = new Excel(f);
		f = new File ("Long-Method.txt");
		e = new Excel(f);
		t1= new Tresholds(523,0,4);
	}

	@Test
	void testTresholds() {
		t1.getColuna();
		t1.getMetrica();
		t1.getOperador();
		t1.setColuna(4);
		t1.setMetrica(523);
		t1.setOperador(0);
	}

}