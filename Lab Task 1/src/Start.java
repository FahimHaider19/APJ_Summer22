import java.util.Scanner;
public class Start {
    public static void main(String[] args) {

        int size;
        System.out.println("Enter size");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();

        Stack<Integer> stk = new Stack<>(size);
        Queue<Integer> q = new Queue<>(size);

        System.out.println("Enter "+size+" elements for stack: ");
        for(int i=0; i<size;i++)
            stk.push(s.nextInt());

        System.out.println("Enter "+size+" elements for stack: ");
        for(int i=0; i<size;i++)
            q.enqueue(s.nextInt());

    }
}

