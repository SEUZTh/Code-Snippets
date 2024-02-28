
/*
 * @Auther: zth
 * @Date: 2024-02-23 14:18:46
 * @LastEditTime: 2024-02-25 15:11:51
 * @Description: List 三种遍历方式
 */
import java.util.*;

public class ListTraverse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");

        // 第一种：For-Each 遍历 List
        for (String str : list) {
            System.out.println(str);
        }

        // 第二种：把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        // 第三种：迭代器进行相关遍历
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}