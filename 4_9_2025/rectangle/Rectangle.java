package rectangle;

public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int width, int height) {
        setHeight(height);
        setWidth(width);
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.x = width;
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.y = height;
        }
    }

    public int getWidth() {
        return x;
    }

    public int getHeight() {
        return y;
    }

    public static int tinhChuVi(int x, int y) {
        return 2*(x+y);
    }

    public static int tinhDienTich(int x, int y) {
        return x*y;
    }
}