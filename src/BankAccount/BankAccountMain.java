package BankAccount;

/**
 *
 * @author 18275
 */
public class BankAccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Justin", "Piel", 1284091243);
        
        System.out.println(account1.getBalance());
        
        
    }
    
}
