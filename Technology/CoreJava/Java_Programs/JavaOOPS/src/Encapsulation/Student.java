package Encapsulation;
// non-encapsulated class - data can be modified
public class Student {
 private int st_id;
 private String st_name;
public void setSt_id(int stid) {
	if(stid>0)
	st_id=stid;
	else
		System.out.println("id cannot be negative");
}
public int getSt_id() {
	return st_id;
}
}
