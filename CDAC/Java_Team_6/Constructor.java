class Constructor{
	int i;
	Constructor(){     //zero paramter constructor
		System.out.println("Constructor");
	}
	
	Constructor(int j){   //paramterized constructor
		i=j;
		System.out.println("Constructor");
	}
	
	public static void main(String[] args){
		Constructor c = new Constructor(10);
		System.out.println(c.i);
	}
}