package pl.sages.craft.cleancode.classes.ex2;

import java.math.BigDecimal;

/**
 * @author krogulecp
 */
public class User {
    private Account account;

    private double discountedPlanPrice(String code){
        Coupon coupon = new Coupon();
        return coupon.discount(account.getPlan().getPrice());
    }
}


class Account {
    private Plan plan;

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}

class Coupon {
    double discount(BigDecimal price){
        return 0;
    }
}

class Plan {
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

