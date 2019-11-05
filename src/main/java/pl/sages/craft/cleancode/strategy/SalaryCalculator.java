package pl.sages.craft.cleancode.strategy;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author krogulecp
 */
class SalaryCalculator {
    private TaxPolicy taxPolicy;

    public SalaryCalculator(TaxPolicy taxPolicy) {
        this.taxPolicy = taxPolicy;
    }

    public BigDecimal calculateSalary(Employee emp){
        BigDecimal salaryWithoutTax = emp.getWorkingDays().multiply(emp.getDailyRate());
        return salaryWithoutTax.multiply(BigDecimal.valueOf((1 - taxPolicy.getTax())));
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

class TaxPolicyPoland implements TaxPolicy {
    private final double tax = 0.19;

    @Override
    public double getTax() {
        return tax;
    }
}

class TaxPolicyGermany implements TaxPolicy {
    private final double tax = 0.21;

    @Override
    public double getTax() {
        return tax;
    }
}