package ua.controller;

//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;

public class Person {

	private int age;
	
//	@Size(min=3, max=20,     message="Username must be between 3 and 20 characters long.")
//	@Pattern(regexp="^[a-zA-Z0-9]+$",    message="Username must be alphanumeric with no spaces")
	private String username;
	
	private String realname;
	private String email;
	private String password;
	
	public Person(int age, String username, String realname, String email, String password) {
		super();
		this.age = age;
		this.username = username;
		this.realname = realname;
		this.email = email;
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", username=" + username + ", realname=" + realname + ", e-mail=" + email + ", password=" + password +"]";
	}
}
