package ex3;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.nome = "Jesus ";
		p1.nascimento = "2000AC";
		p1.biotipo = "Slim";
		p1.idade = 33;

		Pessoa p2 = new Pessoa("Buda", "563a.C", "Chubby", 80);

		p1.status();
		p2.status();
	}

}
