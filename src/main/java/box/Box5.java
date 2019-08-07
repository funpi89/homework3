package box;

public class Box5 extends Box {
    public Box5() {
        super();
    }

    @Override
    public boolean validate(float length, float width, int height) {
        return (length <= 39.5 && width <= 27.5 && height <=23);
    }
}
