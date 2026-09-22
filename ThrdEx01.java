class factorial implements Runnable{
int n;
public factorial(int n){
this.n=n;
}
public void run(){
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println(fact);
}
}
class ThrdEx01{
public static void main(String args[]){
factorial f=new factorial(7);
Thread t= new Thread(f);
t.start();
}
}