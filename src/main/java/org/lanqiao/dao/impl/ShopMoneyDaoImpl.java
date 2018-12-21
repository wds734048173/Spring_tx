package org.lanqiao.dao.impl;

import org.lanqiao.dao.IShopMoneyDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 15:20
 * @Description:商家账户管理
 */
public class ShopMoneyDaoImpl implements IShopMoneyDao {
    JdbcTemplate jdbcTemplate;
    public Integer getShopMoney(int shopId) {
        return null;
    }

    public void addShopMoney(int shopId, int money) {
        String sql = "update tb_shop_money set money = money + ? where id = ?";
        jdbcTemplate.update(sql,money,shopId);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
