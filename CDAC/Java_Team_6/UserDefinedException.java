class UserException extends Exception{
	UserException(String msg){
		super(msg);
	}
}
class Z{
	public static void main(String[] args){
		int sellingPrice = 10;
		int costPrice = 20;
		try{
			if(costPrice>sellingPrice){
				throw new UserException("CP can't be greater than SP");
			}else{
				System.out.println("Profit: "+(sellingPrice-costPrice));
			}
			double profitPercentage = ((sellingPrice-costPrice)*costPrice)/100;
			System.out.println("Profit Percentage: "+profitPercentage);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}