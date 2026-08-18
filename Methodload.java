class Addition{
void sum(int a,int b){
System.out.println(a + b);

}
	void sum(int a,int b,int c){
	System.out.println(a + b + c);
	}
	
	void sum(float a,float b){
		System.out.println(a + b);
	}
	}
	class Methodload
	{
		public static void main(String [] args)
		{
			Addition obj = new Addition();
			obj.sum(10,20);
			obj.sum(10,20,30);
			obj.sum(10.05f,15.05f);
		}
	}