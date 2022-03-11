package pkgRetailReview;

public class Reviewer {
	
	private short rid;
	private String fullName;
	private int zip;
	private String rpwd;
	public short getRid() {
		return rid;
	}
	
	public Reviewer() {
		super();
		this.rid = 0;
		this.fullName = "";
		this.zip = 0;
		this.rpwd = "";
	}
	
	public Reviewer(short rid, String fullName, int zip, String rpwd) {
		super();
		this.rid = rid;
		this.fullName = fullName;
		this.zip = zip;
		this.rpwd = rpwd;
	}
	public String getRpwd() {
		return rpwd;
	}
	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}
	public void setRid(short rid) {
		this.rid = rid;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		 this.zip = zip;
	}
	
	
}
