package pl.sages.craft.cleancode.strategy;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author krogulecp
 */
class SalaryCalculatorGermany implements TaxPolicy {

    public SalaryCalculatorGermany() {
    }

   public BigDecimal calculateSalary(Employee emp, TaxPolicy tax){
        BigDecimal salaryWithoutTax = emp.getWorkingDays().multiply(emp.getDailyRate());
        return salaryWithoutTax.multiply(BigDecimal.valueOf((1 - tax.getTax())));
    }
}

class SalaryCalculatorPoland implements TaxPolicy {

    public SalaryCalculatorPoland() {
    }

    public BigDecimal calculateSalary(Employee emp, TaxPolicy tax){
        BigDecimal salaryWithoutTax = emp.getWorkingDays().multiply(emp.getDailyRate());
        return salaryWithoutTax.multiply(BigDecimal.valueOf((1 - tax.getTax())));
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

