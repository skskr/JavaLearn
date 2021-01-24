package exceptionlearn.define;

public class TestClass {
    public void testException() throws CustomerException{
        try {
            int a = 0;
        } finally {
            throw new CustomerException("320", "消息的描述");
        }
    }
}
