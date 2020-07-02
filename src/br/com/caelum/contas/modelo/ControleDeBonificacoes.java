package br.com.caelum.contas.modelo;

/**
 *
 * @author User
 */
public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;
    
    public void registra(Funcionario funcionario){
        System.out.println("Adicionando bonificação do funcionário: "); 
        this.totalDeBonificacoes+=funcionario.getBonificacao();
    }
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
