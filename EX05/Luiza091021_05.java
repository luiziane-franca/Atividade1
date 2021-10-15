/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza091021_05;

public class Luiza091021_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questão 5
        
        Aluno favorita = new Aluno("Luiza", "111.111.111-11");
        favorita.notas[0] = 10; // sugestão de notas ☺, fica a dica
        favorita.notas[1] = 9.50;
        favorita.notas[2] = 10;
        
        double media = favorita.calculaMedia();
        System.out.println(favorita.nome + ", sua media é: "+ media);
        favorita.notas[1] = 10;
        
        media = favorita.calculaMedia();
        System.out.println(favorita.nome + ", sua nova media é: "+ media);
        
    }
    
}
