public class ExceptDemo01{
public static void main(String args[]){
int[] arr={10,20,30,40};
try{
	int res=20/5;
	System.out.println(res);
	System.out.println(arr[5]);
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("CSMC Error");
}
catch (Exception e){
	System.out.println(e.getMessage());
}
System.out.println("Program Ends");
}
}