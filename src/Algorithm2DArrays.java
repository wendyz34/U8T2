import java.util.*;
public class Algorithm2DArrays {
    /** Return true if target is found in the 2D array arr, false otherwise.
     *  For example, if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
     *  and target is 5, this method returns true. If target is 15, returns false
     *
     *  @param arr  2D array of ints
     *  @param target  target value to be searched for in arr
     *  @return  true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target)
    { /* implement this method! */
        for(int[]r:arr){
            for(int c:r){
                if(c==target){
                    return true;
                }
            }
        }
        return false;
    }
    /** Return the number of elements in arr that contain searchStr as a substring
     *  For example, if arr is:
     *                  {{"hi", "bye", "howl", "goo"},
     *                   {"time", "owl", "you", "good"},
     *                   {"map", "low", "bow", "mom"}};
     *  and searchStr is "ow", this method returns 4, because 4 strings in arr
     *  contain "ow" as a substring.
     *
     *  @param arr  2D array of Strings
     *  @param searchStr  value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    { /* implement this method! */
        int count=0;
        for(String[]r: arr){
            for(String c:r){
                if(c.indexOf(searchStr)!=-1){
                    count++;
                }
            }
        }
        return count;
    }
    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It then returns the number of changes that were made.
     *
     *  Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
     *  then this method modifies arr to be:
     *           {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
     *  and returns 8 (the number of even numbers replaced by 0)
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr)
    { /* implement this method! */
        int count =0;
        for(int r =0;r<arr.length;r++){
            for(int c =0;c<arr[0].length;c++){
                int num = arr[r][c];
                if(num%2==0){
                    arr[r][c]=0;
                    count++;
                }
            }
        }
        return count;
    }
    /** Return the sum of all elements of arr that are in the one particular row,
     *  specified by the row parameter
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row

     */
    public static int sumForRow(int[][] arr, int row)
    { /* implement this method! */
        int sum =0;
            for(int c=0;c<arr[0].length;c++){
                sum+=arr[row][c];
        }
        return sum;
    }
    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col)
    { /* implement this method! */
        int sum=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r][col];
        }
        return sum;
    }
    /** Creates a 2D array of ints of size n x m, where n is number of rows and
     *  m is number of columns; the elements in the 2D array should be numbered 0
     *  through n x m - 1, with the numbers filled top to bottom, left to right.
     *  The method prints the 2D array "grid" of numbers, and also returns
     *  the 2D array.
     *
     *  For example, for rows = 3 and cols = 4, this method should print
     *  (and return):
     *  0 1 2 3
     *  4 5 6 7
     *  8 9 10 11
     *
     *  Print each element with a single space in between.
     *
     *  @param rows  number of rows
     *  @param cols  number of columns
     *  @return  the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols)
    { /* implement this method! */
        int n =0;
        int[][] num = new int[rows][cols];
        for(int r=0;r<num.length;r++){
            for(int c =0;c<num[0].length;c++){
                num[r][c]=n;
                System.out.print(num[r][c]+ " ");
                n++;
            }
            System.out.println(" ");
        }
        return num;
    }
    /** Creates and returns a square 2D array of Strings of size n x n; the
     *  elements in the 2D array alternate between "X" and "O" (letter),
     *  starting with "X"
     *
     *  For example, if n = 5, this method should return the following 2D array
     *  (with 5 rows and 5 columns):
     *  X O X O X
     *  O X O X O
     *  X O X O X
     *  O X O X O
     *  X O X O X
     *
     *  For example, if n = 6, this method should return the following 2D array
     *  (with 6 rows and 6 columns):
     *  X O X O X O
     *  O X O X O X
     *  X O X O X O
     *  O X O X O X
     *  X O X O X O
     *  O X O X O X
     *
     *  @param n  number of rows and cols (creating square 2D array of size n x n)
     *  @return  a 2D array of Strings that alternate between "X" and "O"
     */
    public static String[][] gridOfXandO(int n)
    { /* implement this method! */
        String x ="X";
        String o = "O";
        String[][] arr= new String[n][n];
        for(int r =0;r<arr.length;r++){
            for(int c =0;c<arr[0].length;c++){
               if ((r+c)%2==0){
                   arr[r][c]=x;
               }else {
                   arr[r][c] = o;
               }

                }
        }
        return arr;
    }
    /** Searches through the 2D array wordChart and finds all strings with
     *  length len; these strings are added to an ArrayList and returned.
     *  If no strings have that length, return an empty ArrayList
     *
     *  @param wordChart  2D array of Strings
     *  @parram len  the length of strings to search for
     *  @return  an ArrayList containing all strings in wordChart with length len
     */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
    { /* implement this method! */
        ArrayList<String>arr= new ArrayList<String>();
        for(int i =0;i< wordChart.length;i++){
            for(int c=0;c< wordChart[0].length;c++){
                String s = wordChart[i][c];
                if(s.length()==len){
                    arr.add(s);
                }

            }
        }
        return arr;
    }
    /** calculates and returns the average class grade as a double for a
     *  all Students in the 2D array seatingChart
     *
     *  @param seatingChart  2D array of Student objects
     *  @return  the average grade of all Students in seatingChart, as a double
     */
    public static double classAverage(Student[][] seatingChart) { /* implement this method! */
        double sum = 0;
        int num = 0;
        for (int r = 0; r < seatingChart.length; r++) {
            for (int c = 0; c < seatingChart[0].length; c++) {
                sum += seatingChart[r][c].getGrade();
                num++;
            }
        }
        return sum / num;
    }
    /** Returns a new 2D array that contains all values in the 2D array arr
     *  in reverse, such that the last value in the last row becomes the first
     *  value in the first row, and so on.  This method does NOT modify arr, the
     *  original 2D array object.
     *
     *  Example: if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
     *  then this method returns the following 2D array:
     *                     {{12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}}
     *
     *  @param arr  2D array of ints
     */
    /*public static int[][] reverse(int[][] arr)
    {
       int n =1;
        for (int r = 0 ; r < arr.length; r++) {
            while()
        }
        return arr;

    }*/
    public static boolean consecutive(int[][] arr)
    { /* implement this method! */
        for(int r =0;r< arr.length;r++) {
            for (int c = 0; c < arr[0].length - 1; c++) {
                if (arr[r][c] == arr[r][c + 1]) {
                    return true;

                }
            }
        }
        for(int c =0;c< arr[0].length;c++) {
            for (int r = 0; r < arr.length - 1; r++) {
                if (arr[r][c] == arr[r + 1][c]) {
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean magicSquare(int[][] arr)
    { /* implement this method! */ }













}
