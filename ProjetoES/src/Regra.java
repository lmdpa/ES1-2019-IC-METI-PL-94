/**
 * 
 * @author Esta classe foi criada com o objetivo de criar e caracterizar o objeto regra, de forma a criar e aceder aos valores necess�rios da mesma
 *
 */
public class Regra {
	
	private String metrica1;
	private String metrica2;
	private int threshold1;
	private int threshold2;
	private String defeito; // is long method ou is feature envy
	private String comparador1;
	private String comparador2;// > ou <
	private String operador; // AND ou OR
	private boolean exists; // se o erro existe ou nao
	/**
	 * Construtor da classe regra, este � o m�todo utilizador para criar um objeto do tipo regra
	 * @param defeito defeito
	 * @param metrica1 metrica1
	 * @param metrica2 metrica2
	 * @param threshold1 threshold1
	 * @param threshold2 threshold2
	 * @param comparador1 comparador1
	 * @param comparador2 comparador2
	 * @param operador operador
	 * @param exists exists
	 */
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
	/**
	 * M�todo que vai buscar a metrica1 da regra 
	 * @return metrica1 da regra
	 */
	public String getMetrica1() {
		return metrica1;
	} 
	/**
	 * M�todo que d� valor � metrica1 do objeto regra
	 * @param metrica1 metrica que queremos dar novo valor
	 */
	public void setMetrica1(String metrica1) {
		this.metrica1 = metrica1;
	}
	/**
	 * M�todo que vai buscar a metrica2 da regra 
	 * @return metrica2 da regra
	 */
	public String getMetrica2() {
		return metrica2;
	}
	/**
	 * M�todo que d� valor � metrica2 do objeto regra
	 * @param metrica2 metrica que queremos dar novo valor
	 */
	public void setMetrica2(String metrica2) {
		this.metrica2 = metrica2;
	}
/**
 * M�todo que vai buscar a treshold1 da regra 
 * @return threshold1
 */
	public int getThreshold1() {
		return threshold1;
	}
/**
 * M�todo que d� valor � treshold1 do objeto regra
 * @param threshold1 que queremos dar novo valor
 */
	public void setThreshold1(int threshold1) {
		this.threshold1 = threshold1;
	}
/**
 * M�todo que vai buscar a treshold2 da regra 
 * @return treshhold2
 */
	public int getThreshold2() {
		return threshold2;
	}
/**
 * M�todo que d� valor � treshold2 do objeto regra
 * @param threshold2 que queremos dar novo valor
 */ 
	public void setThreshold2(int threshold2) {
		this.threshold2 = threshold2;
	}
/**
 * M�todo que vai buscar o defeito de teste da regra, pode ser is long_method ou is feature_envy
 * @return defeito teste
 */
	public String getDefeito() {
		return defeito;
	}
/**
 * M�todo que d� valor ao tipo de defeito
 * @param defeito defeito ao qual queremos dar o valor, pode ser is long_method ou is feature_envy
 */
	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}
/**
 * M�todo que vai buscar o valor do comparador, pode ser o sinal de maior ou de menor
 * @return comparador1
 */         
	public String getComparador1() {
		return comparador1;
	}
/**
 * M�todo que d� o tipo de comparador ao parametro introduzido 
 * @param comparador1 , comparador1 ao qual vamos querer dar valor 
 */
	public void setComparador1(String comparador1) {
		this.comparador1 = comparador1;
	}
	
	/**
	 * M�todo que vai buscar o valor do comparador, pode ser o sinal de maior ou de menor
	 * @return comparador2
	 */
	public String getComparador2() {
		return comparador2;
	}
/**
 * M�todo que d� o tipo de comparador2 ao parametro introduzido 
 * @param comparador2 comparador2 ao qual vamos querer dar valor
 */
	public void setComparador2(String comparador2) {
		this.comparador2 = comparador2;
	}
/**
 * M�todo que vai buscar o valor do Operador, pode ser "AND" ou "OR"
 * @return operador
 */
	public String getOperador() {
		return operador;
	}
/**
 * M�todo que d� valor ao operador, pode ser "AND" ou "OR"
 * @param operador operador ao qual queremos dar o valor
 */
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
}