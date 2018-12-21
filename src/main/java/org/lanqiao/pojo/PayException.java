package org.lanqiao.pojo;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 15:46
 * @Description:
 */
public class PayException extends RuntimeException {
    public PayException(){
        super();
    }

    public PayException(String message){
        super(message);
    }

}
