package Array;

/**
 * Created by surya on 2/11/2016.
 */
public class ArrayAdd {
    public static int arrayTotal(int a[]){
        int sum =0;
        int j;
        for(j=0;j<a.length;j++){
            sum = sum+a[j];
        }

        return sum;
        //System.out.println("Sum of all elements of array is: " + sum);
    }
}
