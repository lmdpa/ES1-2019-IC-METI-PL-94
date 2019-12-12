
public class Tresholds {
	int metrica;
	int operador;
	int coluna;
	public Tresholds(int  metrica, int operador, int coluna) {
		this.metrica = metrica;
		this.operador = operador;
		this.coluna = coluna;
		
	}
	public int getMetrica() {
		return metrica;
	}
	public void setMetrica(int metrica) {
		this.metrica = metrica;
	}
	public int getOperador() {
		return operador;
	}
	public void setOperador(int operador) {
		this.operador = operador;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
