package jdbcTemplate;

import java.util.List;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

public class User {

private int id;


//@NotNull(message = "Name cannot be null")
private String name;
private String email;
private Address addr;
//@Pattern(regexp="^[0-9]{10}")
private  List<Long> phonenum;
public User() {}
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}

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

public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

public List<Long> getPhonenum() {
	return phonenum;
}

public void setPhonenum(List<Long> phonenum) {
	
	this.phonenum = phonenum;
}


}
