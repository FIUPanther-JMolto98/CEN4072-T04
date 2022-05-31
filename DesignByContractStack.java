import java.util.LinkedList;

public class DesignByContractStack<T> {
    LinkedList<T> stack;
    int maxSize;

    public DesignByContractStack(int maxSize){
        this.maxSize = maxSize;
    }

    public boolean isFull(){
        return (stack.size() == maxSize);
    }

    public boolean isEmpty(){
        return (stack.size() == 0);
    }

    public void push(T element){
        if (stack.size() < maxSize) stack.addLast(element);
    }

    public T pop(){
        if (stack.size() > 0) return stack.removeLast();
        return null;
    }
}