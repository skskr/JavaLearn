package returnlearn01;

public class CatOperator {
    public void useCat(Cat c){
        c.eat();
    }

    public Cat getCat(){
//        return new Cat();
        Cat c = new Cat();
        return c;
    }
}
