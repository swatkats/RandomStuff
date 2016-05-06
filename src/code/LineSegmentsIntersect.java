/**
 * Created by smurthi on 4/24/16.
 */
public class LineSegmentsIntersect {

    //find the orientation for (l1.p1, l1.p2, l2.p1) and (l1.p1,l1.p2,l2.p2)
    //if the orientation of one is clockwise and the other is anti-clockwise
    //then we can say they intersect else, they do not edge case will be that they are collinear lines
    //check if the p1.x lies between max(p2.x and p3.x) similarly for check for y-coordinate too
    //Note -> A x B = |a||b|Sin Q . n  (unit vector)
    public boolean doesLineSegmentsIntersect(LineSegment l1, LineSegment l2)
    {
        int value1 = getOrientation(l1.getP1(), l1.getP2(), l2.getP1());
        int value2 = getOrientation(l1.getP1(), l1.getP2(),l2.getP2());
        int value3 = getOrientation(l2.getP1(), l2.getP2(), l1.getP1());
        int value4 = getOrientation(l2.getP1(), l2.getP2(),l1.getP2());
        if(value1 == 0 && value2 == 0 && value3 == 0 && value4 == 0)
        {//check for collinear case
            return collinearCheck(l1.getP1(),l1.getP2(),l2.getP1()) || collinearCheck(l1.getP1(),l1.getP2(),l2.getP2());
        }
        if(((value1 > 0 && value2 < 0) || (value1<0 && value2>0))&& ((value3 > 0  && value4 < 0) || (value3<0 && value4>0)))
            return  true;

        return false;
    }

    public boolean collinearCheck(Point p1, Point p2, Point p3)
    {
        return (p3.getX() <= Integer.max(p1.getX(), p2.getX()))
                && (p3.getY() <= Integer.max(p1.getY() , p2.getY()))
                && (p3.getX() >= Integer.min(p1.getX(), p2.getX()))
                && (p3.getY() >= Integer.min(p1.getY() , p2.getY()));
    }

    public int getOrientation (Point p1, Point p2, Point p3)
    {
        return ((p2.getX()-p1.getX())*(p3.getY() - p2.getY())) - ((p2.getY()-p1.getY())*(p3.getX() - p2.getX()));
        // u x v = u1v2 i - u2v1 j
    }


}
