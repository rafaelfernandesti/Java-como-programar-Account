package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

/**
 *
 * @author User
 */
public class TestaGerente {
    public static void main(String[] args){
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

    Gerente funcionario1 = new Gerente();
    funcionario1.setSalario(5000.0);
    controle.registra(funcionario1);

//    Funcionario funcionario2 = new Funcionario();
//    funcionario2.setSalario(1000.0);
//    controle.registra(funcionario2);

    System.out.println(controle.getTotalDeBonificacoes());
    }
}
