import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Map;
import java.util.regex.Pattern;


// Employee class representing an employee with name, ID, department, position, and pay rate.
class Employee {
    private final String name;
    private final String id; // 7-digit ID
    private final String department;
    private final String position;
    private final double payRate;

    public Employee(String name, String id, String department, String position, double payRate) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.position = position;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getPayRate() {
        return payRate;
    }
}
