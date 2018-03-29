import java.util.Scanner;

/**
 * 100%
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by Brioal on 2018/3/29.
 */

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] height = new int[count];
        int[] avaliable = new int[count];
        int max = 0;
        for (int i = 0; i < count - 1; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            if (i == 0) {
                height[start] = 1;
            }
            avaliable[start]++;
            if (avaliable[start] < 3) {
                height[end] = height[start] + 1;
            }
            max = Math.max(max,height[end]);
        }
        System.out.println(max);
    }
}
