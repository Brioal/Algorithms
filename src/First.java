/**
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by Brioal on 2018/3/26.
 */

import java.util.Scanner;

/**
 * 在情报传递过程中，为了防止情报被截获，往往需要对情报用一定的方式加密，简单的加密算法虽然不足以完全避免情报被破译，但仍然能防止情报被轻易的识别。我们给出一种最简的的加密方法，对给定的一个字符串，把其中从a-y,A-Y的字母用其后继字母替代，把z和Z用a和A替代，则可得到一个简单的加密字符串。
 * https://www.nowcoder.com/test/question/136de4a719954361a8e9e41c8c4ad855?pid=9439037&tid=14329169
 * 通过全部测试用例
 */
public class First {
    public static void main(String[] args) {
        // 读取字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要加密的字符串");
        String str = scanner.nextLine();
        // 加密
        char[] chs = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < chs.length; i++) {
            char ch = chs[i];
            if (ch >= 65 && ch <= 90) {
                // 大写字母
                if (ch == 90) {
                    ch = 65;
                } else {
                    ch = (char) (ch + 1);
                }
            } else if (ch >= 97 && ch <= 122) {
                // 小写字母
                if (ch == 122) {
                    ch = 97;
                } else {
                    ch = (char) (ch + 1);
                }
            }
            buffer.append(ch+"");
        }
        System.out.println(buffer.toString());

    }
}
