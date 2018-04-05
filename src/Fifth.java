import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by Brioal on 2018/4/5.
 */

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            // 分割字符串
            String[] strs = str.split("\\s");
            List<String> list = Arrays.asList(strs);
            for (int i = list.size()-1; i >=0; i--) {
                System.out.print(list.get(i));
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
