import java.util.*;

class sortoperation{
    public void sort(int[] a){
        for(int i=0; i<a.length-1;i++){
            int k = i;
            for(int j = i+1; j<a.length;j++ ){
                if(a[j]<a[k]){
                    k = j;
                }
            }
            int t = a[i];
            a[i] = a[k];
            a[k]= t;
        }
        System.out.print("The sorted array: ");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
} 


class SelectionSort {
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
