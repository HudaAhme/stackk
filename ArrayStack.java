import java.util.Stack;

/**
 * Created by DELL on 31/01/2023.
 */
public class ArrayStack<E> implements stack<E> {
    public  static final int Capacity=1000;
    private E data [];
    private int t=-1;

    public ArrayStack(int capacity){
        data=(E[])new Object[capacity];
    }
    public ArrayStack(){
        this(Capacity);
    }
    public boolean isEmpty(){
        return t==-1;
    }
    public int size(){
        return t+1;
    }

    public E top(){
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public void push(E element) {

            if (size()==data.length)
                throw new IllegalStateException("Stack is Full");

            data[++t]=element;

    }


    public E pop (){
        if (isEmpty())return null;
        E deleted=data[t];
        data[t]=null;
        return deleted;
    }


}
