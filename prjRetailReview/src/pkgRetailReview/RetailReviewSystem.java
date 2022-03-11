package pkgRetailReview;

public class RetailReviewSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetailReview amazon = new RetailReview();
		boolean isValidLogin = false;
		amazon.loadData();
		isValidLogin = amazon.login();
		if(isValidLogin) {
			amazon.createReview();
		}
		else {
			System.out.println("Invalid Login");
		}

	}

}
