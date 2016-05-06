/**
 * Created by smurthi on 4/24/16.
 */

public class checkLineSegmentIntersection {
    public static void main(String args[])
    {
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,6);
        Point p3 = new Point(1,1);
        Point p4 = new Point(4,6);
        Point p5 = new Point(5,2);
        Point p6 = new Point(4,6);

        LineSegment l1 = new LineSegment(p3,p2);
        LineSegment l2 = new LineSegment(p1,p5);
        //LineSegment l1 = new LineSegment(p1,p2);
        //LineSegment l1 = new LineSegment(p1,p2);
        LineSegmentsIntersect lineSegChecker = new LineSegmentsIntersect();
        System.out.println(l1.toString() + l2.toString() + lineSegChecker.doesLineSegmentsIntersect(l1, l2));
        LineSegment ls1 = new LineSegment(new Point(1, 1), new Point(10, 1));
        LineSegment ls2 = new LineSegment(new Point(1, 2), new Point(10, 2));

        System.out.println(ls1.toString() + ls2.toString() + lineSegChecker.doesLineSegmentsIntersect(ls1, ls2));
        //Console.WriteLine("The 2 line segments {0} and {1} is {2}", ls1, ls2, IsIntersecting(ls1, ls2));

        ls1 = new LineSegment(new Point(10, 0), new Point(0, 10));
        ls2 = new LineSegment(new Point(-1, -1), new Point(20, 20));

        System.out.println(ls1.toString() + ls2.toString() + lineSegChecker.doesLineSegmentsIntersect(ls1, ls2));

        ls1 = new LineSegment(new Point(-3, -3), new Point(0, 0));
        ls2 = new LineSegment(new Point(1, 1), new Point(20, 20));

        System.out.println(ls1.toString() + ls2.toString() + lineSegChecker.doesLineSegmentsIntersect(ls1, ls2));

        ls1 = new LineSegment(new Point(-3, -3), new Point(0, 0));
        ls2 = new LineSegment(new Point(0, 0), new Point(20, 20));

        System.out.println(ls1.toString() + ls2.toString() + lineSegChecker.doesLineSegmentsIntersect(ls1, ls2));

        ls1 = new LineSegment(new Point(1, 1), new Point(4, 6));
        ls2 = new LineSegment(new Point(2, 3), new Point(5, 2));

        System.out.println(ls1.toString() + ls2.toString() + lineSegChecker.doesLineSegmentsIntersect(ls1, ls2));


    }
}
