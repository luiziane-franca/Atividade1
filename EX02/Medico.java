/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX02;

import EX02.Endereco;

/**
 *
 * @author Nid
 */
public class Medico {
    int codigo;
    String nome;
    String sexo;
    String especialidade;
    Endereco endereco;
    
    public Medico(int codigo, String nome, String sexo, String 
            especialidade, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco= endereco;
    }
}
