package pl.sages.craft.cleancode.designpatterns.adapter;

import java.math.BigDecimal;

/**
 * @author krogulecp
 */
interface EurekaPay {
    void giveMeMoney(BigDecimal money, String cardNumber);
}
