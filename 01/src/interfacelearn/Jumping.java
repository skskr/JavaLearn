package interfacelearn;

public interface Jumping {
    int height = 20;
    public abstract void jump();
}
//接口中成员变量默认被final和static修饰，不可修改，可以用类名访问
//接口中成员方法默认public和abstract
//接口里方法都是抽象的
//接口是为了抽象行为的，而类定义属性和行为，抽象行为
//接口可以多继承，多实现
