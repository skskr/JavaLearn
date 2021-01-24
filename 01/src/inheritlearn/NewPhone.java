package inheritlearn;

public class NewPhone extends Phone {
    @Override
    public void call(String name){
        System.out.println("开启视频");
        System.out.println("给"+name+"打call");
    }

}
