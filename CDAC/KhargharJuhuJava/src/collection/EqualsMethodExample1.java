/**
 * 
 */
package collection;

import java.util.HashSet;

/**
 * @author Nipun Madaan
 *
 */
class B{
	private Integer x;
	private String y;
	private Double z;
	public B(Integer x, String y, Double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * @return the x
	 */
	public Integer getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(Integer x) {
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
	public Double getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(Double z) {
		this.z = z;
	}

	@Override
	public boolean equals(Object o) {   //o=a2  Object o=new A();   //overriding of equals method of Object class
		B a =(B)o;  //downcasting
		if(x.equals(a.getX()) && y.equals(a.getY()) && z.equals(a.getZ()))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {   //overriding of hashcode method of Object class
		int a=x*54574984;
		return a;
	}

	@Override
	public String toString() {   //overriding toString method of Object class
		return "B [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
public class EqualsMethodExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B a1 = new B(100,"CDAC",12.5);
		B a2 = new B(100,"CDAC",12.5);
		a1.toString();
		System.out.println(a1);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		/*We need to override equals method and hashcode method so that we can compare on actual data not on reference
		 * as sometime duplicate elements are not allowed like in HashSet but equals method of Object class internally 
		 * compare reference not the actual data. So, we need to override all the three methods of Object class i.e.
		 * equals, hashCode,toString methods whenever we use collection for user defined class **/
		HashSet<B> set= new HashSet<B>();
		set.add(a1);
		set.add(a2);
		System.out.println(set);
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
