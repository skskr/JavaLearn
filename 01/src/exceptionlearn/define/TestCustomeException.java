package exceptionlearn.define;

public class TestCustomeException {
    public static void main(String[] args){
        TestClass tc = new TestClass();
        try {
            tc.testException();
        } catch (CustomerException e) {
            e.printStackTrace();
            System.out.println("msgDes\t"+e.getMsgDes());
            System.out.println("retCd\t"+e.getRetCd());
        }
    }
}
