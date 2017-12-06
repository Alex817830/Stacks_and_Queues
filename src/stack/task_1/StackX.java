package stack.task_1;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int maxSize){
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        stackArray[++top] = j;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){       //True, if stack empty
        return (top == -1);
    }
}
