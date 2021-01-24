package exceptionlearn.define;

public class CustomerException extends Exception{
    private String retCd;
    private String msgDes;

    public  CustomerException(){
        super();
    }

    public CustomerException(String message){
        super(message);
    }

    public CustomerException(String retCd, String msgDes){
        super();
        this.retCd = retCd;
        this.msgDes = msgDes;
    }

    public String getRetCd(){
        return this.retCd;
    }

    public String getMsgDes(){
        return this.msgDes;
    }
}
