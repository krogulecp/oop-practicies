package pl.sages.craft.cleancode.strategy;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author krogulecp
 */
class SalaryCalculator {

    TaxPolicy taxPolicy;

    public SalaryCalculator(TaxPolicy taxPolicy) {
        if (taxPolicy==null) {
            throw new RuntimeException();
        }
        this.taxPolicy = taxPolicy;
    }

    public BigDecimal calculateSalary(Employee emp){
        BigDecimal salaryWithoutTax = emp.getWorkingDays().multiply(emp.getDailyRate());
        return salaryWithoutTax.multiply(BigDecimal.valueOf((1 - taxPolicy.getTax())));
    }
}



