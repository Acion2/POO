/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;





/**
 *
 * @author Filipe
 */
public class ManipuladorDeArquivos {
   public File inicializa(){
       File arquivo = new File("C:\\Users\\Filipe\\meusarquivos\\nome_do_arquivo.txt");
       //verifica se o arquivo ou diretório existe
        boolean existe = arquivo.exists();
        if(!existe){
           try {    
          
               arquivo.createNewFile();
           } catch (IOException e) {
               System.out.println("Erro:"+ e.getMessage());
               //Logger.getLogger(ManipuladorDeArquivos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
         return arquivo;
   }
   public void escreve(File arquivo, String texto){
       try {
           FileWriter fw = new FileWriter(arquivo);
           BufferedWriter bw = new BufferedWriter(fw);
           //escreve o conteúdo no arquivo
              bw.write(texto);
           //quebra de linha
              bw.newLine(); 
           //fecha os recursos
             bw.close();
             fw.close();
       } catch (IOException e) {
          System.out.println(e.getLocalizedMessage());
       }
   }
}
