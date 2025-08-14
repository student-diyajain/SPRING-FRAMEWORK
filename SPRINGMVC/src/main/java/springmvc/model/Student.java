package springmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Student {
private String name;
private String email;
private String password;
private String courses;
private String gender;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public String getCourses() {
	return courses;
}
public void setCourses(String courses) {
	this.courses = courses;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "user [name=" + name + ", email=" + email + ", password=" + password + ", courses=" + courses + ", gender="
			+ gender + "]";
}


}
