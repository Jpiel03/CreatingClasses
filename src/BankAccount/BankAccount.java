package BankAccount;

/**
 *
 * @author 18275
 */
public class BankAccount {
  
    private String username;
    private String password;
    private int balance;
    
    public BankAccount(String pUsername, String pPassword, int pBalance){
        username = pUsername;
        password = pPassword;
        balance = pBalance;
    }
    public void setUsername(String pUsername){
        username = pUsername;
    }
    public String getUsername(){
        return username;
    }    
    public void setPassword(String pPassword){
        password = pPassword;
    }
    public String getPassword(){
        return password;
    }    
    public void setBalance(int pBalance){
        balance = pBalance;
    }    
    public int getBalance(){
        return balance;
    }
    
    
}
  