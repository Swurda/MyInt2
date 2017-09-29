//Oleg P.
//Assignment 2-11.3
public class Saving extends Account {

	public Saving(String name) {
		super(name + " SAV");
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
	            bal = bal - amt;       
	            return true;       
	    }
	}
