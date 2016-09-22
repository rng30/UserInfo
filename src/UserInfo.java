
public class UserInfo {

	private String Name;
	private int Staffid;
	private String Birthdate;
	
	{
	Name = "Ron";
    Staffid = 190912;
    Birthdate = "5/7/2001";
}
	
	public String getName(){
		return this.Name;
	}
	public int getStaffid(){
		return this.Staffid;
	}
	public String getBirthdate(){
		return this.Birthdate;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setStaffid(int x){
		this.Staffid = x;
	}
	public void setBirthdate(String date){
		this.Birthdate = date;
	}
}

