import java.util.*;

class BinarySearch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements of the array (sorted)");
        for(int i=0; i<size; i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the Searching element: ");
        int key = s.nextInt();
        int left = 0; 
        int right = size-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                System.out.println("Element found at index: "+mid);
                flag = 1;
                break;
            } else if(key>arr[mid]){
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        if(flag == 0){
            System.out.println("ELement not found.");
        }
        s.close();

    }
}
