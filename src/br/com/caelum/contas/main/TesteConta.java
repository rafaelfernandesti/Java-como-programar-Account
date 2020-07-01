
package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

/**
 *
 * @author User
 */
class TesteConta {
    public static void main(String[]args){
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.deposita(100);
        if(c1.transferePara(c2, 10)){
            System.out.println("Transferido");
        }else{
            System.out.println("Não Transferido");
        }
        System.out.println(c1.getSaldo());
    }
    
}
