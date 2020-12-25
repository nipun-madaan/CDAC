/**
 * 
 */
package collection;

/**
 * @author Nipun Madaan
 *
 */
class A{
	private int x;
	private String y;
	private double z;
	public A(int x, String y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public String getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(String y) {
		this.y = y;
	}
	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}
	/**
	 * @param z the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public boolean equals(Object o) {   //o=a2  Object o=new A();  //overriding the equals method of object class
		A a =(A)o;  //downcasting
		if(x==a.getX() && y.equals(a.getY()) && z==a.getZ())
			return true;
		else
			return false;
	}
	
}
public class EqualsMethodExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1 = new A(1,"CDAC",3);
		A a2 = new A(1,"CDAC",3);
		//a1=a2;
		System.out.println(a1==a2);  //== only compares the reference
		System.out.println(a1.equals(a2));  //.equals compare the actual value
	}
}
