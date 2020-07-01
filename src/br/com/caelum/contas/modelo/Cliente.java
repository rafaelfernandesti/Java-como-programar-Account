
package br.com.caelum.contas.modelo;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public void mudaCPF(String cpf){
        validaCPF(cpf);
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        //regras de validação aqui
    }
    
}
