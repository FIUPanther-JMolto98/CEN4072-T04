import java.util.LinkedList;

class PopOnEmptyStackException 
  extends RuntimeException {
    public PopOnEmptyStackException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}

public class DefensiveProgrammingStack<T> {
    LinkedList<T> stack;
    int maxSize;

    public DefensiveProgrammingStack(int maxSize){
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
        try {
            return stack.removeLast();
        } catch (Exception e){
            throw new PopOnEmptyStackException("Attempted to pop from an empty stack.", e);
        }
    }
}