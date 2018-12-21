package org.lanqiao.dao.impl;

import org.lanqiao.dao.ICustomerMoneyDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 15:19
 * @Description:客户账户管理
 */
public class CustomerMoneyDaoImpl implements ICustomerMoneyDao {

     JdbcTemplate jdbcTemplate;
    public Integer getCustomerMoney(int customerId) {
        return null;
    }

    public void payCustomer(int customerId, int money) {
        String sql = "update tb_customer_money set money = money - ? where id = ?";
        jdbcTemplate.update(sql,money,customerId);
    }

    public void saveCustomer(int customer, int money) {

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
