package br.edu.ifsp.spo.a5mso.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import br.edu.ifsp.spo.a5mso.lista.Lista;

public class LeituraArquivo {

	public static Lista LerArquivo(String cominhaArquivo) {
		Lista lista = new Lista();

		try {
			
			InputStream inputStream = new FileInputStream(cominhaArquivo);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			String stringLinha = bufferedReader.readLine(); // primeira linha
			while (stringLinha != null) {
				System.out.println(Double.parseDouble(stringLinha));

				lista.add(Double.parseDouble(stringLinha));
				stringLinha = bufferedReader.readLine();
			}

			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}

	public void ArquivoSaida() throws IOException {
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("caelum");
		bw.close();
	}
}
