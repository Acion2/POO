package ex4;

public class Pessoa {
	String nome;
	String nascimento;
	String biotipo;
	int idade;

	public Pessoa(String nome, String nascimento, String biotipo, int idade) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.biotipo = biotipo;
		this.idade = idade;

	}
	public Pessoa() {
		
	}

	void status(){
        System.out.println("Pessoa ");
        System.out.println("Nome "+this.nome);
        System.out.println("Nascimento " + this.nascimento);
        System.out.println("Biotipo "+this.biotipo);
        System.out.println("Idade "+this.idade);

        
    }
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}