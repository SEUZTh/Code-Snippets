
/*
 * @Auther: zth
 * @Date: 2024-02-23 14:22:18
 * @LastEditTime: 2024-02-23 14:24:25
 * @Description: Map 四种遍历方式
 */
import java.util.*;

public class MapTraverse {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        // 第一种
        System.out.println("通过 Map.keySet 遍历 key 和 value: ");
        for (String key : map.keySet()) {
            System.out.println("key = " + key + " and value = " + map.get(key));
        }

        // 第二种
        System.out.println("通过 Map.entrySet 使用 iterator 遍历 key 和 value: ");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        // 第三种：推荐
        System.out.println("通过 Map.entrySet 遍历 key 和 value: ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        // 第四种
        System.out.println("通过 Map.values() 遍历所有的 value, 但不能遍历 key: ");
        for (String v : map.values()) {
            System.out.println("value = " + v);
        }
    }
}
