package br.edu.ifspo.spo.prog1.oi;

public class FabricaArquivo {

	public Arquivo getArquivo(String tipoArquivo) {
		if (tipoArquivo == null) {
			return null;
		}

		if (tipoArquivo.toLowerCase().contains(".txt")) {
			return new ArquivoTxt();

		} else if (tipoArquivo.toLowerCase().contains(".log")) {
			return new ArquivoLog();

		}

		return null;
	}
}
