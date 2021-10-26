package biblioteca;

public class Biblio {

	public static void main(String[] args) {

		Livros livro = new Livros();
		livro.setTitulo("O demonio e a Senhorita Prim:");
		livro.setAutores("P. Coelho");
		livro.setArea("Romance :");
		livro.setEditora("Globo :");
		livro.setAno("1982");
		livro.setEdicao(2);
		livro.setFolhas(230);

		Usuarios user = new Usuarios();
		user.setNome("João");
		user.setIdade(21);
		user.setSexo("Masculino");
		user.setTelefone("(51)9699-5283");

		Emprestimos e1 = new Emprestimos();
		e1.setDataEmprestimo("20/02/21");
		e1.setDevolverLivro(true);
		e1.setHoraEmprestimo("09:00");

		System.out.println("------Emprestimo-----");
		System.out.println("Livro" + livro.getTitulo());
		System.out.println("Usuario" + user.getNome());
		System.out.println("Data " + e1.getDataEmprestimo());
		livro.abrir();
		user.setLer(true);
		user.lerLivro();
		livro.fechar();
		user.setLer(false);
		user.lerLivro();
		e1.devolver();

	}

}
