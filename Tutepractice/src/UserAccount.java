
public class UserAccount {
	private int userNumber;
	private String userName;
	
	
	UserAccount()
	{
		
	}
	
	UserAccount(String uName,int uNumber)
	{
		userName = uName;
		userNumber = uNumber;
	}
	
	public void setUserAccount(int number, String name)
	{
		userNumber = number;
		userName = name;
	}

	public void displayUserAccountDetails()
	{
		System.out.println();
		System.out.printf("User account Name is %s; user Number is %d", userName,userNumber);
		System.out.println();
	}
	
	
}
