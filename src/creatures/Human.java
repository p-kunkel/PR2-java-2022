package creatures;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import devices.Car;
import devices.Phone;
public class Human extends Animal{
    final int yearOfBirth;
    private List<String> salaryViewingHistory;

    private Car car;
    private Double salary;
    private Double cash;

    public String firstName;
    public String lastName;
    

    public Animal pet;
    public Phone phone;
    
    

    public Human(Integer yearOfBirth) {
        super("homo sapiens");
        this.yearOfBirth = yearOfBirth;
        this.salary = 0.0;
        this.cash = 0.0;
        this.salaryViewingHistory = new ArrayList<String>();
    }

    public Double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        this.salaryViewingHistory.add(String.format("%s - %.2f", dtf.format(LocalDateTime.now()), salary)); 

        System.out.println("\nSalary viewing history:");
        for (Iterator<String> iter = salaryViewingHistory.iterator(); iter.hasNext(); ) {
            String element = iter.next();
            System.out.println(element);
        }
        System.out.println();

        return this.salary;
    }

    public void setSalary(Double salary) {
        System.out.println();

        if (salary < 0) {
            System.out.println("You cannot set salary below zero!");
            return;
        }

        System.out.println("New data has been sent to the accounting system.");
        System.out.println("You have to go to HR for an addendum to the your contract.");
        System.out.println("Social Insurance Institution and tax office know about this change, so hiding it doesn't make sense.");
        System.out.printf("Now your salary is %.2f.\n", salary);
        System.out.println();
        this.salary = salary;
    }

    public Car getCar() {
        return this.car;
    }

    public Boolean giveCar(Human recipient) {
        if (this.car == null) {
            System.out.printf("%s do not have a car.\n", this.firstName);
            return false;
        }

        recipient.car = this.car;
        this.car = null;
        return true;
    }

    public Double getCash() {
        System.out.printf("%s has %s in cash.\n", this.firstName, this.cash);
        return this.cash;
    }

    public Boolean makeTransaction(Human recipient, Double amount) {
       if (this.cash < amount) {
            System.out.printf("%s doesn't have enough money!\n", this.firstName);
            return false;
       }

       this.cash -= amount;
       recipient.cash += amount;
        return true;
    }

    public void goToWork() {
        System.out.printf("%s goes to work and earns %s\n", this.firstName, this.salary);
        this.cash += this.salary;
    }

    public void setCar(Car car) {
        System.out.println();
        if (car.price <= this.salary || car.price <= this.cash) {
            System.out.println("The buyer bought the car with cash");
            this.car = car;

        } else if ((car.price/12) <= this.salary && car.IsNew()) {
            System.out.println("The buyer bought a car in installments");
            this.car = car;
        } else {
            System.out.println("The buyer doesn't have enough money!");
        }
        System.out.println();
    }

    public String toString() {
        return String.format("""
                First Name: %s
                Last Name: %s
                Year of birth: %s
                Salary: %.2f
                Weigth: %s
                """, this.firstName, this.lastName, this.yearOfBirth, this.salary, this.pet, this.car);
    }
}