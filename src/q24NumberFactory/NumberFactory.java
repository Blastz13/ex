package q24NumberFactory;

public class NumberFactory {
    public RationalNumber createNumber(NumberType type, double real, double imaginary) {
        switch (type) {
            case RATIONAL:
                return new RationalNumber(real);
            case COMPLEX:
                return new ComplexNumber(real, imaginary);
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
