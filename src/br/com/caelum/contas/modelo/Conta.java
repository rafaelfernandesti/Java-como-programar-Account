
package br.com.caelum.contas.modelo;
//https://www.caelum.com.br/apostila-java-orientacao-objetos/
//modificadores-de-acesso-e-atributos-de-classe/#exerccios-encapsulamento-construtores-e-static

public class Conta {
    
    private int numero;
    private double saldo;
    private double limite;
    private String nome;
    private String dataAbertura;
    private Cliente titular;
    
    public Conta(){
        //construtor sem parâmetros
    }
    public Conta(Cliente titular){
        //contrutor recebe o titular como parâmetro
    }
    
    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean saca(double valor){
        if(valor>this.saldo){
            return false;
        }else{
            this.saldo -=valor;
            return true;
        }
    }
    public void deposita(double valor){
        this.saldo +=valor;
    }
    public boolean transferePara(Conta conta2, double valor){
        if(this.saca(valor)){
            conta2.deposita(valor);
            return true;
        }else{
            return false;
        }
    }
    
    public double calculaRendimento(){
        return this.saldo*=1.01;
    }
    
    public String recuperaDadosParaImpressao(){
        return "";
        //não implementado ainda
    }
}
