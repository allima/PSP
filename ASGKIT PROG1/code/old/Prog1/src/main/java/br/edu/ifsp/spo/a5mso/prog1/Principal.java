package br.edu.ifsp.spo.a5mso.prog1;

import br.edu.ifsp.spo.a5mso.io.LeituraArquivo;
import br.edu.ifsp.spo.a5mso.lista.Lista;
import br.edu.ifsp.spo.a5mso.math.Calculo;

public class Principal {

	public static void main(String[] args) {

		Lista listaVadores;

		listaVadores = LeituraArquivo.LerArquivo("C:\\Users\\Alexandre de Lima\\Desktop\\teste.txt");

		System.out.println("Media " + Calculo.MediaPonderada(listaVadores));
		Calculo.DesvioPadrao(listaVadores);

	}

}