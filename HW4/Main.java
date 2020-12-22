public class Main {

    public static void main(String[] args) {
        //task 3
        System.out.println("TASK 4:\nFull name and position of employees:\n");
        Employee employee1 = new Employee("Ivanov Ivan Sergeevich", 45, "88005553535", 90000, "Main Financier");
        System.out.println("Full name is " + employee1.getFullName());
        System.out.println("Position is " + employee1.getPosition());

        System.out.println();

        Employee employee2 = new Employee("Ivanov Petr Ivanovich", 33, "89991234567", 45000, "Assistant");
        System.out.println("Full name is " + employee2.getFullName());
        System.out.println("Position is " + employee2.getPosition());

        System.out.println();
        System.out.println("Number of object in class Employee is " + Employee.peopleNum() + "\n");

        //task 5
        int size = 5;
        Employee[] employees = new Employee[size];

        employees[0] = new Employee("Bondar Ksenia Gennadievna", 21, "87779993355", 70000, "Programmer");
        employees[1] = new Employee("Aprelskiy Igor Vladimirovich", 34, "89379993557", 65000, "Financier");
        employees[2] = new Employee("Babanov Gleb Elizarovich", 48, "89999999999", 17000, "Cleaner");
        employees[3] = new Employee("Golubcova Sofia Andreevna", 43, "89879993124", 58000, "Manager");
        employees[4] = new Employee("Petrova Alisa Alexandrovna", 28, "89876543210", 70000, "Translator");

        System.out.println("TASK 5:\nEmployees who older 40:");
        for(int i = 0; i < employees.length; ++i){
            if(employees[i].getAge() > 40) {
                System.out.println("Full name is " + employees[i].getFullName());
                System.out.println("Age is " + employees[i].getAge());
                System.out.println("Phone number is " + employees[i].getPhoneNumber());
                System.out.println("Salary is " + employees[i].getSalary());
                System.out.println("Position is " + employees[i].getPosition());
                System.out.println("Unique index is " + employees[i].getPersonId());
                System.out.println();
                //employees[i].printObject();
            }
        }

        //выведет 7. 5 из-за массива + 2 созданы ранее
        System.out.println("Number of object in class Employee is " + Employee.peopleNum() + "\n");

        //task 6*
        System.out.println("TASK 6:\nChange salary of people who older 35:\n");
        System.out.println("BEFORE:");
        for(int i = 0; i < employees.length; ++i){
            if(employees[i].getAge() > 35){
                System.out.println("Full name is " + employees[i].getFullName());
                System.out.println("Age is " + employees[i].getAge());
                System.out.println("Salary is " + employees[i].getSalary());
                System.out.println();
            }
        }

        for(int i = 0; i < employees.length; ++i){
            if(employees[i].getAge() > 35)
                employees[i].changeSalary();
        }
        System.out.println("AFTER:");
        for(int i = 0; i < employees.length; ++i){
            if(employees[i].getAge() > 35){
                System.out.println("Full name is " + employees[i].getFullName());
                System.out.println("Age is " + employees[i].getAge());
                System.out.println("Salary is " + employees[i].getSalary());
                System.out.println();
            }
        }

    }
}
