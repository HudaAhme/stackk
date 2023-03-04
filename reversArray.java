/**
 * Created by DELL on 31/01/2023.
 */
import java.util.Arrays;
public class reversArray {

    public static <E>void reverse(E []a)
    {
        ArrayStack<E>buffer=new ArrayStack<>(a.length);
        for (int i = 0; i <a.length ; i++) {
            buffer.push(a[i]);
        }
        for (int j= 0; j < a.length ; j++) {
            a[j]=buffer.pop();
        }

    }

    public static void main(String[] args) {
        Double[]a={1.0,2.9,3.6,4.7};
        System.out.println("a=" +Arrays.toString(a));
        System.out.println("reversing");
        reverse(a);

        System.out.println("a="+Arrays.toString(a));
    }

}
