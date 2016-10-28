import java.util.Scanner;

/**
 * Created by namercx on 2016/10/28.
 */
public class Circular extends Shape {
    public void size(){
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        //圆的半径
        float r = Float.parseFloat(cin.nextLine());
        System.out.println("圆的面积是：" + (3.1415 * r * r));
    }
}
