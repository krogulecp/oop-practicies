package pl.sages.craft.cleancode.strategy;

import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

    @Test
    void calculateSalary() {
//        Country country = new Country("Polska", 0.19);
//        SalaryCalculator calculator = new SalaryCalculator(country);
        Employee emp = new Employee();

        TaxPolicyPoland tax1 = new TaxPolicyPoland();
        SalaryCalculator calculator = new SalaryCalculator(tax1);
        System.out.println(calculator.calculateSalary(emp));


        TaxPolicyGermany tax2 = new TaxPolicyGermany();
        calculator = new SalaryCalculator(tax2);
        System.out.println(calculator.calculateSalary(emp));
    }
}