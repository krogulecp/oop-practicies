package pl.sages.craft.cleancode.testlsp;

/**
 * @author krogulecp
 */
class Employee {
    void takeSalary(){
        System.out.println("Employee takes salary");
    }
}

class Volonteer extends Employee{
    @Override
    void takeSalary() {
        //
    }
}

class ClientClass{

    public static void main(String[] args) {
        Employee e = new Volonteer();
        e.takeSalary();
    }
}
