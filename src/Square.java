import java.util.Scanner;

/**
 * Created by namercx on 2016/10/28.
 */
public class Square extends Shape {
    public void size(){
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入正方形的长");
        //正方形的长
        float hight = Float.parseFloat(cin.nextLine());
        System.out.println("请输入正方形的宽");
        //正方形的宽
        float length = Float.parseFloat(cin.nextLine());
        System.out.println("正方形的面积是：" + (hight * length));
    }
}
