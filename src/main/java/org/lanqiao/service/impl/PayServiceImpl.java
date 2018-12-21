package org.lanqiao.service.impl;

import org.lanqiao.dao.ICustomerMoneyDao;
import org.lanqiao.dao.IShopMoneyDao;
import org.lanqiao.pojo.PayException;
import org.lanqiao.service.IPayService;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 15:21
 * @Description:支付管理（客户账户减钱，商家账户加钱）
 */
public class PayServiceImpl implements IPayService {
    ICustomerMoneyDao customerMoneyDao;
    IShopMoneyDao shopMoneyDao;
    public void pay(int customerId, int shopId, int money) {
        customerMoneyDao.payCustomer(customerId,money);
        if(1==1){
            throw new PayException("支付异常。。。");
        }
        shopMoneyDao.addShopMoney(shopId,money);
    }

    public void setShopMoneyDao(IShopMoneyDao shopMoneyDao) {
        this.shopMoneyDao = shopMoneyDao;
    }

    public void setCustomerMoneyDao(ICustomerMoneyDao customerMoneyDao) {
        this.customerMoneyDao = customerMoneyDao;
    }
}
