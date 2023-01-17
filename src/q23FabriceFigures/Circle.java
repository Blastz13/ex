package q23FabriceFigures;

public class Circle implements Figure{

    private int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public float getArea() {
        return (float) (3.14*(r*r));
    }

    @Override
    public float getSquare() {
        return 0;
    }
}
