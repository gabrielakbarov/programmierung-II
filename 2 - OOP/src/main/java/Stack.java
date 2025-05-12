import java.util.Arrays;

public class Stack {
    int stack[];
    int index = 0;

    public Stack(){
        stack = new int[10];
    }

    public void push(int value){
        if(index == stack.length){
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        stack[index] = value;
        index++;
    }

    public int pop(){
        if(index == 0){
            throw new IllegalStateException("Stack is empty.");
        }
        return stack[--index];
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public int size(){
        return index;
    }
}
