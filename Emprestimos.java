package biblioteca;

public class Emprestimos {
String dataEmprestimo ;
String horaEmprestimo;
Livros Relacionamento;
Usuarios relacionamento;
boolean devolverLivro;


public void setDataEmprestimo(String dataEmprestimo) {
	this.dataEmprestimo = dataEmprestimo;
}

public String getDataEmprestimo() {
	return dataEmprestimo;
}
  public void setHoraEmprestimo(String horaEmprestimo) {
	this.horaEmprestimo = horaEmprestimo;
}
  public String getHoraEmprestimo() {
	return horaEmprestimo;
}
  
  public void setRelacionamento(Livros relacionamento) {
	Relacionamento = relacionamento;
}
  public Livros getRelacionamento() {
	return Relacionamento;
}
  public void setDevolverLivro(boolean devolverLivro) {
	  this.devolverLivro = devolverLivro;
  }
  void devolver(){
      if (this.devolverLivro==true){
          System.out.println("Livro devolvido");
      }else{
          System.out.println("Livro indisponivel");
      }
  }



}
