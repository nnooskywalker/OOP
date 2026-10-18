package utils;

public class Promo {
	private String name;
	private String promo;
	private int jumlahPromo;
	private String type;
	private int value;
	
	public Promo(String name, String promo, int jumlahPromo, String type, int value) {
		this.name = name;
		this.promo = promo;
		this.jumlahPromo = jumlahPromo;
		this.type = type;
		this.value = value;
	}
	
	public void addPromoAvailability(int jumlahPromo) {
		this.jumlahPromo += jumlahPromo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
