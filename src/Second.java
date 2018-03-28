import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**50%通过率
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by Brioal on 2018/3/27.
 */

class Second {
    public static void main(String[] args) {
        // 获取个数
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Integer[] prices = new Integer[size];
        // 获取综合
        int sum = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            prices[i] = scanner.nextInt();
        }
        // 从小到大排序
        List<Integer> list = Arrays.asList(prices);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int result = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
            count++;
            if (result >= sum) {
                int temp = result;
                for (int j = 0; j < i; j++) {
                    temp = temp - list.get(j);
                    if (temp >= sum) {
                        count--;
                    }
                }
                break;
            }
        }
        System.out.println(count);
    }
}
