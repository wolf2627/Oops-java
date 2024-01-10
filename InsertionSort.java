import java.util.Scanner;

class sortoperation{
    public void sort(int[] a){
        int s = a.length;
        for(int i=0; i<s;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]> key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        System.out.print("The sorted array: ");
        for(int i=0; i<s;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

public class InsertionSort {
     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        sortoperation sop = new sortoperation();
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements of the array (sorted)");
        for(int i=0; i<size; i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
        sop.sort(arr);
    }
}
