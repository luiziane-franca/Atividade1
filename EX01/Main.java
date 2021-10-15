/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX01;

/**

 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Questão 1
        System.out.println("Questão 1\n-----------");
        Paciente p1 = new Paciente(1, "Luiza", "11/27/2000", "M",
        12345678, "polem", "O-");
        show(p1);
        p1.nome = "Mãe";
        p1.dataNasc = "21/53/2002";
        p1.sexo = "M";
        p1.planoSaude = 31415926; // :P
        p1.alergia = "abelhas";
        p1.tipoSanguineo = "AB+";
        System.out.println("--------------");
        show(p1);
        
    }
    public static void show(Paciente p){
        System.out.println("Paciente: " + p.cod);
        System.out.println("Nome: "+p.nome);
        System.out.println("Data aniversario: "+p.dataNasc);
        System.out.println("Sexo (M = Masculino, F=Feminino): "+p.sexo);
        System.out.println("Plano de Saude: "+p.planoSaude);
        System.out.println("Alergia à: "+p.alergia);
        System.out.println("Tipo Sanguíneo: "+p.tipoSanguineo);
    }
    
    
}
