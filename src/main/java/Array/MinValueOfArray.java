package Array;

/**
 * Created by surya on 2/11/2016.
 */
public class MinValueOfArray {
    public static int minValue(int a[]){
        int j, min = a[0] ;
        for(j=1;j<a.length;j++){
            if(a[j]<min){
                min = a[j];
            }
        }
        return min;
    }
}
