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
public class Endereco {
    String rua;
    int numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    String cep;
    
    public Endereco(String rua, int numero, String complemento,String
            bairro, String cidade, String uf, String cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
}
