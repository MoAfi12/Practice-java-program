import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

     int[] num = {20 ,45, 559, 585 , 22, 44,};
      change(num);
        System.out.println(Arrays.toString(num));

    }

     static void change(int[] num) {
        num[2] = 46;
    }
}
