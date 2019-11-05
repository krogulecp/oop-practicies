package pl.sages.craft.cleancode.strategy;

import java.math.BigDecimal;
import java.util.Random;

class Employee{

    BigDecimal getWorkingDays() {
        return BigDecimal.valueOf(new Random(30).nextLong());
    }

    BigDecimal getDailyRate() {
        return BigDecimal.valueOf(new Random().nextLong());
    }
}
