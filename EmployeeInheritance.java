package exp5;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalaryegg() {
        System.out.println("Salary: " + salary);
    }

    public void print_Employee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalaryegg();
    }
}

class Officer extends Employee {
    String specialization;

    public Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public void print_Specialization() {
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public void print_Department() {
        System.out.println("Department: " + department);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Officer officer = new Officer("Smitha Jacob", 45, "93653442", "123 Main St", 60000, "Cybersecurity");
        Manager manager = new Manager("Ken Smith", 50, "73483735", "456 Oak Ave", 98700, "Information Technology");

        System.out.println("Officer Information:");
        officer.print_Employee();
        officer.print_Specialization();

        System.out.println();

        System.out.println("Manager Information:");
        manager.print_Employee();
        manager.print_Department();
    }
}
