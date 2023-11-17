  public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(1);
        Rectangle rectangle1 = new Rectangle(1,1);

        circle1.getArea();
        rectangle1.getArea();
        
    }
}

import java.util.Scanner;

public class GeometricShape {

    Scanner scanner = new Scanner(System.in);

    public void getArea(){

    }

}

public class Circle extends GeometricShape{
     private int radius;

     public Circle(int radius){
         this.radius = radius;
     }

     public void getArea(){

          System.out.println("ведіть довжину радіусу: ");
          int radius = scanner.nextInt();

          System.out.println(radius * radius * Math.PI);
     }
}


public class Rectangle extends GeometricShape {

    private int length;
    private int wigth;

    public Rectangle(int length, int wigth) {
        this.length = length;
        this.wigth = wigth;
    }

    public void getArea(){

        System.out.println("");
        int length = scanner.nextInt();
        System.out.println();
        int width = scanner.nextInt();

        System.out.println(length * width);

    }
}
