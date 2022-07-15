import java.util.*;
//important->name your file as Stack.java (not Stacks.java)
//Qs
//Create 2 stacks capable of hoding 10 integer values
//Write push pop functions
//After pushing,popping, display the contents

class Stacks {
    int i;
    int[] a = new int[10];

    Stacks() {
        i = -1;
    }

    void push(int x) {
        if (i != 9)//overflow
            a[++i] = x;
        for (int j = i ; j >= 0; j--)
            System.out.print(a[j]+" ");
        System.out.println();
    }

    void pop() {
        if (i == -1)//underflow
            return;
        i--;
        for (int j = i ; j >= 0; j--)
            System.out.println(a[j]+" ");
        if(i!=-1)//to avoid printing empty space when stack is empty
            System.out.println();    
    }
}

class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks s1 = new Stacks();//object created for stack 1
        Stacks s2 = new Stacks();//object created for stack 2
        while (true) {
            System.out.println("Enter 1 to push in stack");
            System.out.println("Enter 2 to pop from stack");
            System.out.println("Enter any other number to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter 1 to use stack 1");
                    System.out.println("Enter 2 to use stack 2");
                    int choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        System.out.println("Enter number to be pushed in stack 1");
                        int n=sc.nextInt();
                        System.out.println("Contents of stack 1 from top to bottom after inserting "+n+" is");
                        s1.push(n);
                    } else if (choice1 == 2) {
                        System.out.println("Enter number to be pushed in stack 2");
                        int n=sc.nextInt();
                        System.out.println("Contents of stack 2 from top to bottom after inserting "+n+" is");
                        s2.push(n);
                    } else {
                        System.out.println("Wrong choice");
                    }
                    break;
                case 2:
                    System.out.println("Enter 1 to use stack 1");
                    System.out.println("Enter 2 to use stack 2");
                    int choice2 = sc.nextInt();
                    if (choice2 == 1) {
                        System.out.println("Contents of stack 1 after pop top to bottom is is");
                        s1.pop();
                        if(s1.i==-1)
                        {
                            System.out.println("Stack 1 is empty");
                        }
                    } else if (choice2 == 2) {
                        System.out.println("Contents of stack 2 after pop from top to bottom is");
                        s2.pop();
                         if(s2.i==-1)
                        {
                            System.out.println("Stack 2 is empty");
                        }
                    } else {
                        System.out.println("Wrong choice");
                    }
                    break;
                default:
                    System.out.println("Exiting");
                    return;
            }
        }
        // sc.close();
    }
}
