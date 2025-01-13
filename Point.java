public class Point {
    private int xVal;
    private int yVal;
    public Point() {
        xVal = 0;
        yVal = 0;
    }
    public Point(int x, int y) {
        xVal = x;
        yVal = y;
    }
    public int getX()
    {
        return xVal;
    }
    public int getY()
    {
        return yVal;
    }
    public void setX(int x)
    {
        xVal = x;
    }
    public void setY(int y)
    {
        yVal = y;
    }
    public int manhattanDistance(Point other)
    {
        int xDist = Math.abs(xVal - other.getX());
        int yDist = Math.abs(yVal - other.getY());
        return xDist + yDist;
    }
    public boolean isCollinear(Point p1, Point p2)
    {
        if((p1.getX()-xVal) == 0 || (p2.getX()-p1.getX() == 0))
            return false;
        if((double)(p1.getY()-yVal)/(p1.getX()-xVal) == (double)(p2.getY()-yVal)/(p2.getX()-xVal))
        {
            return true;
        }
        return false;
    }
}