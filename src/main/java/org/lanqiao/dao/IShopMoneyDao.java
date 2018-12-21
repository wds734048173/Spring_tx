package org.lanqiao.dao;

public interface IShopMoneyDao {
    //获取商家账户信息
    public Integer getShopMoney(int shopId);
    //收款，修改商家金额
    public void addShopMoney(int shopId,int money);
    //商家提现
}
