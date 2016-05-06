/**
 * Created by smurthi on 4/28/16.
 */
public class TestLongestSubstringWithEqualSum {

    public static void main(String args[])
    {
        LongestSubstringWithEqualSum longestSubstringWithEqualSum = new LongestSubstringWithEqualSum();
        int[] test = {5,3,0,8,2};
        longestSubstringWithEqualSum.findLongestSubstringWithEqualSum(test);
        int[]test1 = {6,6,8,0,5,3,2};
        longestSubstringWithEqualSum.findLongestSubstringWithEqualSum(test1);
        int[]test2 = {8,0,2,8,8,2,5,3,2};
        longestSubstringWithEqualSum.findLongestSubstringWithEqualSum(test2);
        int[]test3= {3,7,1,5,3,2};
        longestSubstringWithEqualSum.findLongestSubstringWithEqualSum(test3);
        int[]test4= {4,4,8,0,5,3,2};
        longestSubstringWithEqualSum.findLongestSubstringWithEqualSum(test4);
        int[]test5= {2,1,3,4,5,6,7,8,9};
        longestSubstringWithEqualSum.findLongestSubstringWithEqualSum(test5);
    }

}
