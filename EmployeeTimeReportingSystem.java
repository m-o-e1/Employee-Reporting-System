import java.util.Scanner;

public class EmployeeTimeReportingSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TimeReportingSystem system = new TimeReportingSystem();

        boolean running = true;
        while (running) {
            System.out.println("\nEmployee Time Reporting System");
            System.out.println("1. Add Employee");
            System.out.println("2. Log Time");
            System.out.println("3. List Employees");
            System.out.println("4. Get Total Hours Worked");
            System.out.println("5. Get Total Net Pay");
            System.out.println("6. Save Employee Details");
            System.out.println("7. Save Payroll Details");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addEmployee(system);
                    break;
                case 2:
                    logTime(system);
                    break;
                case 3:
                    system.listEmployees();
                    break;
                case 4:
                    getTotalHoursWorked(system);
                    break;
                case 5:
                    getTotalNetPay(system);
                    
                    break;
                case 6:
                    system.saveEmployeeDetails("employee_details.txt");
                    break;
                case 7:
                    system.savePayrollDetails("payroll_details.txt");
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addEmployee(TimeReportingSystem system) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter 7-digit employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Enter pay rate: ");
        double payRate = Double.parseDouble(scanner.nextLine());

        system.addEmployee(name, id, department, position, payRate);
        System.out.println("Employee added.");
    }

    private static void logTime(TimeReportingSystem system) {
        System.out.print("Enter 7-digit employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(scanner.nextLine());

        system.logTime(id, date, hoursWorked);
        System.out.println("Time logged.");
    }

    private static void getTotalHoursWorked(TimeReportingSystem system) {
        System.out.print("Enter 7-digit employee ID: ");
        String id = scanner.nextLine();

        double totalHours = system.getTotalHoursWorked(id);
        System.out.println("Total hours worked: " + totalHours);
    }

    private static void getTotalNetPay(TimeReportingSystem system) {
        System.out.print("Enter 7-digit employee ID: ");
        String id = scanner.nextLine();

        double totalNetPay = system.getTotalNetPay(id);
        System.out.println("Total net pay: $" + totalNetPay);
    }
}
