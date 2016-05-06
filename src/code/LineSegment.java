/**
 * Created by smurthi on 4/24/16.
 */
public class LineSegment {
    Point p1;
    Point p2;

    public LineSegment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public String toString()
    {
        return(" The line is " + p1.toString() + " to " + p2.toString());
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
