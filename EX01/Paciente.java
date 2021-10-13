/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX01;

/**
 * String, Int, Bool, Float
 * @author Nid
 */
public class Paciente {
    int cod;
    String nome;
    String dataNasc;
    String sexo;
    int planoSaude;
    String alergia;
    String tipoSanguineo;
                                    
    public Paciente(int codigo, String
            nome, String dataNascimento,String sexo,int planoSaude, String alergia, String tipoSanquineo){
        this.cod = codigo;
        this.nome = nome;
        this.alergia = alergia;
        this.dataNasc = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.tipoSanguineo = tipoSanquineo;       
    }
    
}
