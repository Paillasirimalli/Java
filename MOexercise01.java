 class A {
    int i, j;
    A(int x, int y) {
        i = x;
        j = y;
    }
    void show() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}
class B extends A {
    int k;
    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}
class MOexercise01 {
    public static void main(String[] args) {
        B obj = new B(2, 4, 6);
        obj.show();
    }
}