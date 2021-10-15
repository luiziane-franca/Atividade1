/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza08102021_03;

public class Lutador {
    String nome;
    int energia;
    int forca;
    public Lutador(String nome, int energia, int forca){
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }
    
    public void aplicarGolpe(Lutador oponente){
        oponente.energia -= forca;
    }
}
