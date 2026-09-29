class myThread implements Runnable{
int val;
public synchronized void run(){
	for(int i=2;i<1000;i++)
		val+=i;
}
}
class Exe{
	public static void main(String args[]) throws InterruptedException{
		myThread robj=new myThread();
		Thread t1 = new Thread(robj);
		Thread t2 = new Thread(robj);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(robj.val);
	}
}