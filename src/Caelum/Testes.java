
package Caelum;

/**
 *
 * @author User
 */
class Testes {
    public static void main(String[]args){
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        if(c1.transferePara(c2, 10)){
            System.out.println("Transferido");
        }else{
            System.out.println("Não Transferido");
        }
        
    }
    
}
