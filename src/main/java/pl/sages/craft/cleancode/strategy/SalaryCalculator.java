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

class Country implements TaxPolicy {
    private String name;
    private double tax;

    Country(String name, double tax) {
        this.name = name;
        this.tax = tax;
    }

    @Override
    public double getTax() {
        return tax;
    }
}

