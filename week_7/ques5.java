package week_7;
class printnum implements Runnable {
    private int start ;
    private int end ;
    public printnum(int start ,int end ){
        this.start = start;
        this.end = end;
    }
    public void run(){
        for(int i=start ; i<=end ; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
public class ques5 {
    public static void main(String[] args){
        Thread t1 = new Thread(new printnum(1,10), "Thread1");
        Thread t2 = new Thread(new printnum(11,20) , "Thread2");
        t1.start();
        // try {
        //     t1.join();  // Wait for t1 to complete
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        try{
            Thread.sleep(2000);

        }
        catch (InterruptedException e){
            System.err.println("Exception triggered : " + e);
        }
        t2.start();
    }


}
