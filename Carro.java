
package poo;


public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    
    void setCor (String cor){
        this.cor = cor;
    }
    public String getCor (){
        return cor;
    }
    void setTipo (String tipo){
        this.tipo = tipo;
    }    
    public String getTipo(){
        return tipo;
    }
    void setPlaca (String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }
    void setNumPortas ( int numPortas){
        this.numPortas = numPortas;
    }
    public int getNumPortas(){
        return numPortas;
    }
}
