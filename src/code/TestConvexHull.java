import java.util.ArrayList;
import java.util.List;

/**
 * Created by smurthi on 4/30/16.
 */
public class TestConvexHull {



    public static void main(String args[])
    {
        List<Point> input = new ArrayList<>();
        ConvexHull convexHull = new ConvexHull();
        input.add(new Point(4,4));
        input.add(new Point(0,3));
        input.add(new Point(1,3));
        input.add(new Point(2,3));
        //input.add(new Point(1,1));
        input.add(new Point(3,0));
       // input.add(new Point(2,1));
        input.add(new Point(3,5));
        List<Point> output= convexHull.solveConvexHull(input);

        for(Point p: output)
        {
            p.toString();
        }

    }

}
