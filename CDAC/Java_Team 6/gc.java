public class gc{
	private int x;
	private int y;
	private gc g;
	
	gc(int x1,int y1){
		x=x1;
		y=y1;
	}
	public void sum(){
		System.out.println(x+y);
	}
	
	public void fun(){
		gc g = new gc(1,2);
		g.sum();
	}
	
	@Override
	protected void finalize() throws Throwable{ 
		System.out.println("gc called");
	}
	public static void main(String[] args){
		gc a1 = new gc(5,10);
		gc a2 = new gc(10,20);
		gc a3 = new gc(20,30);
		a1.g=a2;
		a2.g=a3;
		a3.g=a1;
		a1=null;
		a2=null;
		a3=null;
		
		//System.gc();
		Runtime.getRuntime().gc();
	}
	
};



