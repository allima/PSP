package br.edu.ifspo.spo.prog1.metricas;

import java.util.List;

public class DesvioPadrao implements Estatistica {

	@Override
	public double calculo(List<Double> listaNumeros) {
		double somatorio = 0;
		double desvioPadrao = 0;
		for (int i = 0; i < listaNumeros.size(); i++) {
			somatorio += listaNumeros.get(i);
		}

		double media = (somatorio / listaNumeros.size());

		for (int i = 0; i < listaNumeros.size(); i++) {

			desvioPadrao += Math.pow((listaNumeros.get(i) - media), 2);
		}

		return desvioPadrao;

	}

}
