package br.edu.ifspo.spo.prog1.metricas;

public class FabricaEstatistica {

	public Estatistica getMetrica(TipoCalculo tipoCalculo) {
		if (tipoCalculo == null) {
			return null;
		}

		if (tipoCalculo.equals(TipoCalculo.DESVIOPADRAO)) {
			return new DesvioPadrao();

		} else if (tipoCalculo.equals(TipoCalculo.MEDIA)) {
			return new Media();

		}

		return null;
	}
}
