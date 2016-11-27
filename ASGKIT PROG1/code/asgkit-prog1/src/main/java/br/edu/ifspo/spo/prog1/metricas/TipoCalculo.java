package br.edu.ifspo.spo.prog1.metricas;

public enum TipoCalculo {

	MEDIA("media"), 
	DESVIOPADRAO("desviopadrao");

	private String descricao;

	TipoCalculo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
