//Oleg P.
//Assignment 2-11.3
public class Checking extends Account{

	public Checking(String name) {
		super(name + " CHK");
        acctNum = (int) Math.ceil(Math.random() * 10000);
        bal = 0;
        intRate = 3;
	}
	public boolean deposit(float amt){
        if(amt > 0){
        bal = bal + amt;
        return true;
        }	return false;
    }
    public boolean withdraw(float amt){
        if (amt <= bal ){
            bal = bal - amt;       
            return true;   
        } else return false;       
    }

}
