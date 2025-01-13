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
    public boolean isCollinear(Point p1, Point p2) {
        if ((xVal == p1.getX() && xVal == p2.getX()) || (yVal == p1.getY() && yVal == p2.getY())) 
        {
            return true;
        }
        return (double)(yVal - p1.getY()) / (xVal - p1.getX()) == (double)(yVal - p2.getY()) / (xVal - p2.getX());  
    }
}