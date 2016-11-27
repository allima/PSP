package br.edu.ifsp.spo.a5mso.prog1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio02 {

	public static String procurar(String padrao, String texto) {
		String str = texto;
		Pattern pattern = Pattern.compile(padrao);
		Matcher match = pattern.matcher(str);
		if (match.find()) {
			System.out.println("encontrou");
		}
		return null;
	}

	public static int procurarClass(String texto) {
		int quantidadeClasses = 0;
		Pattern pattern = Pattern.compile("class");
		Matcher match = pattern.matcher(texto);
		if (match.find()) {
			quantidadeClasses++;
		}
		return quantidadeClasses;
	}

	public static int procurarMetodo(String texto) {
		int quantidadeMetodo = 0;
		// Pattern pattern = Pattern.compile("[a-zA-Z]*");
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]{1,}[ ]{1,}[a-zA-Z0-9]{1,}[ ]{0,}[(]");
		Matcher match = pattern.matcher(texto);
		if (match.find()) {
			quantidadeMetodo++;
		}
		return quantidadeMetodo;
	}

	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream("C:\\eclipse\\work\\TesteRE\\src\\teste\\Teste.java");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String linha = bufferedReader.readLine();
		while (linha != null) {
			System.out.println(linha);
		    procurar("[0-9]", linha);
			procurarClass(linha);
			procurarMetodo(linha);

			linha = bufferedReader.readLine();
		}
	}
}
