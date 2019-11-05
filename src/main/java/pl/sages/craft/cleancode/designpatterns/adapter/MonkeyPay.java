package pl.sages.craft.cleancode.designpatterns.adapter;

import java.math.BigDecimal;

/**
 * @author krogulecp
 */
interface MonkeyPay {
    void giveMeMoreMoney(BigDecimal money, Long creditCard);
}
