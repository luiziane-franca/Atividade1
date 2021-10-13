/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX02;

/**
 *
 * @author Nid
 */ 
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Questão 2
        System.out.println("\nQuestão 2");
        
        Endereco myhouse = new Endereco("Rua dos Culas", 21, "casa",
        "Juncal", "Extrema", "MG", "37640-000");
        Medico Condoriano = new Medico(1, "Celso", "Não binario",
        "Neurocirurgião", myhouse);
        
        System.out.println("-------------");
        show_med(Condoriano);
        show_end(myhouse);
        
        // modificar endereço
        myhouse.rua = "Rua Nova";
        myhouse.numero = 42;
        myhouse.complemento = "apto";
        myhouse.bairro = "PeiPei";
        myhouse.cidade = "PewPew";
        myhouse.uf = "Londres";
        myhouse.cep = "08100-000";
        
        // modificar medico
        Condoriano.codigo = 007;
        Condoriano.nome = "Bond, James Bond";
        Condoriano.sexo = "M";
        Condoriano.especialidade = "Tirar vidas";
        Condoriano.endereco = myhouse;
        
        System.out.println("--------------");
        show_med(Condoriano);        
        show_end(myhouse);
    }
    
    public static void show_end(Endereco p){
        System.out.println("Endereço");
        System.out.println("Rua: "+p.rua);
        System.out.println("Numero: " + p.numero);
        System.out.println("Complemento: "+p.complemento);
        System.out.println("Bairro: "+p.bairro);
        System.out.println("Cidade: "+p.cidade);
        System.out.println("UF: "+p.uf);
        System.out.println("CEP: "+p.cep);
    }
    public static void show_med(Medico p){
        System.out.println("Medico: 00" + p.codigo);
        System.out.println("Nome: "+p.nome);
        System.out.println("Sexo (M = Masculino, F=Feminino): "+p.sexo);
        System.out.println("Especialidade: "+p.especialidade);
        //System.out.println(p.endereco);
    }
    
}
