class L1{
	public static void main(String[] args){
		try{
			int i=10/0;   //Arithmetic Exception
			System.out.println("try");
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Main completed");
	}
}