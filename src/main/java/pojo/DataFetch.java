package pojo;

public class DataFetch {
	private String username;
	private String password;
	private String loginURL;
	private String userName;
	
	
	public DataFetch(String userName,String password,String loginURL) {
		this.userName=userName;
		this.password=password;
		this.loginURL=loginURL;
	}
	public DataFetch() {
		 
	}
	public String getUserName() {
			return userName;	
	}
	public void setusername(String userName) {
		this.userName=userName;
	}
	

}
