package br.edu.ifspo.spo.prog1.metricas;

import java.util.List;

public class Media implements Estatistica {

	@Override
	public double calculo(List<Double> listaNumeros) {
		double somatorio = 0;
		for (int i = 0; i < listaNumeros.size(); i++) {
			somatorio += listaNumeros.get(i);
		}

		return (somatorio / listaNumeros.size());
	}

}
