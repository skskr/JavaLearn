package genericslearn;

/**
 * 泛型类
 * @param <T>
 */
public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    /**
     * 泛型方法
     * @param t
     * @param <T>
     */
    public <T> void show(T t){
        System.out.println(t);
    }

}
