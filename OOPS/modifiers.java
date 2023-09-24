package OOPS;

public class modifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username="Vishu";
        myAcc.password="eewe";
        // it show error because it is private
    }
}

class BankAccount{
    public String username;
private String password;
public void setPassword(String pwd){
    password = pwd;
    // this is accesible because this is used within class
}
}