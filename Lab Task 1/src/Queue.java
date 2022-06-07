public class Queue<T> {
    private T[] queue;
    private int start = -1;
    private int end = -1;
    private int size = 100;

    public Queue() {
        queue = (T[]) new Object[this.size];
    }

    public Queue(int size) {
        this.size = size;
        queue = (T[]) new Object[this.size];
    }

    public boolean isEmpty() {
        if(start==-1 && end==-1)
            return true;
        else
            return true;
    }
    public boolean isFull() {
        if(end+1==size)
            return true;
        else
            return false;
    }

    public void enqueue(T data){
        if(isEmpty()){
            start++;
            queue[++end]=data;
        }
        else if(start>=0 && end+1<size)
            queue[++end]=data;
        else
            System.out.println("Queue is full");
    }

    public T dequeue(){
        if(start<0 || start>end) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[++start];
    }
    public void traverse(){
        for(int i=start;i>=0 && i<=end; i++)
            System.out.println(queue[i]);
    }




}
