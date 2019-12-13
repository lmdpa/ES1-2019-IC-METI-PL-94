/**
 * Esta classe foi feita para criar tresholds, ferramenta correspondente a juncao de um operador com um valor associado a uma metrica.
 * @author Leonardo Piorla
 *
 */
public class Tresholds {
	int metrica;
	int operador;
	int coluna;
	/**
	 * Este construtor inicializa um objeto da classe Tresholds, com a sua respetiva métrica, o seu operador, e a sua coluna.
	 * @param metrica valor da métrica.
	 * @param operador valor inteiro, associado ao valor lógico.
	 * @param coluna parametro que serve para se identificar sob que coluna estamos a operar.
	 */
	public Tresholds(int  metrica, int operador, int coluna) {
		this.metrica = metrica;
		this.operador = operador;
		this.coluna = coluna;
		
	}
	/**
	 * Metodo que nos devolve a métrica associada ao treshold préviamente criado.
	 * @return o valor da métrica.
	 */
	public int getMetrica() {
		return metrica;
	}
	/**
	 * Metodo que nos altera a metrica associada ao treshold para uma nova metrica a ser definida.
	 * @param metrica novo valor associado a métrica do tresholds.
	 */
	public void setMetrica(int metrica) {
		this.metrica = metrica;
	}
	/**
	 * Metodo que devolve o operado associado ao treshold criado.
	 * @return valor associado ao operado em questao.
	 */
	public int getOperador() {
		return operador;
	}
	/**
	 * Metodo que altera o valor do operador associado ao treshold por um novo a ser definido.
	 * @param operador novo valor associado ao operador do treshold.
	 */
	public void setOperador(int operador) {
		this.operador = operador;
	}
	/**
	 * Metodo que devolde o valor da coluna associado ao treshold criado.
	 * @return valor associado a coluna em questao.
	 */
	public int getColuna() {
		return coluna;
	}
	/**
	 * Metodo que altera o valor da coluna associado ao treshold por um novo a ser definido.
	 * @param coluna novo valor associado a coluna do tresholds.
	 */
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
