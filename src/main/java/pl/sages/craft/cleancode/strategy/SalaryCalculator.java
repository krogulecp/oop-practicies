package pl.sages.craft.cleancode.strategy;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author krogulecp
 */
class SalaryCalculator {

    public SalaryCalculator() {
    }

    public BigDecimal calculateSalary(Employee emp, String countryName){
        BigDecimal salaryWithoutTax = emp.getWorkingDays().multiply(emp.getDailyRate());

        if (countryName.equals("Germany")){
            return salaryWithoutTax.multiply(BigDecimal.valueOf((1 - 0.21)));
        } else if (countryName.equals("Poland")){
            return salaryWithoutTax.multiply(BigDecimal.valueOf((1 - 0.19)));
        } else {
            throw new RuntimeException();
        }
    }
}

class Employee{

    BigDecimal getWorkingDays() {
        return BigDecimal.valueOf(new Random(30).nextLong());
    }

    BigDecimal getDailyRate() {
        return BigDecimal.valueOf(new Random().nextLong());
    }
}

interface TaxPolicy{

    double getTax();
}

