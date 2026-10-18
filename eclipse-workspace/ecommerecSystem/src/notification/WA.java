package notification;
import main.Customer;
public class WA extends Notif{
	public WA(Customer c) {
		super(c);
	}
	
	public void showNotif() {
		System.out.println("Sending WhatsApp to " + c.getName());
	}

}
