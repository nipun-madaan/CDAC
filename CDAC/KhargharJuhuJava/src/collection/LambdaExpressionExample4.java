package collection;
interface MyLogic{
	boolean test(int num);
}
class ArrayOp{
	
	static void printArray(MyLogic logic, int[] arr) {
		for(int a : arr) {
			if(logic.test(a)) {
				System.out.print(a+" ");
			}
		}
		System.out.println();
	}
}
public class LambdaExpressionExample4 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		MyLogic logic1=(num)->(true);//{return true;};
		ArrayOp.printArray(logic1, arr);
		MyLogic logic2 = (n)->(n%2==0);  //{if(n%2==0)return true;else return false;};
		/*(n)->{
			if(n%2==0)
				return true;
			else
				return false;
		};*/
		ArrayOp.printArray(logic2, arr);
		MyLogic logic3 = (n)->(n%2!=0);
		ArrayOp.printArray(logic3, arr);
		MyLogic logic4 = (n)->{
			int num=2;
			if(n==1)
				return false;
			while(num<n) {
				if(n%num==0)
					return false;
				num++;
			}
			return true;
		};
		ArrayOp.printArray(logic4, arr);
	}
}
