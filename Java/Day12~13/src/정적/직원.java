package 정적;

public class 직원 {
	String name;
	int age;
	char gender;
	static int count;
	static int totalAge;
	
	public 직원(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		totalAge = totalAge + age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
