/*
 * Exercício de Sistemas Operacionais 1, separação e contagem de strings.
 * versão 1.0
 * data 18/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class SeparaStringsController {
	public SeparaStringsController() {
		super();
	}
	public int contarStrings(String texto) {
		// Usando a função split para separar strings, pela presença do caractere ";".
		String[] vetorPalavras = texto.split(";");
		// O tamanho do vetor será a quantidade de palavras.
		return vetorPalavras.length;
	}
}
