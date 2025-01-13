public class TestLine2D {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(4, 9);
        Point p4 = new Point(6, 8);
        Line2D line1 = new Line2D(p1, p2);
        Line2D line2 = new Line2D(p3, p4);
        Line2D line3 = new Line2D(4, 9, 6, 8);
        System.out.println("The points:");
        System.out.printf("p1: x=%d, y=%d%n", p1.getX(), p1.getY());
        System.out.printf("p2: x=%d, y=%d%n", p2.getX(), p2.getY());
        System.out.printf("p3: x=%d, y=%d%n", p3.getX(), p3.getY());
        System.out.printf("p4: x=%d, y=%d%n", p4.getX(), p4.getY());
        System.out.println("Testing constructor using 2 Point objects and the toString method");
        System.out.println("Line 1: " + line1.toString());
        System.out.println("Line 2: " + line2.toString());
        System.out.println("Testing constructor using 4 int's and the toString method");
        System.out.println("Line 3: " + line3.toString());
        System.out.println("Testing getP1 and getP2 methods:");
        System.out.printf("Line 1, getP1: x=%d,y=%d%n", line1.getP1().getX(), line1.getP1().getY());
        System.out.printf("Line 1, getP2: x=%d,y=%d%n", line1.getP2().getX(), line1.getP2().getY());
        System.out.printf("Line 2, getP1: x=%d,y=%d%n", line2.getP1().getX(), line2.getP1().getY());
        System.out.printf("Line 2, getP2: x=%d,y=%d%n", line2.getP2().getX(), line2.getP2().getY());
        System.out.println("Testing getSlope:");
        System.out.println("Line 1 slope: " + line1.getSlope());
        System.out.println("Line 2 slope: " + line2.getSlope());
        System.out.println("Testing isCollinear:");
        System.out.println("Line1 and p3: " + line1.isCollinear(p3));
        System.out.println("Line1 and p4: " + line1.isCollinear(p4));
    }
}