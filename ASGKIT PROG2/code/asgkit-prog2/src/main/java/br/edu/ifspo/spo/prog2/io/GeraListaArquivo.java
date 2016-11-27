package br.edu.ifspo.spo.prog2.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeraListaArquivo {

	private List<String> listaArquivos = new ArrayList<String>();
	private String diretorio;

	public GeraListaArquivo(String diretorio) {
		this.diretorio = diretorio;
	}

	public void obterArquivos() {
		List<String> subpastas = new ArrayList<>();
		subpastas.add(this.diretorio);
		while (subpastas.size() > 0) {
			File f = new File(subpastas.get(0));
			File[] faux = f.listFiles();
			for (File file : faux) {
				if (file.isDirectory()) {

				}
			}
			subpastas.remove(0);
		}
	}
}
