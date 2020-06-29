public class Account {
    private String name;
    private double balance;
    
    //construtor com validação. Recebe dois parâmetros.
    public Account(String name, double initialBalance) {
        this.name = name;
        
        if(initialBalance > 0){ //valida se o valor é maior que 0.
            this.balance = initialBalance;
        }
    }
    
    //método para depositar quantia no saldo
    public void deposit(double depositAmount){
        if(depositAmount>0){
            balance = balance + depositAmount; //adiciona ao saldo
        }
    }
    
    
    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
