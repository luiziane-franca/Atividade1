/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza08102021_03;


public class Luiza08102021_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questão 3
        System.out.println("Questão 3\n------------");
                
        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);
        
        int cont = 0;
        while (cont<3){
            System.out.println("Ryu usou Hadouken");
            ryu.aplicarGolpe(bison);
            cont++;
        }
        System.out.println("Bison tem "+bison.energia+" de energia");
        while (cont < 11){
            System.out.println("Bison usou Psycho Blast");
            bison.aplicarGolpe(ryu);
            cont++;
        }
        System.out.println("Ryu tem "+ryu.energia+" de energia");
        
    }
    
}
