import java.util.*;

class LinearSearch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            System.out.print("Element "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the searching element: ");
        int e = s.nextInt();
        for(int i=0; i<size;i++){
            if(arr[i] == e){
                flag = 1;
                System.out.println("The element found at the position : "+(i+1));
                break;
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }
        s.close();
    }   
}
