package pl.sages.craft.cleancode.designpatterns.adapter;

import java.math.BigDecimal;

/**
 * @author krogulecp
 */
class Transaction implements EurekaPay {

    private final BigDecimal moneyAmount;
    private final String cardNumber;

    public Transaction(BigDecimal moneyAmount, String cardNumber) {
        this.moneyAmount = moneyAmount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void giveMeMoney(BigDecimal money, String cardNumber) {
        System.out.println("Giving money: " + money + " , card number: " + cardNumber);
    }
}
