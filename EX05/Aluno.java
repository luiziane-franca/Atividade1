/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza091021_05;

public class Aluno {
    String nome;
    String cpf;
    double notas[] = new double[3];
    
    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.notas[0] = 0;
        this.notas[1] = 0;
        this.notas[2] = 0;
        
        
    }
    public double calculaMedia(){
        double media = (this.notas[0] + this.notas[1] + this.notas[2])/3;
        return media;
    }
}
