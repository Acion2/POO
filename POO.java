package poo;


public class POO {

  
    public static void main(String[] args) {
       Carro meuCarro = new Carro();
       meuCarro.setCor("Preto");
       meuCarro.setTipo("Passeio");
       meuCarro.setPlaca("ABC123");
       meuCarro.setNumPortas (4);
       
        System.out.println("CARRO");
        System.out.println("Cor: "+ meuCarro.getCor());
        System.out.println("Tipo: "+ meuCarro.getTipo());
        System.out.println("Placa: "+ meuCarro.getPlaca());
        System.out.println("Numero de portas: "+ meuCarro.getNumPortas());
        
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Jejus");
        p1.setCorDoCabelo ("Castanho #JesusNaoEraLoiro");
        p1.setBiotipo ("Slim");
        p1.setIdade(33);
        System.out.println("");
        System.out.println("");
        System.out.println("Pessoa");
        System.out.println("Nome: "+ p1.getNome());
        System.out.println("Cor do cabelo: "+ p1.getCorDoCabelo());
        System.out.println("Biotipo: "+ p1.getBiotipo());
        System.out.println("Idade: "+ p1.getIdade());
        
        
      
    }
    
