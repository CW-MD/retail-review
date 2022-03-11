package pkgRetailReview;

public class Product {
	private int upc;
	private String pName;
	private String manufactorer;
	private float price;
	private String desc;
	private short year;
	
	
	public Product() {
		super();
		this.upc = 0;
		this.pName = "";
		this.manufactorer = "";
		this.price = 0;
		this.desc = "";
		this.year = 0;
		
	}
	
	public Product(int upc, String pName, String manufactorer, float price, String desc, short year) {
		super();
		this.upc = upc;
		this.pName = pName;
		this.manufactorer = manufactorer;
		this.price = price;
		this.desc = desc;
		this.year = year;
		
	}
	
	
	public int getUpc() {
		return upc;
	}
	
	public void setUpc(int upc) {
		this.upc = upc;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getManufactorer() {
		return manufactorer;
	}
	public void setManufactorer(String manufactorer) {
		this.manufactorer = manufactorer;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	

}
