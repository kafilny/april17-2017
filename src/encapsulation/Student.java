package encapsulation;

public class Student {
private String name;
private String dob;
private String ssn;
private String address;
private int  zipcode;
private String city;
private String country;
public Student(){
	
}

public Student(String name, String dob, String ssn, String address, int zipcode, String city, String country) {
	super();
	this.name = name;
	this.dob = dob;
	this.ssn = ssn;
	this.address = address;
	this.zipcode = zipcode;
	this.city = city;
	this.country = country;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
