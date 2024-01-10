import java.util.*;

class LinearQueue{
    int queue[], front, rear, size = 10;

    public LinearQueue(){
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    Scanner s = new Scanner(System.in);

    boolean isFull(){
        return (front>rear || rear == size-1);
    }

    boolean isEmpty(){
        return (rear == -1 || front == rear);
    }

    public void enqueue(){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        } else {
            if(front == -1){
                front++;
            }
            rear++;
            System.out.print("Enter the Element to inserted: ");
            int e = s.nextInt();
            queue[rear] = e;
            System.out.println("Element Inserted");
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        } else {
            int x = queue[front];
            front++;
            System.out.println("Dequeued element : "+x);
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        } else {
            System.out.print("Elements in the queue are: ");
            for(int i=front; i<=rear; i++){
                System.out.print(" "+queue[i]);
            }
            System.out.println();
        }
    }
}

class Queue {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        LinearQueue q = new LinearQueue();
        while(true){
            System.out.println("Enter 1->Enqueue 2->Dequeue 3->display 4->exit");
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid Choice..");
                    break;
            }
        }
    }
}
