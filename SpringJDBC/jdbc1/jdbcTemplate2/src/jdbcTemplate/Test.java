package jdbcTemplate;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserDao dao=(UserDao)ctx.getBean("udao");
//		int status=dao.saveEmployee(new Employee(103,"Ajay",35000));
//		System.out.println(status);
//		User u = new User();
//        u.setName("Avinash");
//        u.setEmail("avinash@gmail.com");
//        Address a1= new Address();
//        a1.setStreet("JublieeHills");
//        a1.setCity("Hyderabad");
//        a1.setZipcode(500008);
//        u.setAddr(a1);
//        ArrayList<Long> phonenum= new ArrayList<Long>();
//        phonenum.add(893758391L);
//        phonenum.add(893758392L);
//       
//        u.setPhonenum(phonenum);
		User user=(User)ctx.getBean("user");
		dao.saveUser(user);
		//System.out.println(status);
		
		
		/*Employee e=new Employee();
		e.setId(102);
		int status=dao.deleteEmployee(e);
		System.out.println(status);*/
		
	}

}
