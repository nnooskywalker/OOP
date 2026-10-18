package notification;
import main.Customer;
public class SMS extends Notif{
	public SMS(Customer c) {
		super(c);
	}
	
	public void showNotif() {
		System.out.println("Sending SMS to " + c.getName());
	}
}
