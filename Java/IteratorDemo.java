/*
 * @Auther: zth
 * @Date: 2024-02-25 15:06:43
 * @LastEditTime: 2024-02-25 15:10:56
 * @Description: Iterator 迭代器的使用
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Hello");
        sites.add("World");
        sites.add("HAHAHAHA");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的第一个元素
        System.out.println(it.next());

        // 输出集合中的所有元素
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        // 删除集合中的元素
        it = sites.iterator(); // 重新获取迭代器
        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("World")) {
                it.remove();
            }
        }
        System.out.println(sites);
    }
}