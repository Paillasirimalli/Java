
class MyThread implements Runnable {
    int val;

    public void run() {
        synchronized (this) {
            for (int i = 1; i < 10000; i++) {
                val += i;
            }
        }
    }
}

class Exe1 {
    public static void main(String args[]) throws InterruptedException {

        MyThread robj = new MyThread();

        Thread t1 = new Thread(robj);
        Thread t2 = new Thread(robj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(robj.val);
    }
}