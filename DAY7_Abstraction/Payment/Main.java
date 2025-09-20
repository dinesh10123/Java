// Interface with Multiple Implementations - Create an interface Payment with a method pay(). 
// Implement this interface in two classes CreditCardPayment and PaypalPayment. 
// \Write a PaymentProcessor class that uses the Payment interface to process payments.

interface Payment{
	void pay(double amount);
}
class CreditCardPayment implements Payment{
	private String cardNo;
	public CreditCardPayment(String cardNo){
		this.cardNo = cardNo;
	}
	public void pay(double amount){
		System.out.println("paid "+amount+" using credit card "+cardNo);
	}
}
class PaypalPayment implements Payment{
	private String email;
	public PaypalPayment(String email){
		this.email = email;
	}
	public void pay(double amount){
		System.out.println("paid "+amount+" using paypal Payment "+email);
	}
}
class PaymentProcessor{
	private Payment paymentmethod;
	public PaymentProcessor(Payment paymentmethod){
		this.paymentmethod = paymentmethod;
	}

	public void proceesPay(double amount){
		paymentmethod.pay(amount);
	}
}
public class Main{
	public static void main(String[] args) {
		Payment credit  = new CreditCardPayment("2541-5688-5165-5223");
		PaymentProcessor p1 = new PaymentProcessor(credit);
		p1.proceesPay(10000);

		Payment paypal = new PaypalPayment("abc@gmail.com");
		PaymentProcessor p2 = new PaymentProcessor(paypal);
		p2.proceesPay(20000);
	}
}