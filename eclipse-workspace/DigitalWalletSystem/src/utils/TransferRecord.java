package utils;

public class TransferRecord {
	private String recordId;
	private String senderName;
	private String receiverName;
	private String transactionType;
	private double amount;
	
	
	public TransferRecord (String senderName, String receiverName, String transactionType, double amount){
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	
	public void getInfo(String viewerName) {
		if (this.transactionType == "TOPUP") {
			System.out.println("- Top Up" + this.amount);
		}
		else {
			System.out.println("- Sent " + this.amount + " to " + this.receiverName);
		}
	}
}
