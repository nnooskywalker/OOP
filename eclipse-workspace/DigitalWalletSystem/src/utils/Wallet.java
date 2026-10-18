package utils;
import java.util.ArrayList;

public class Wallet {
	private String walletId;
	private double balance;
	private ArrayList<TransferRecord> history;
	
	public Wallet(String userId) {
		this.walletId = "W" + userId;
		this.balance = 0;
		this.history = new ArrayList<>();
	}
	
	public void topUp(double amount) {
		this.balance += amount;
		
		TransferRecord tr = new TransferRecord()
	}
	
	public void increaseBalance(double amount) {
		this.balance += amount;
	}
	
	public void decreaseBalance(double amount) {
		this.balance -= amount;
	}
	
	public void addRecord(TransferRecord r) {
		history.add(r);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public ArrayList<TransferRecord> getHistory(){
		return this.history;
	}
	
}
