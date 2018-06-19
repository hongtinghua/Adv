import java.util.ArrayList;
import java.util.List;

public class ListNew {
	
	public static void main(String[] args) {
		User user =  null;
		List<User> list = new ArrayList<User>();
		for(int i = 0; i<10;i++) {
			user = new User();
			user.setAge(i);
			user.setName(i+"a");
			user.setSex(i);
			list.add(user);
		}
		
		for(User a:list) {
			System.out.println(a.getName());
		}
		
	}

}

class User{
	
	
	private String name;
	
	private int age;
	
	private int sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
}
