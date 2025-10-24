package week_8;
class tread implements Runnable{
    private int x;
    private int y;
   
    //count 0 initialize krne se mere pe ab har object ki starting val for count is 0
    
    int count =0;

    public tread(int x , int y){
        this.x= x;
        this.y = y;

    }
    public void run(){
        for(int i=x;i<=y;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
    public synchronized void counter(){
        count++;
    }
    //this synchronized thing is in case multiple threads access the same value 
}

class sync extends Thread{
//    int x ;
    tread t;
    public  sync(tread t){
        this.t = t;
        
    }
    public void run() {
        System.out.println("Before counter invoked : " + t.count);
        t.counter();
        System.out.println("After counter invoked : " + t.count);

    }
}
public class ques2 {
    public static void main(String[] args){
        tread t = new tread(10,20);
        tread t1 = new tread(21,30);
        tread t2 = new tread(31,40);
        Thread th1 = new Thread(t,"thread1");
        Thread th2 = new Thread(t1,"thread2");
        Thread th3 = new Thread(t2, "thread3");
        th3.setPriority(3);
        th2.setPriority(6);
        th1.setPriority(9);
        //yaha pe isne merko join implement krne k liye bola tha dekhte h kya hotanahi krta tho
        th3.start();
        th2.start();
        th1.start();

        tread special = new tread(10,400);

        sync tk1  = new sync(special);
        sync tk2 = new sync(special);
        tk1.start();
        try{
            tk1.join();
        }
        catch(InterruptedException e){
            System.out.println("oops");
        }
        
        tk2.start();


    }
}
