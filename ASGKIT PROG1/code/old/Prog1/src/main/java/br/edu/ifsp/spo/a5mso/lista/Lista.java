package br.edu.ifsp.spo.a5mso.lista;

public class Lista {

	private No primeiro;

	public void add(double valor) {
		if (primeiro == null) {

			this.primeiro = new No(valor);
			// this.ultimo = this.primeiro;

		} else {
			//this.primeiro.setProximo(new No(valor));

			No novo = this.primeiro; 
			while(novo.getProximo()!=null){
				
				novo = novo.getProximo();
				
			}
			novo.setProximo(new No(valor));
			// this.ultimo.setProximo(new No(valor));
			// this.ultimo = this.ultimo.getProximo();

		}
	}

	public void remove(int indexNo) {

		int numero = 0;
		while (this.primeiro.getProximo() != null) {
			if (numero == indexNo) {

			}
			numero++;
		}
	}

	public No next(No no) {
		return no.getProximo();
	}

	public No prior(No no) {

		while (this.primeiro.getProximo() != no) {

		}
		return (no);
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

}
