import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
/** Esta classe foi criada com o objetivo de detetar erros.
 *  O operador se for igual a 0 corresponde ao valor lógico "e", se for igual a 1 corresponde ao valor lógico "ou".
 * @author Leonardo Piorla
 *
 */
public class Detection {
	List<Tresholds> tresholds = new ArrayList<> ();
	int operador; //0-E , 1 -OU
	String nome;
	
	/** 
	 * Este método controi um objeto da classe Detection com respetivos tresholds, 
	 * operador e com o respetivo nome.
	 * @param t é um dos tresholds. 
	 * @param z é outro dos thresholds.
	 * @param operador inteiro com significado lógico.
	 * @param nome é o nome.
	 */
	public Detection(Tresholds t, Tresholds z,int operador, String nome) {
		tresholds.add(t);
		tresholds.add(z);
		this.operador = operador;
		this.nome=nome;
	}
	/**
	 * Este método devolve o nome atual da deteção.
	 * @return nome da deteção.
	 */
	public String getNome() {
		return nome;
	}
	/** 
	 * Metodo que altera o nome atual da deteção.
	 * @param nome é o novo nome que queremos atribuir.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Método que vai buscar a lista de tresholds.
	 * 
	 * @return tresholds que é a lista de tresholds criada.
	 */
	public List<Tresholds> getTresholds() {
		return tresholds;
	}
	/**
	 * Métodos que adicion tresholds a lista de tresholds.
	 * @param treshold o tresholds que queremos adicionar á nossa lista.
	 */
	public void addTresholds(Tresholds treshold) {
		tresholds.add(treshold);
	}
	/**
	 * Método que devolve o operador associado a deteção.
	 * @return o operador.
	 */
	public int getOperador() {
		return operador;
	}
	/**
	 * Altera o valor do operador associado a deteção
	 * @param operador é o valor que pretendemos por como operador, em deterimento do que atualmente lá está.
	 */
	public void setOperador(int operador) {
		this.operador = operador;
	}
	/**
	 * Este método foi feito para a deteção de erros quando estamos perante uma expressão lógica do tipo "ou".
	 * Ao darmos uma linha, percorremos a lista de tresholds, se o operador for 1 (=) e se o valor da métrica do treshold for igual 
	 * ao valor da linha, na coluna correspondente, o metodo devolve automaticamente true.
	 * A mesma lógica se verifica para os restantes operadores, retornande true sempre que uma das condição seja satisfeita.
	 * Por fim, se nenhuma das condições for satisfeita, o metodo retorna falso.
	 * @param linha que nada mais é do que uma linha do nosso excel
	 * @return true caso satisfaça apenas uma das condições, ou devolve falso se nenhuma das condições for satisfeita
	 */
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
	/** 
	 * Este mátodo foi feito para a deteção de erros quando estamos perante um expressão lógica do tipo "e".
	 * Ao darmos uma linha, percorremos a lista de tresholds, se o operador for 1(=) e se o valor da métrica do treshold
	 * for igual ao valor da linha, na respetiva coluna, o metodo devolve automaticamente false. A mesma lógica se verifica 
	 * para os restantes operadores, retornando false sempre que uma das condições seja satisfeita.
	 * Por fim, se nenhuma das condições do código for satisfeita, o método devolve true,.
	 * @param linha que nada mais é do que uma linha do nosso excell
	 * @return devolve: falso caso satisfaça apenas uma das condições; devolve true: caso nenhuma das condições seja satisfeita.
	 *
	 */
	public boolean detectionE(Cell [] linha) {
		for (int i = 0; i<tresholds.size(); i++) {
			if (tresholds.get(i).getOperador()==1) {
				if(tresholds.get(i).getMetrica() != linha[tresholds.get(i).getColuna()].getNumericCellValue()) {
					return false;
				}
			}
			if (tresholds.get(i).getOperador()==2) {
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
	/**
	 * Metodo a ser invocado noutras classes que efetivamente faz a deteção indo buscando as respetivas funções.
	 * se o operador = 0 ("e"), invoca a função detectionE, com as suas respetivas regras.
	 * Se o operador for = 1 ("ou"), o metodo invoca a função detectionOu, com as suas respetivas regras.
	 * @param linha uma das linhas do nosso excel
	 * @return false, pois se não for satisfeito nenhum dos if's, algo não está correto.
	 */
	public boolean detection(Cell [] linha) {
		if (operador==0)
			detectionE(linha);
		if (operador==1)
			detectionOu(linha);
		return false;
	}
}
