/**
 * Created by DELL on 04/02/2023.
 */
public interface stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();

}
