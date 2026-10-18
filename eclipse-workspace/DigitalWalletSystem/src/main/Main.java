package main;
import utils.TransferRecord;
import utils.User;
import utils.Wallet;
import utils.WalletCompany;

public class Main {
	public static void main(String[] args) {
		// company
		WalletCompany wc = new WalletCompany("W01","PayFast");
		
		//User
		User u1 = new User("U01","Alice");
		User u2 = new User("U02","Bob");
		
		//register user
		wc.registerUser(u1);
		wc.registerUser(u2);
		
		//transfer
		u1.transferTo(u2, 300);
		
		//print wallet
		wc.printAllWallets();
	}
}
