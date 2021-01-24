package returnlearn01;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        co.useCat(new Cat());
        Cat c = new Cat();
        co.useCat(c);
        //类名作为形参

        Cat c2 = co.getCat();
        co.useCat(c2);
        //类名作为返回值
    }
}
