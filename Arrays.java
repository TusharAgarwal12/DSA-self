import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        // input using for loop
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //System.out.print(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        /*for(int num:arr){  // for every element in array , print the element
            System.out.print(num);  // here num represents element of an array
        }*/
    }
}