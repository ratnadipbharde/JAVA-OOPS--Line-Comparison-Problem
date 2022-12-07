import java.awt.*;
import java.util.Scanner;

public class Line {
    private Point p1;
    private Point p2;

    public double getLengthOfLine() {
        p1 = new Point();
        p2 = new Point();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        p1.setX(sc.nextInt());
        System.out.print("Enter y1 : ");
        p1.setY(sc.nextInt());
        System.out.print("Enter x2 : ");
        p2.setX(sc.nextInt());
        System.out.print("Enter x2 : ");
        p2.setY(sc.nextInt());
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public void isEqual(Double line1, Double line2) {
        if (line1.equals(line2)) {
            System.out.println("lines are Equal");
        } else {
            System.out.println("lines are not Equal");
        }
    }

    public void copmpare(Double lineOne, Double lineTwo) {

        if ((lineOne.compareTo(lineTwo)) < 0) {
            System.out.println("Line 1 is Less than Line 2");
        } else if ((lineOne.compareTo(lineTwo)) > 0) {
            System.out.println("Line 1 is Greater than Line 2");
        }
        System.out.println("Lines are Equal");
    }
}
