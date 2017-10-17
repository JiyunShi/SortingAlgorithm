
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public String toString() {
		return "Name: " + name + ", age: " + age;
		
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		return age - o.age;
	} 

}
