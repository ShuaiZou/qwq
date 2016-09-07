package data;

public class Phone {
	public String phone;
	public String name;
	public String email;

	
	
	public Phone( String phone,String name, String email) {
		
		this.email=email;
		this.name=name;
		this.phone=phone;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", phone=" + phone + ", email=" + email+"]" ;
	}
	
}
