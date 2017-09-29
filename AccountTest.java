//Oleg P.
//Assignment 2-11.3
public class AccountTest { 

	public static void main(String[] args){
    
	Checking bleh = new Checking("Johnny Cash");
    System.out.println(bleh.toString());
    bleh.deposit((float)555.5);
    System.out.println("$ " + bleh.getBal());
    bleh.deposit((float) 244.5);
    System.out.println("$ " + bleh.getBal());
    bleh.withdraw((float) 500.0);
    System.out.println("$ " + bleh.getBal());
    bleh.withdraw((float) 444.0);
    System.out.println("$ " + bleh.getBal());
    
    Saving mleh = new Saving("Johnny Cash");
    System.out.println(mleh.toString());
    mleh.deposit((float)555.5);
    System.out.println("$ " + mleh.getBal());
    mleh.deposit((float) 244.5);
    System.out.println("$ " + mleh.getBal());
    mleh.withdraw((float) 500.0);
    System.out.println("$ " + mleh.getBal());
    mleh.withdraw((float) 444.0);
    System.out.println("$ " + mleh.getBal());   
	}
}