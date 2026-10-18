package notification;
import main.Customer;
public abstract class Notif {
	Customer c;
	
	public Notif(Customer orang) {
		this.c = orang;
	}
	
	public abstract void showNotif();
	
}
