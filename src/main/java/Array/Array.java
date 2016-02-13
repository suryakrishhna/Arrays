package Array; /**
 * Created by surya on 2/11/2016.
 */
import java.net.SocketPermission;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        int num, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of elements in the array:");
        num = scan.nextInt();

        int arr[] = new int[num];
        for(i=0; i<num; i++){
            Scanner element = new Scanner(System.in);
            System.out.println("Enter the next element of the array:");
            arr[i] = element.nextInt();
        }

        System.out.print("Elements of array are:");
        for(i=0;i<num;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter operation: 1 Sum of Array ELements. 2 for Minimum Value of Array . 3 for Maximum value");
        int ch = scan.nextInt();
        if(ch ==1){
            System.out.println("Sum of Array Elements is: " + ArrayAdd.arrayTotal(arr));
        }
        else if(ch ==2){
            System.out.println("Minimum Value of the array is: " + MinValueOfArray.minValue(arr));
        }
        else if(ch ==3){
            System.out.println("Maximum Value of the array is: " + MaxValue.maxValue(arr));
        }
        else{
            System.out.println("Incorrect value. Try Again");
        }
    }

}
