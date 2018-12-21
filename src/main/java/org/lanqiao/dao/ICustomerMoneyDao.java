package org.lanqiao.dao;

public interface ICustomerMoneyDao {
    //获取客户账户金额
    public Integer getCustomerMoney(int customerId);
    //支付，修改客户金额
    public void payCustomer(int customerId,int money);
    //存钱，增加客户金额
    public void saveCustomer(int customer,int money);
}
