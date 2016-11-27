package br.edu.ifspo.spo.prog1;

import br.edu.ifspo.spo.prog1.metricas.Estatistica;
import br.edu.ifspo.spo.prog1.metricas.FabricaEstatistica;
import br.edu.ifspo.spo.prog1.metricas.TipoCalculo;
import br.edu.ifspo.spo.prog1.oi.Arquivo;
import br.edu.ifspo.spo.prog1.oi.FabricaArquivo;

public class Principal {

	public static void main(String[] args) {

		String caminhoArquivo = "C:\\Users\\Alexandre de Lima\\Desktop\\teste.txt";
		FabricaArquivo fabFile = new FabricaArquivo();
		Arquivo arquivo = fabFile.getArquivo(caminhoArquivo);

		FabricaEstatistica fabEstatistica = new FabricaEstatistica();
		Estatistica media = fabEstatistica.getMetrica(TipoCalculo.MEDIA);
		Estatistica desviopadrao = fabEstatistica.getMetrica(TipoCalculo.DESVIOPADRAO);
		//arquivo.LerArquivos(caminhoArquivo);

		System.out.println(media.calculo(arquivo.LerArquivos(caminhoArquivo)));
		System.out.println(desviopadrao.calculo(arquivo.LerArquivos(caminhoArquivo)));
	}

}
