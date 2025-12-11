package jdbcTemplate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public void saveUser(User e){
	String query1="insert into user(name,email) values('"+e.getName()+"','"+e.getEmail()+"')";
	int status1= jdbcTemplate.update(query1);
	System.out.println(status1);
//List<Integer> userIdList=getUserId();
//	System.out.println(userIdList.get(0));
//	int userId=userIdList.get(0);
//	System.out.println(userId);
//	for(Long phonenum:e.getPhonenum()) {
//	String query2="insert into userphone values("+userId+","+phonenum+")";
//	int status2= jdbcTemplate.update(query2);
//	}
//    String query3="insert into useraddress values("+userId+",'"+e.getAddr().getStreet()+"','"+e.getAddr().getCity()+"',"+e.getAddr().getZipcode()+")";
//
//
//	int status3= jdbcTemplate.update(query3);
	//return status3+status2+status1;
}

public List<Integer> getUserId(){
	return jdbcTemplate.query("SELECT id From user order by id desc limit 1",new RowMapper<Integer>(){
		@Override
		public Integer mapRow(ResultSet rs, int rownumber) throws SQLException {
			
			int id=rs.getInt(1);
		     
			return id;
		}
	});
}
}
//DB Model
//create table user(id int(11),name varchar(30),email varchar(30));
//create table useraddress(id int(11) references user(id),street varchar(30),city varchar(30),zipcode int(11));
//create table userphone(id int(11) references user(id),phonenum bigint(11));
