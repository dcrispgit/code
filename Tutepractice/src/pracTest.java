
public class PracTest 
{


	static String sampleUserName = "james";
	static int sampleUserNumber= 12345;	
	

	public static void main(String[] args) {
		UserAccount myAccount = new UserAccount();
		UserAccount myAccount1 = new UserAccount(sampleUserName,sampleUserNumber);
		UserAccount myAccount2 = new UserAccount("David",1234);
	
		myAccount.displayUserAccountDetails();
		myAccount1.displayUserAccountDetails();
		myAccount2.displayUserAccountDetails();
	}

}
