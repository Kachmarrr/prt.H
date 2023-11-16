import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення координат другої точки
        System.out.print("Введіть координату x другої точки: ");
        int x2 = scanner.nextInt();
        System.out.print("Введіть координату y другої точки: ");
        int y2 = scanner.nextInt();
        System.out.print("Введіть координату z другої точки: ");
        int z2 = scanner.nextInt();

        // Створення об'єктів класу Point3D
        point point1 = new point(7  , 9, 5);
        point point2 = new point(x2, y2, z2);

        // Вивід відстані між двома точками
        System.out.println("Відстань між точками: " + point1.distanceTo(point2));

        // Закриття Scanner ??????
        scanner.close();//?????

    }
}

import java.util.Scanner;

public class point {

    Scanner scanner = new Scanner(System.in);

    private int x;
    private int y;
    private int z;

    public point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    // Метод для обчислення відстані між двома точками
    public double distanceTo(point otherPoint) {
        double deltaX = this.x - otherPoint.getX();
        double deltaY = this.y - otherPoint.getY();
        double deltaZ = this.z - otherPoint.getZ();

        // Формула для обчислення в просторі
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }
}
