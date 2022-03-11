package pkgRetailReview;

public class Review {

	private short rnum; //number  of review
	private String rdate; // date review was made
	private short rid; //id of person leaving review
	private short rating;
	private String rdesc; //content of review
	private  int prodnum;
	
	
	public Review() {
		super();
		this.rnum = 0;
		this.rdate = "";
		this.rid = 0;
		this.rating = 0;
		this.rdesc = "";
		this.prodnum = 0;
	}
	
	public Review(short rnum, String rdate, short rid, short rating, String rdesc, int prodnum) {
		super();
		this.rnum = rnum;
		this.rdate = rdate;
		this.rid = rid;
		this.rating = rating;
		this.rdesc = rdesc;
		this.prodnum = prodnum;
	}
	public short getRnum() {
		return rnum;
	}
	
	public void setRnum(short rnum) {
		this.rnum = rnum;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public short getRid() {
		return rid;
	}
	public void setRid(short rid) {
		this.rid = rid;
	}
	public short getRating() {
		return rating;
	}
	public void setRating(short rating) {
		this.rating = rating;
	}
	public String getRdesc() {
		return rdesc;
	}
	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}
	public int getProdnum() {
		return prodnum;
	}
	public void setProdnum(int prodnum) {
		this.prodnum = prodnum;
	}
	
	
}
