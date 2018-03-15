
public class Person {
	
	private int age;
	private String name;
	private String jobTitle;
	
	public Person (int age, String name, String jobTitle) {
		this.age=age;
		this.name=name;
		this.jobTitle=jobTitle;		
	}
	
	public String toString () {
		return "age: " + age + " name: " + name + " jobTitle: " + jobTitle;
	}

	
	public String getname() {
		return name;
	}
		
}
