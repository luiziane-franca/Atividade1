/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza091021_04;

public class Post {
   String texto;
   String link;
   int numeroCurtidas;
   int numeroCompartilhamentos;
   
   public Post(String text, String link){
       this.texto = text;
       this.link = link;
       
   }
   public void curtir() {
       this.numeroCurtidas += 1;
       
   }
   public void compartilhar(){
       this.numeroCompartilhamentos += 1;
   }
}
