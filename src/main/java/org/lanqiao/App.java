package org.lanqiao;

import org.lanqiao.service.IPayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 15:18
 * @Description:
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IPayService payService = context.getBean("payService", IPayService.class);
        payService.pay(1,1,10);
    }
}
