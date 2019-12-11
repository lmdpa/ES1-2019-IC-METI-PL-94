
public class Regra {
	
	private String metrica1;
	private String metrica2;
	private int threshold1;
	private int threshold2;
	private String defeito; // is long method ou is feature envy
	private String comparador1;
	private String comparador2;// > ou <
	private String operador; // AND ou OR
	private boolean exists; // se o erro existe ou não
	

	
	
	
	public Regra(String defeito, String metrica1, String metrica2, int threshold1, int threshold2, String comparador1,String comparador2, String operador,boolean exists) {
		
		this.metrica1 = metrica1;
		this.metrica2 = metrica2;
		this.threshold1 = threshold1;
		this.threshold2 = threshold2;
		this.defeito = defeito;
		this.comparador1 = comparador1;
		this.comparador2 = comparador2;
		this.operador = operador;
		this.exists = exists;
	}

	public String getMetrica1() {
		return metrica1;
	}



	public void setMetrica1(String metrica1) {
		this.metrica1 = metrica1;
	}



	public String getMetrica2() {
		return metrica2;
	}



	public void setMetrica2(String metrica2) {
		this.metrica2 = metrica2;
	}



	public int getThreshold1() {
		return threshold1;
	}



	public void setThreshold1(int threshold1) {
		this.threshold1 = threshold1;
	}



	public int getThreshold2() {
		return threshold2;
	}





	public void setThreshold2(int threshold2) {
		this.threshold2 = threshold2;
	}



	public String getDefeito() {
		return defeito;
	}



	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}



	public String getComparador1() {
		return comparador1;
	}



	public void setComparador1(String comparador1) {
		this.comparador1 = comparador1;
	}
	
	public String getComparador2() {
		return comparador2;
	}



	public void setComparador2(String comparador2) {
		this.comparador2 = comparador2;
	}



	public String getOperador() {
		return operador;
	}



	public void setOperador(String operador) {
		this.operador = operador;
	}
	

}
