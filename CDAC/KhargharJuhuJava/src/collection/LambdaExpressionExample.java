package collection;
interface Drawable{  
    public void draw();  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            @Override
        	public void draw(){
            	System.out.println("Drawing");
            }  
        };  
        d.draw();  
    }  
}