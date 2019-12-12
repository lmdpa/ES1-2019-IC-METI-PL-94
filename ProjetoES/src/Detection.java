import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;

public class Detection {
	List<Tresholds> tresholds = new ArrayList<> ();
	int operador; //0-E , 1 -OU
	String nome;
	
	public Detection(Tresholds t, Tresholds z,int operador, String nome) {
		tresholds.add(t);
		tresholds.add(z);
		this.operador = operador;
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Tresholds> getTresholds() {
		return tresholds;
	}

	public void addTresholds(Tresholds treshold) {
		tresholds.add(treshold);
	}

	public int getOperador() {
		return operador;
	}

	public void setOperador(int operador) {
		this.operador = operador;
	}
	public boolean detectionOu(Cell [] linha) {
		for (int i = 0; i<tresholds.size(); i++) {
			if (tresholds.get(i).getOperador()==1) {
				if(tresholds.get(i).getMetrica() == linha[tresholds.get(i).getColuna()].getNumericCellValue()) {
					return true;
				}
			}
			if (tresholds.get(i).getOperador()==2) {
				if(tresholds.get(i).getMetrica() > linha[tresholds.get(i).getColuna()].getNumericCellValue()) {
					return true;
				}
			}
			if (tresholds.get(i).getOperador()==3) {
				if(tresholds.get(i).getMetrica() < linha[tresholds.get(i).getColuna()].getNumericCellValue()) {
					return true;
				}
			}
		}
		return false;
		
	}
	public boolean detectionE(Cell [] linha) {
		for (int i = 0; i<tresholds.size(); i++) {
			if (tresholds.get(i).getOperador()==1) {
				if(tresholds.get(i).getMetrica() != linha[tresholds.get(i).getColuna()].getNumericCellValue()) {
					return false;
				}
			}
			if (tresholds.get(i).getOperador()==2) {
				System.out.println("XONA");
				if(tresholds.get(i).getMetrica() < linha[tresholds.get(i).getColuna()].getNumericCellValue()) {
					return false;
				}
			}
			if (tresholds.get(i).getOperador()==3) {
				if(tresholds.get(i).getMetrica() > linha[tresholds.get(i).getColuna()].getNumericCellValue()) {
					return false;
				}
			}
		}
		return true;
	}
	public boolean detection(Cell [] linha) {
		if (operador==0)
			detectionE(linha);
		if (operador==1)
			detectionOu(linha);
		return false;
	}
}
