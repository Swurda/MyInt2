//Oleg P.
//Assignment 1
public class MyInteger {
int value;
	
	public MyInteger(int val) {
		value = val;
	}
	public int getValue() {
		return value;
	}
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
    public static int parseInt(char[] ch) {
        return parseInt(new String(ch));
    }
    
    public boolean equals(int val) {
		if (val == value){
			return true;
		}else return false;
    } 
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else return false;
	}
	public boolean isOdd() {
		if (value % 1 == 0) {
			return true;
		} else return false;
	} 
	public boolean isPrime() {
	    for(int i = 2; i < value; i++) {
	        if(value % i == 0)
	            return false;
	    }
	    return true;
	}
/*STATIC***OVERLOADING*************************/	
	static boolean isEven(int val) {
		if (val % 2 == 0) {
			return true;
		} else return false;
	}
	static boolean isOdd(int val) {
		if (val % 1 == 0) {
			return true;
		} else return false;
	}
	static boolean isPrime(int val) {
	    for(int i = 2; i < val; i++) {
	        if(val % i == 0)
	            return false;
	    }
	    return true;
	}
/*STATIC new instance***********************/	
	static boolean isEven(MyInteger num) {
	int yyz = num.getValue();	
		if (yyz % 2 == 0) {
			return true;
		} else return false;
	}
	static boolean isOdd(MyInteger num) {
	int yyz = num.getValue();	
		if (yyz % 1 == 0) {
			return true;
		} else return false;
	}
	static boolean isPrime(MyInteger num) {
	int yyz = num.getValue();    
		for(int i = 2; i < yyz; i++) {
	        if(yyz % i == 0)
	            return false;
	    }
	    return true;
	}
	public boolean equals(MyInteger num) {
		int yyz = num.getValue();
		if (yyz == value){
			return true;
		}else return false;
	}
}