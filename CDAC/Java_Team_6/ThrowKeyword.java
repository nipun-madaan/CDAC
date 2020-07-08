class Y{
	public static void main(String[] args){
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			try{
				throw e;
			}catch(Exception e1){
				System.out.println("Exception rethrown and handled");
			}
		}
	}
}