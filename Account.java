//Oleg P.
//Assignment 2-11.3
public class Account {
protected String custName;
protected int acctNum;
protected float bal;
protected float intRate;
   
	public Account(String name){
        custName = name;
        acctNum = (int) Math.ceil(Math.random() * 10000);
        bal = 0;
        intRate = 3;
}
	
	public String toString() {
		return 	getCustName() +" | "+ getAcctNum()+ " | %"+ getIntRate();
	} 
	
	public String getCustName() {
        return custName;
    }
    public int getAcctNum() {
        return acctNum;
    }
    public float getBal(){
        return bal;
    }
    public float getIntRate() {
		return intRate;
	}	
    
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public void setIntRate(float intRate) {
		this.intRate = intRate;
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