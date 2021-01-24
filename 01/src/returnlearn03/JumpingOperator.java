package returnlearn03;

public class JumpingOperator {
    public void useJumpping(Jumping j){
        j.jump();
    }

    public Jumping getJumpping(){
        Jumping j = new Cat();
        return j;
    }
}
//方法的形参是接口名，其实需要的是该接口的实现类对象
//方法的返回值是接口名，其实返回的是该接口的实现类对象
