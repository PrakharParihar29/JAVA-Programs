class Queue{
    int item;
    boolean busy = false;

    synchronized int get(){
        if(!busy)  //if false
            try{
                wait();
            }
            catch(InterruptedException ie){}
        System.out.println("Get: "+item);
        busy = false;
        notify();
        return item;
    }

    synchronized void put(int item){
        if(busy)  //if true
        try{
            wait();
        }
        catch(InterruptedException ie){}
        this.item =item;
        busy=true;
        System.out.println("Put: "+ item);
        notify();
    }
}

class Producer extends Thread{
    Queue q;

    Producer(Queue q){
        this.q = q;
    }

    public void run(){
        int i=0;
        while(true){
            q.put(i++);
        }
    }
}

class Consumer extends Thread{
    Queue q;

    Consumer(Queue q){
        this.q = q;
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}

class InterThreadCommunication {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        System.out.println("Press ctrl+c to stop");
        p.start();
        c.start();
    }
}