package Data_Strucures;

import OOPS.Interface;

class Stack{
    private int maxSize;
    private int top;
    private int[] stack;

    public Stack(int size){
        this.maxSize = size;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full");
        }
        top++;
        stack[top] = element;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
         return stack[top--];
    }

    public int peek(){
      if(isEmpty()){
          System.out.println("Stack is empty");
          return -1;
      }
      return stack[top];
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void iterate(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        for(int i=top;i>=0;i--){
            System.out.print(stack[i] + " ");
        }
    }

}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

       stack.iterate();
       System.out.println();
       System.out.println(stack.pop());
       stack.iterate();
       System.out.println();
       System.out.println(stack.peek());


    }
}
