import java.util.Scanner;

/**
 * Created by namercx on 2016/10/28.
 */
public class Triangle extends Shape {
    public void size(){
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入三角形的底");
        //三角形的底
        float length = Float.parseFloat(cin.nextLine());
        System.out.println("请输入三角形的高");
        //三角形的高
        float hight = Float.parseFloat(cin.nextLine());
        System.out.println("三角形的面积是：" + (2 * hight * length / 2));
    }
}
