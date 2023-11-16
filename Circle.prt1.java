
public class Main {
    public static void main(String[] args) {

        Circle Circle1 = new Circle(13, 7);

        Circle1.setRadius(14);
        Circle1.setLength(17);

        Circle1.getRadius();
        Circle1.getLength();

        int length = Circle1.getLengthOFCircle();
        int area = Circle1.getArea();

        System.out.println(length);
        System.out.println(area);
        
    }
}


public class Circle {

    private int radius;
    private int length;

    public Circle(int defradius, int defLength) {
        radius = defradius;
        length = defLength;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRadius() {
        return radius;
    }

    public int getLength() {
        return length;
    }

    public int getLengthOFCircle(){
        return (int) (Math.PI * 2 * radius);
    }

    public int getArea(){
        return (int) (Math.PI * radius * radius);
    }
}
