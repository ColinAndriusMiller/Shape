public class PentaDecagon implements Shape {
    private double apothem;
    private String color;
    private int sides;
    private double sideLength;
    private double angle;
    public PentaDecagon(int aSideLength, String acolor) {
        color = acolor;
        sides = 15;
        sideLength = aSideLength;
    }
    
    public double getArea() {
        angle = Math.toRadians(180 - (((360 / sides) / 2) + 90));
        apothem = .5 * sideLength * Math.tan(angle);
        return .5 * sideLength * apothem * sides;
    }
    
    public double getPerimeter() {
        return sideLength * sides;
    }
    
    public String getColor() {
        return color;
    }
    
}
