package box;

public class Box3 extends Box {
    public Box3() {
        super();

    }

    @Override
    public boolean validate(float length, float width, int height) {
        return (length <= 23 && width <= 14 && height <=13);
    }
}
