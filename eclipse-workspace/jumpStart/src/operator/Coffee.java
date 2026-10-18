package operator;

public class Coffee {
	private String name;
	private int air;
	private int susu;
	private int bijiKopi;
	private int harga;
	
	
	public Coffee(String name, int air, int susu, int bijiKopi, int harga) {
		this.air = air;
		this.name = name;
		this.susu = susu;
		this.bijiKopi = bijiKopi;
		this.harga = harga;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAir() {
		return air;
	}


	public void setAir(int air) {
		this.air = air;
	}


	public int getSusu() {
		return susu;
	}


	public void setSusu(int susu) {
		this.susu = susu;
	}


	public int getBijiKopi() {
		return bijiKopi;
	}


	public void setBijiKopi(int bijiKopi) {
		this.bijiKopi = bijiKopi;
	}


	public int getHarga() {
		return harga;
	}


	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
	
	
}
