package br.edu.ifspo.spo.prog1.oi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoLog implements Arquivo {

	
	@Override
	public List<Double> LerArquivos(String filePath) {
		List<Double> Listalinha = new ArrayList<>();
		try {
			FileReader arq = new FileReader(filePath);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); // lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			while (linha != null) {
				//System.out.printf("%s\n", linha);
				Listalinha.add(new Double(Double.parseDouble(linha)));
				linha = lerArq.readLine(); // lê da segunda até a última linha
			}
			arq.close();
			
			
		} catch (IOException e) {
			//System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			return null;
		}
		return Listalinha;

	}

}
