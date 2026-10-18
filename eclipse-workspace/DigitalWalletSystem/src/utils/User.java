package utils;

public class User {
	private String userId;
	private String name;
	private Wallet wallet;
	private WalletCompany company;
	
	public User(String id, String name) {
		this.userId = id;
		this.name = name;
		this.wallet = new Wallet(id);
	}
	
	public void setCompany(WalletCompany c) {
		this.company = c;
	}
	
	public Wallet getWallet() {
		return this.wallet;
	}
	
	
	public void transferTo(User receiver, double amount) {
		double orang1 = this.getWallet().getBalance();
		orang1 -= amount;
		double orang2 = receiver.getWallet().getBalance();
		orang2 += amount;
		
		this.getWallet().decreaseBalance(orang1);
		receiver.getWallet().increaseBalance(orang2);
		
		TransferRecord tr1 = new TransferRecord(this.name, receiver.name,"TRANSFER",amount);
		TransferRecord tr2 = new TransferRecord(this.name, receiver.name,"TRANSFER",amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
