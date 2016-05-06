/**
 * Created by smurthi on 4/28/16.
 * Find the longest substring in a string which has
 * 1. Even number of digits
 * 2. Whose sum of LHS = sum of RHS
 */
public class LongestSubstringWithEqualSum {

   // String str = "52073";

    public void findLongestSubstringWithEqualSum(String str) {
        int[] arr = new int[str.length()];
        int i = 0;
        for (char c : str.toCharArray()) {
            arr[i++] = Character.getNumericValue(c);
        }
        Integer matrix[][] = new Integer[str.length()][str.length()];
        int start = 0;
        int end = 0;
        for (i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                int k=i+j;
                if (k < str.length() && (j - i + 1) % 2 == 0) {

                            matrix[i][k] = (arr[i] - arr[j] + ((i + 1 < str.length() && j - 1 >= 0 && matrix[i + 1][j - 1]!=null)? matrix[i + 1][j - 1]:0));
                        }


                        if (matrix[i][j] !=null && matrix[i][j]== 0)
                        {
                            if ((start - end + 1) < (j - i + 1)) {
                                start = i;
                                end = j;
                            }
                        }
                    }
                }


        System.out.println("start = " +start + " end = " +end);
    }

    public void findLongestSubstringWithEqualSum(int arr[])
    {
        int l = arr.length;
        int mat[][] = new int[l][l];
        int start=0, end=0;
        for(int k=1;k<l;k=k+2) {
            for (int i = 0; i < l; i++) {
                int j = i + k;
                if (j > i && ((j - i + 1) % 2 == 0) && j < l) {

                    mat[i][j] = arr[i] - arr[j] ;

                            if((i+1< l) && (j-1 >= 0))
                            {
                                mat[i][j] += mat[i + 1][j - 1];
                            }
                    if (mat[i][j] == 0) {
                        if ((end - start) < (j - i)) {
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }

        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.print("the string is starting " + start + " end index is " + end + "  :  ");
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]);
        }


    }

}
