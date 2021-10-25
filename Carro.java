package ex4;

public class Carro {
	String tipo;
	String cor;
	String placa;
	int numPortas;
	Pessoa dono;

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public int getNumPortas() {
		return numPortas;
	}
}
