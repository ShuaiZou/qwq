package com.jihefanxing.java;

public class Phone {
	public String phone;
	public String name;
	public String email;
	public String address;
	
	public Phone( String phone,String name, String email,String address) {
		this.address=address;
		this.email=email;
		this.name=name;
		this.phone=phone;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address + "]";
	}
	
}
