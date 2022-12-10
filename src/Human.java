import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Human {
    final int yearOfBirth;

    private List<String> salaryViewingHistory;
    private Double salary;
    
    String firstName;
    String lastName;

    Animal pet;
    Car car;
    

    Human(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.salary = 0.0;
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
        System.out.printf("Now your salary is %s.\n", salary);
        System.out.println();
        this.salary = salary;
    }
}