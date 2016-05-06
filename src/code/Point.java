/**
 * Created by smurthi on 4/24/16.
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return ("("+x+","+y+")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point that = (Point)obj;
        return (this.getX() == that.getX()) && (this.getY() == that.getY());
    }

    @Override
    public int hashCode() {
        int result = 31 * this.getX() + 31* this.getY();
        return result;
    }
}
