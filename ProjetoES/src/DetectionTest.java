import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DetectionTest {
	Excel e;
	File f;
	Cell [][]cell;
	Tresholds t1,t2,t4,t5,t6;
	Detection d1,d2,d3,d4,d5;
	@BeforeEach
	void setUp() throws Exception {
		e = new Excel(f);
		f = new File ("Long-Method.txt");
		e = new Excel(f);
		cell= e.passarMatriz();
		t1= new Tresholds(523,0,4);
		t2=new Tresholds(523,0,4);	
		d1=new Detection ( t1,t2,1,"nome");
	}

	@Test
	void test() {
		d1.detection(cell[14]);
		
	}

}
