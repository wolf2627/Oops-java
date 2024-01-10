import java.util.*;

class stackOperation {
    int a[];
    int size, top;

    Scanner s = new Scanner(System.in);
    public stackOperation(int size){
        this.size= size;
        a = new int[size];
        top=-1;
    }

    public void push(){
        if(isFull()){
            System.out.println("Stack is full.Can't Insert New element");
        } else {
            int element;
            System.out.print("Enter the element to be inserted: ");
            element = s.nextInt();
            top++;
            a[top] = element;
            System.out.println("Element Inserted Successfully");
        }

    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        } else {
            int x = a[top];
            top--;
            System.out.println("ELement removed from the stack is : "+x);
        }
    }

    public void peak(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peak Element is : "+a[top]);
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Elements in the stack are ");
            for(int i=top;i>=0;i--){
                System.out.println(a[i]);
            }
        }
    }

    public boolean isFull(){
        return top==size-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
}

class Stack{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int ch;
        System.out.println("Enter the size of the stack: ");
        int size = s.nextInt();
        stackOperation st = new stackOperation(size);
        do{
            System.out.println("Choose operation to be performed: ");
            System.out.println("1.push 2.pop 3.display 4.find peak 5.exit");
            System.out.println("Your choice: ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    st.push();
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();;
                    break;
                case 4:
                    st.peak();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice..");
                    break;
            }
        }while(ch!=5);
        s.close();
    }
}