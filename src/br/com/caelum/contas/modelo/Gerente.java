package br.com.caelum.contas.modelo;

//https://www.caelum.com.br/apostila-java-orientacao-objetos/
//heranca-reescrita-e-polimorfismo/#repetindo-cdigo
/**
 *
 * @author Rafael F
 */
public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        }else{
            System.out.println("Acesso negado!");
            return false;
        }
    }
    @Override
    public double getBonificacao(){
        return this.salario * 1.4  + 1000;
    }
    
}
