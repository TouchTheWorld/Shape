/**
 * Created by namercx on 2016/10/28.
 */
public class Demo {
    public static void main(String[] args) {
        fun(new Triangle());
        fun(new Circular());
        fun(new Square());
    }
    public static void fun(Shape shape){
        shape.size();
    }
}
