package br.edu.ifsp.spo.a5mso.math;

import br.edu.ifsp.spo.a5mso.lista.Lista;
import br.edu.ifsp.spo.a5mso.lista.No;

public class Calculo {

	public static double MediaPonderada(Lista listaPreenchida) {

		double media = Somatorio(listaPreenchida) / Quantidade(listaPreenchida);
		return media;
	}

	public static double DesvioPadrao(Lista listaPreenchida) {

		int contador = 1;
		double somatorio = 0;
		No Valores = listaPreenchida.getPrimeiro();
		somatorio += Math.pow((Valores.getValor() - MediaPonderada(listaPreenchida)), 2);

		while (Valores.getProximo() != null) {

			Valores = Valores.getProximo();
			somatorio += Math.pow((Valores.getValor() - MediaPonderada(listaPreenchida)), 2);
			contador++;

		}
		System.out.println("desvio " + Math.sqrt((somatorio / contador)));
		return Math.sqrt((somatorio / contador));
	}

	public static double Somatorio(Lista listaPreenchida) {
		double somatorio = 0;
		No Valores = listaPreenchida.getPrimeiro();
		somatorio += Valores.getValor();

		while (Valores.getProximo() != null) {

			Valores = Valores.getProximo();
			somatorio += Valores.getValor();
		}
		return somatorio;
	}

	public static int Quantidade(Lista listaPreenchida) {
		int contador = 1;
		No Valores = listaPreenchida.getPrimeiro();

		while (Valores.getProximo() != null) {

			Valores = Valores.getProximo();
			contador++;
		}
		return contador;
	}
}
