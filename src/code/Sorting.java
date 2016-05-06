import java.util.ArrayList;

/**
 * Created by smurthi on 1/4/16.
 */
public class Sorting
{
    public static void main(String args[])
    {
        System.out.print ("input array : ");


    }

    int[] mergesort(int[] arr,int l,int r)
    {
        if(l>r)
            return arr;

        int m = (l+r)/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,r);
        return merge(arr,l,m,r);
        /*if(arr.length>1)
        {
            int[] arr1 = new int[arr.length/2];
            int[] arr2 = new int[arr.length/2];

        }*/
    }

    private int[] merge(int[] arr, int l, int m, int r) {
        return null;


    }
}
