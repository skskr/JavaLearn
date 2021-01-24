package maplearn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("学生","天天");
        map.put("教师","向上");
        map.put("保安","学习");

        Collection<String> keys = map.keySet();
        Collection<String> values = map.values();

        System.out.println(keys);
        for (String key:keys
             ) {
            System.out.println(key);
        }
        for (String value:values
        ) {
            System.out.println(value);
        }

        Set<Map.Entry<String, String>> entry = map.entrySet();
        for (Map.Entry<String, String> entryset:entry){
            System.out.println(entryset.getKey()+", "+entryset.getValue());
        }


        System.out.println(values);

        map.remove("保安");
        System.out.println(map.containsValue("天天"));
        System.out.println(map.containsKey("保安"));
        System.out.println(map);
        System.out.println(map.get("教师"));


    }
}
