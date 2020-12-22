public class Employee {

    private String fullName;
    private int age;
    private String phoneNumber;
    private int salary;
    private String position;
    private int personId; //task 7**

    private static int humanIndex = 0;// task 7**

    //конструктор task 2
    Employee(String fullName, int age, String phoneNumber, int salary, String position){
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.position = position;
        this.personId = humanIndex++;
    }

    //getter-ы для task 3
    public String getFullName(){
        return fullName;
    }

    public int getAge(){
        return age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public int getSalary(){
        return salary;
    }

    public String getPosition(){
        return position;
    }

    public int getPersonId(){
        return personId;
    }

    public void changeSalary(){
        this.salary += 10000;
    }

    //метод для вывода информации о сотруднике для 5 задания.
    //Закомменчен, потому что не уверена, надо ли его делать, раз
    //уже есть getter-ы. С другой стороны, если в программе много раз
    //нужно будет выводить информацию об объекте, наличие такое функции
    //упростило бы читаемость кода.
//    public void printObject(){
//        System.out.println("Full name is " + fullName);
//        System.out.println("Age is " + age);
//        System.out.println("Phone number is " + phoneNumber);
//        System.out.println("Salary is " + salary);
//        System.out.println("Position is " + position);
//        System.out.println("Unique index is " + personId);
//        System.out.println();
//    }


    //получить информацию, сколько было создано объектов класса Employee
    public static int peopleNum(){
        return humanIndex;
    }
}
