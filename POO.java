package ex4;

public class POO {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setTipo("Passeio");
		carro.setCor("Preto");
		carro.setPlaca("ZOA123");
		carro.setNumPortas(4);

		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Jesus";
		pessoa.nascimento = "2021a.C";
		pessoa.biotipo = "Slim";
		pessoa.idade = 33;
		
		carro.setDono(pessoa);
		
		System.out.println("-----CARRO------");
		System.out.println("Cor: "+carro.getCor());
		System.out.println("Tipo: "+carro.getTipo());
		System.out.println("Portas: "+carro.getNumPortas());
		System.out.println("Placa: "+carro.getPlaca());
		System.out.println("Dono: "+carro.getDono().getNome());
	}

}
