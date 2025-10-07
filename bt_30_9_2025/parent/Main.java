package parent;

class Parent {
    static int x = 10;
    static void show() {
        System.out.println("Parent static show()");
    }
}

class Child extends Parent {
    static int x = 20;
    static void show() {
        System.out.println("Child static show()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x);   // lấy theo kiểu tham chiếu -> 10
        p.show();                  // gọi theo kiểu tham chiếu -> Parent static show()

        Child c = new Child();
        System.out.println(c.x);           // 20
        System.out.println(((Parent) c).x); // 10
        c.show();                          // Child static show()
    }
}
