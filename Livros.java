package biblioteca;

public class Livros {
 String titulo;
 String autores;
 String area;
 String editora;
 String ano;
 int edicao;
 int folhas;
 boolean estado;
 
 public void setTitulo(String titulo) {
	this.titulo = titulo;
}
 public String getTitulo() {
	return titulo;
}
  public void setAutores(String autores) {
	this.autores = autores;
}
  public String getAutores() {
	return autores;
}
  public void setArea(String area) {
	this.area = area;
}
  public String getArea() {
	return area;
}
  public void setEditora(String editora) {
	this.editora = editora;
}
  public String getEditora() {
	return editora;
}
  public void setAno(String ano) {
	this.ano = ano;
}
  public String getAno() {
	return ano;
}
  public void setEdicao(int edicao) {
	this.edicao = edicao;
}
  public int getEdicao() {
	return edicao;
}
  public void setFolhas(int folhas) {
	this.folhas = folhas;
}
  public int getFolhas() {
	return folhas;
}
 
  
  void fechar(){
      this.estado = false;
      System.out.println("Livro está fechado");
  }
  
  void abrir(){
      this.estado = true;
      System.out.println("Livro esta aberto para a leitura!! ");
  }
  
 
}
