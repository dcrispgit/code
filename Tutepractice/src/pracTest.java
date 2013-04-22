package pracTest;

public class pracTest {


	String sampleUserName = "David";
	int sampleUserNumber = 12345;
	
	public static void main(String[] args) {
		UserAccount myAccount = new UserAccount();
		UserAccount myAccount1 = new UserAccount(sampleUserName,sampleUserNumber);
		UserAccount myAccount2 = new UserAccount("David",1234);
	
		myAccount.displayUserAccountDetails();
	}

}
