import java.util.*;

class RandomNum extends Thread{
    public void run(){
        Random r = new Random();
        r.setSeed(50);
        for(int i =0; i<15;i++){
            int randomnumber = r.nextInt(100);
            if(randomnumber % 2 == 0){
                squareThread sq = new squareThread(randomnumber);
                sq.start();
            } else {
                cubeThread c = new cubeThread(randomnumber);
                c.start();
            }
            
        }
        try {
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}


class squareThread extends Thread{
    private int number;
    squareThread(int num){
        this.number = num;
    }
    public void run(){
        System.out.println("The Square of the "+number+" is "+(number*number));
    }
}

class cubeThread extends Thread{
    private int number;
    cubeThread(int num){
        this.number = num;
    }
    public void run(){
        System.out.println("The cube of the "+number+" is "+(number*number*number));
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        RandomNum r = new RandomNum();
        r.start();
    }
}
