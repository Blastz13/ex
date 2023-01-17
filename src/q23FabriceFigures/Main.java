package q23FabriceFigures;

public class Main
{
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Figure c = shapeFactory.createShape("circ", 1, 1, 4);
        System.out.println(c.getArea());
        Figure r = shapeFactory.createShape("rect", 1, 1, 4);
        System.out.println(r.getArea());
    }
}
