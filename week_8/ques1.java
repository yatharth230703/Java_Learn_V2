package week_8;
class thread_trial extends Thread {
    private int start ;
    private int end ;
    public thread_trial(int x ,int y){
    this.start = x;
    this.end = y;

    }

    
    public void run (){
        for(int i=start ; i<=end ;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i );
            System.out.println("Current state : " + Thread.currentThread().getState());
        }
    }

}
public class ques1 {
    public static void main(String[] args){
        thread_trial t = new thread_trial(10, 15);
        System.out.println("Thread state of t: " + t.getState());
        t.start();
        System.out.println("Main wala get state t  : " + t.getState() );
        thread_trial t2 = new thread_trial(41,50);
        System.out.println("thread state of t2 " + t2.getState());

        try{
            t.join();
            t2.start();
        }
        catch(InterruptedException e){
            System.out.println("Interrupt k baad state : " + t.getState() + " and the error : " + e );

        }
        System.out.println("t2 ka state : " + t2.getState());


    }

}
