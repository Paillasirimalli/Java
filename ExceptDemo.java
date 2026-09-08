class MyException extends Exception{
MyException(String message){
	super(message);
}
}
	public class ExceptDemo{
		public static void main(String args[]){
			try{
				throw new MyException("Student of CSMC");
			}
			catch(MyException e){
				System.out.println(e.getMessage());
			}
		}
	}