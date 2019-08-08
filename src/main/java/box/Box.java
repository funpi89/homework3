package box;

public  class Box {
    float boxlength;
    float boxwidth;
    float boxheight;

    public Box(float boxlength, float boxwidth, int boxheight) {
        this.boxlength = boxlength;
        this.boxwidth = boxwidth;
        this.boxheight = boxheight;
    }

    public  boolean validate(float length, float width, int height){
        return (length <= boxlength && width <= boxwidth && height <= boxheight);
    }
}
