class Box{
double length,width,height;
Box(){
length=width=height=-1;
}
Box(double d){
length=width=height=d;
}
Box(double len,double wid ,double ht){
	length = len;
	width = wid;
	height = ht;
}
void volume(){
System.out.println(length*width*height);
}
}
class constructorDemo{
	public static void main(String args[]){
		Box obj1 = new Box();
		obj1.volume();
		Box obj2 = new Box(4);
		obj2.volume();
		Box obj3 = new Box(1,2,4);
		obj3.volume();
	}
}
	
