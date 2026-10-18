package utils;
import java.util.ArrayList;

public class WalletCompany {
	private String companyId;
	private String companyName;
	private ArrayList<User> users;
	
	public WalletCompany(String companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.users = new ArrayList<>();
	}
	
	
	public void registerUser(User u) {
		users.add(u);
	}
	
	public void findUserById(String id) {
		
	}
	
	public void printAllWallets() {
		System.out.println("Company : " + this.companyName);
		
		for(User u : users) {
			System.out.println("User : " + u.getName());
			System.out.println("Balance : " + u.getWallet().getBalance());
			System.out.println("History : ");
			for(TransferRecord tr : u.getWallet().getHistory()) {
				System.out.println(tr.getInfo(companyId));
			}
		}
	}
}
