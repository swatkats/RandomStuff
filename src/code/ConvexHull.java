import java.util.ArrayList;
import java.util.List;
/**
 * Created by smurthi on 4/30/16.
 */
public class ConvexHull {

    public List<Point> solveConvexHull (List<Point> input)
    {
        LineSegmentsIntersect orientationGetter = new LineSegmentsIntersect();
        List<Point> output = new ArrayList<>();

        Point leftmostPoint = findLeftmostPoint(input);
        //the first point is always the leftmost point
        output.add(leftmostPoint);

        Point outputPoint = output.get(output.size()-1);
        for (int j =0 ;j<input.size();j=(j+1)%input.size())
        {
            int i=0;
            Point current = input.get(j);
            if(outputPoint.equals(current))
            {
                continue;
            }
            do {
                Point nextPoint = input.get(i);
                if(outputPoint.equals(nextPoint) || current.equals(nextPoint))
                {
                    i++;
                    continue;
                }
                int value = orientationGetter.getOrientation(outputPoint, current, nextPoint);
                if (value < 0 || value == 0) {
                    break;

                }
                i++;
            }while (i<input.size());
            if(i >= input.size())
            {
                if(output.contains(current))
                {
                    break;
                }
                output.add(current);
                outputPoint = output.get(output.size()-1);
            }

        }

        return output;
    }

    public Point findLeftmostPoint(List<Point> input)
    {
        Point current = input.get(0);

        for(Point p: input) {
            if (current.getX() > p.getX()) {
                current = p;
            }
        }
        //input.remove(current);
        return current;
    }
}
