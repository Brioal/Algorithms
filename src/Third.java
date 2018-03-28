import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 100% 通过
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by Brioal on 2018/3/28.
 */

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int count = scanner.nextInt();
            List<Integer> integers = new ArrayList<Integer>();
            int maxLength = 0;
            for (int i = 0; i < count; i++) {
                int input = scanner.nextInt();
                if ((input + "".length()) > maxLength) {
                    maxLength =( input + "").length();
                }
                integers.add(input);
            }
            Collections.sort(integers, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -Integer.valueOf(o1+""+o2)+Integer.valueOf(o2+""+o1);
                }
            });
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < integers.size(); i++) {
                buffer.append(integers.get(i));
            }
            System.out.println(buffer.toString());
        }


    }
}
