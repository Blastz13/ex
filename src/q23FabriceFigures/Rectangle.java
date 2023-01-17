package q23FabriceFigures;

public class Rectangle implements Figure{
    private int x, y;
    private int a;

    public Rectangle(int x, int y, int a) {
        this.x = x;
        this.y = y;
        this.a = a;
    }

    @Override
    public float getArea() {
        return a*a;
    }

    @Override
    public float getSquare() {
        return 0;
    }
}
