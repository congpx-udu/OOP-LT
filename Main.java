public class Main {
    private int x;
    private int y;

    public Main(int x, int y){
        if (x > 0) {
            this.x = x;
        }
        if (y > 0) {
            this.y = y;
        }
    }

    public void setWidth(int x) {
        if (x > 0) {
            this.x = x;
        }
    }

    public void setHeight(int y) {
        if (y > 0) {
            this.y = y;
        }
    }

    public int getWidth() {
        return x;
    }

    public int getHeight() {
        return y;
    }

    public int dienTich() {
        return x * y;
    }

    public int chuVi() {
        return 2 * (x + y);
    }

    public void display() {
        System.out.println(chuVi());
        System.out.println(dienTich());
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Main hcn = new Main(x, y);
        hcn.display();
    }
}
