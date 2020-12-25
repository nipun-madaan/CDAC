/**
 * 
 */
package collection;

/**
 * @author Nipun Madaan
 *
 */
public class Student implements Comparable<Student>{
	
	int rollNo;
	
	String name;
	
	int age;
	
	double gradPercent;
	
	public Student(int rollNo, String name, int age, double gradPercent) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.gradPercent = gradPercent;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

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

	public double getGradPercent() {
		return gradPercent;
	}

	public void setGradPercent(double gradPercent) {
		this.gradPercent = gradPercent;
	}

	@Override
	public String toString() {
		return "{rollNo=" + getRollNo() + ", name=" + name + ", age=" + age + ", gradPercent=" + gradPercent+"}";
	}

	/**
	 * compareTo is used to compare two objects which is used by Collections.sort() to identify on
	 * which field sorting needs to be done. We are overriding compareTo method of Comparable class.
	 * Comparable is used only for single sort i.e it can only be sort by given one type here in example 
	 * is roll no
	 */
	@Override
	public int compareTo(Student s) {
		return this.getRollNo()-s.getRollNo();
	}
	
	
}
