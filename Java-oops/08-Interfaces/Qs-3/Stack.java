import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Stack  implements I
{
    int size;
    int a[];
    int i=-1;
    Stack(int size)
    {
        this.size=size;
        a=new int[size];
    }
    public void push(int x)
    {
        if(i==size-1)
        {
            System.out.println("Stack is Full");
            return;
        }
        a[++i]=x;
        System.out.println(x+" is inserted");
    }
    public void pop()
    {
        if(i==-1)
        {
            System.out.println("Stack is Empty..Cannot pop");
            return;
        }
        System.out.println(a[i]+" is popped");
        i--;
    }
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        int n=Integer.parseInt(br.readLine());
        Stack s=new Stack(n);
        while(true)
        {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter any other number to exit");
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                System.out.println("Enter number to be inserted");
                int num=Integer.parseInt(br.readLine());
                s.push(num);
                break;
                case 2:
                s.pop();
                break;
                case 3:
                System.out.println("Thanks for exiting");
                return;
            }
        }
    }
    
}