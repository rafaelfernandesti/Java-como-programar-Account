/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.contas.main;

/**
 *
 * @author User
 */
public class TestaCarro {
    public static void main(String[] args){
        Carro meuCarro;
        meuCarro = new Carro();
        
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;
        
        meuCarro.liga();
        
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);
    }
}
