package funcProg;

public class FactorialDeclarative {
	
	public static long declarativeFactorial(int n) 
	{
		assert n > 0 : "Argument must be greather than 0";
		if (n ==1) 
			return 1 ;
		else
			return n*declarativeFactorial(n-1);
	}
}
