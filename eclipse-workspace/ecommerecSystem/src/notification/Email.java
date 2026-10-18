package notification;
import main.Customer;
public class Email extends Notif{
	public Email(Customer c) {
		super(c);
	}
	
	public void showNotif() {
		System.out.println("sending email to " + c.getEmail());
	}
	
	
}
