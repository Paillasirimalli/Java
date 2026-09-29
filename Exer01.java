class InsufficientException extends Exception {
    public InsufficientException(String msg) {
        super(msg);
    }
}

class Bank {
    int Balance = 1000;

    public void deposit(int money) {
        Balance = Balance + money;
        System.out.println(Balance);
    }

    public synchronized void withdraw(int money) throws InsufficientException {
        if (Balance < money) {
            throw new InsufficientException("Insufficient Balance");
        } else {
            Balance = Balance - money;
            System.out.println(Balance);
        }
    }
}

class Customer implements Runnable {
    Bank b;

    public Customer(Bank b) {
        this.b = b;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            b.withdraw(200);
            b.withdraw(800);
            b.withdraw(200);
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Exer01 {
    public static void main(String args[]) {
        Bank b = new Bank();

        new Customer(b);
        new Customer(b);
    }
}