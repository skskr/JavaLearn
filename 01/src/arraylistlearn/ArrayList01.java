package arraylistlearn;

import java.util.ArrayList;

/**
 * @author wjl
 */
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> array= new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("sss");

        array.add(3, "three");
        array.add(1, "one");

        System.out.println(array);

        System.out.println(array.size());
        System.out.println(array.remove(0));
        //返回被删除的元素
        System.out.println(array);
        System.out.println(array.remove("world"));
        //返回删除是否成功
        System.out.println(array);
        System.out.println(array.get(0));
        //对下标操作都要注意越界
        System.out.println(array.set(0, "000"));
        System.out.println(array);
    }
}
