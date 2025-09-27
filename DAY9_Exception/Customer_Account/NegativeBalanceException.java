package customerAccount;

public class NegativeBalanceException extends Exception{
	
	public NegativeBalanceException(String message) {
		super(message);
	}
}
