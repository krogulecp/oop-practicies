package pl.sages.craft.cleancode.strategy;

import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

    @Test
    void calculateSalary() {
        Country country = new Country("Polska", 0.19);
        SalaryCalculator calculator = new SalaryCalculator(country);
        Employee emp = new Employee();
        System.out.println(calculator.calculateSalary(emp));
    }
}