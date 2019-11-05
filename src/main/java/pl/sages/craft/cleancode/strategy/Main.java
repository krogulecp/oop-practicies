package pl.sages.craft.cleancode.strategy;

import java.util.function.Predicate;

/**
 * @author krogulecp
 */
class Main {

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator(() -> 0.19);
        salaryCalculator.calculateSalary(new Employee());

        doSth(s -> s.contains("a"));

    }

    static void doSth(Predicate<String> stringPredicate){
        boolean test = stringPredicate.test("quav");


    }
}
