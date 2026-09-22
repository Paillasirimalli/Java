class students implements Runnable{
private String name;
public students(String name){
this.name=name;
}
public void run(){
for (int i=1;i<=10;i++){
System.out.println(name+" writing page"+i);
}
System.out.println(name+" completed writing");
}
}
class ThrdEx{
public static void main(String args[]){
students r1= new students("t1");
Thread t=new Thread(r1);
t.start();
students r2=new students("t2");
Thread t1=new Thread(r2);
t1.start();
}
}