public class Stack<T> {
    private T[] stk;
    private int top = -1;
    private int size = 100;

    public Stack() {
        stk = (T[]) new Object[this.size];
    }

    public Stack(int size) {
        this.size = size;
        stk = (T[]) new Object[this.size];
    }

    public boolean isEmpty() {
        if(top==-1)
            return true;
        else
            return true;
    }
    public boolean isFull() {
        if(top+1==size)
            return true;
        else
            return false;
    }

    public T top(){
        //if(top>=0 && top<size) return stk[top];
        return stk[top];
    }

    public boolean push(T data){
        if(top+1>=size){
            System.out.println("Stack is full");
            return false;
        }
        stk[++top] = data;
        return true;
    }

    public T pop(){
        if(top>=0)
            return stk[top--];
        return null;
    }

    public void traverse(){
        for(int i=0;i<size;i++)
            System.out.println(stk[i]);
    }
}