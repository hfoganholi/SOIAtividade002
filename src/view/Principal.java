/*
 * Exercício de Sistemas Operacionais 1, separação e contagem de strings.
 * versão 1.0
 * data 18/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.SeparaStringsController;

public class Principal {
	public static void main(String[] args) {
		SeparaStringsController controle = new SeparaStringsController();
		String texto1 = "abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba";
		String texto2 = "abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga";
		String texto3 = "acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião";
		System.out.println("Texto 1 tem " + controle.contarStrings(texto1) + " palavras.");
		System.out.println("Texto 2 tem " + controle.contarStrings(texto2) + " palavras.");
		System.out.println("Texto 3 tem " + controle.contarStrings(texto3) + " palavras.");
	}
}
