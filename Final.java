/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.io.File;
import javax.swing.JOptionPane;    
/**
 *
 * 
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Video v[] = new Video[3];
       v[0] = new Video("Harry Potter");
       v[1] = new Video("Game Of Thrones");
       v[2] = new Video("A Roda do Tempo");
       
       Avaliador a[] = new Avaliador[2];
       a[0] = new Avaliador ("João", 30 , "M", "J0@0");
       a[1] = new Avaliador ("Maria", 28, "F", "M@r1@");
       
       Visualizacao vis[] = new Visualizacao[5];
       vis[0] = new Visualizacao(a[0], v[0]);
        vis[0].avaliar(7);
        System.out.println(vis[0].toString());
        System.out.println("");
        vis[1] = new Visualizacao(a[1], v[1]);
        vis[1].avaliar();
        System.out.println(vis[1].toString());
       String seuNome = JOptionPane.showInputDialog("Digite o seu nome: ");
		String comentario = JOptionPane.showInputDialog("Digite o seu comentario sobre o video: ");

		String nome = seuNome + "\n " + comentario;

		JOptionPane.showMessageDialog(null, "\n Seu comentarios registrados: "+nome,"\n Comentario",JOptionPane.INFORMATION_MESSAGE);
           ManipuladorDeArquivos mp = new ManipuladorDeArquivos();
           File arquivo = mp.inicializa();
           mp.escreve(arquivo,vis[1].toString());
    }
    
}
