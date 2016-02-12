package Array;

/**
 * Created by surya on 2/11/2016.
 */
public class MaxValue {
    public static int maxValue(int a[]){
        int j, max = a[0] ;
        for(j=1;j<a.length;j++){
            if(a[j]>max){
                max = a[j];
            }
        }
        return max;
    }
}
