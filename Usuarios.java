package biblioteca;

public class Usuarios {
String nome;
String sexo;
String telefone;
int idade;
boolean ler;

public void setNome(String nome) {
	this.nome = nome;
}
public String getNome() {
	return nome;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getSexo() {
	return sexo;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getTelefone() {
	return telefone;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public int getIdade() {
	return idade;
}
public void setLer(boolean ler) {
	this.ler = ler;
}

void lerLivro(){
    if (this.ler==true){
        System.out.println("O usuario está lendo o livro");
    }else{
        System.out.println("O usuario não está lendo o livro");
    }
}
}
