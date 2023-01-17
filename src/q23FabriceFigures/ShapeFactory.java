package q23FabriceFigures;

public class ShapeFactory {
    public Figure createShape(String type, int a, int b, int c){
        if (type == "rect"){
            return new Rectangle(a, b, c);
        }else if (type == "circ"){
            return new Circle(a, b, c);
        }

        return null;
    }
}
