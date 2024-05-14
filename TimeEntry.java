import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class TimeEntry {
    private final Employee employee;
    private final String date; // Format: YYYY-MM-DD
    private final double hoursWorked;

    public TimeEntry(Employee employee, String date, double hoursWorked) {
        this.employee = employee;
        this.date = date;
        this.hoursWorked = hoursWorked;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getDate() {
        return date;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}

// TimeReportingSystem class for managing employees and time entries.
class TimeReportingSystem {
    private final List<Employee> employees;
    private final List<TimeEntry> timeEntries;

    public TimeReportingSystem() {
        this.employees = new ArrayList<>();
        this.timeEntries = new ArrayList<>();
    }

    public void addEmployee(String name, String id, String department, String position, double payRate) {
        employees.add(new Employee(name, id, department, position, payRate));
    }

    public void logTime(String id, String date, double hoursWorked) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            timeEntries.add(new TimeEntry(employee, date, hoursWorked));
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    private Employee findEmployeeById(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public double getTotalHoursWorked(String id) {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee with ID " + id + " not found.");
            return 0.0;
        }

        double totalHours = 0.0;
        for (TimeEntry entry : timeEntries) {
            if (entry.getEmployee().getId().equals(id)) {
                totalHours += entry.getHoursWorked();
            }
        }

        return totalHours;
    }

    public double getTotalNetPay(String id) {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee with ID " + id + " not found.");
            return 0.0;
        }

        double totalHours = getTotalHoursWorked(id);
        return totalHours * employee.getPayRate();
    }

    public void saveEmployeeDetails(String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            for (Employee employee : employees) {
                fw.write("ID: " + employee.getId() + ", Name: " + employee.getName() +
                         ", Department: " + employee.getDepartment() + 
                         ", Position: " + employee.getPosition() +
                         ", Pay Rate: $" + employee.getPayRate() + "\n");
            }
            System.out.println("Employee details saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving employee details: " + e.getMessage());
        }
    }

    public void savePayrollDetails(String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            for (Employee employee : employees) {
                double totalNetPay = getTotalNetPay(employee.getId());
                fw.write("ID: " + employee.getId() +
                         ", Name: " + employee.getName() +
                         ", Total Net Pay: $" + totalNetPay + "\n");
            }
            System.out.println("Payroll details saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving payroll details: " + e.getMessage());
        }
    }

    public void listEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                               ", Department: " + employee.getDepartment() +
                               ", Position: " + employee.getPosition());
        }
    }
}


