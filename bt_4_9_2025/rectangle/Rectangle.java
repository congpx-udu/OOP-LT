package rectangle;

public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
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

    public int tinhChuVi() {
        return 2 * (x + y);
    }

    public int tinhDienTich() {
        return x * y;
    }
}
