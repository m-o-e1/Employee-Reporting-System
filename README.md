
For this project my group(Team Coders) will implement a simplified version of an employee time reporting system.
The EmployeeTimeReportingManager should allow the user to view the all employees in the system, add new employees to the dashboard,
view the information of a particular employee, search the list of employees, etc. For this project "Team Coders" will define all the classes needed. 
We must work to develop a proposal report for the project and finally, a final project report by the end of the semester. 
The main projects document identifies what each of the documents must contain.

The "Employee - Reporting - System" will be applying concepts covered in COSC 112 and COSC 113 courses. The requirements of the code and the concepts are mentioned below.
	•	Must implement a class-based object.
	•	Must implement concepts covered by object-oriented paradigms like inheritance and polymorphism.
	•	Must implement an abstract data type like a linked list, heap, and/or stack.
	•	May use JFrame, but at least use Joptionpane in the implementation of the program's interface.
	•	Must document the code.

 The class should have the following constructors:
	•	A default constructor that assigns the term “NA” to all string variable and 0 to the numerical variables.
	•	A constructor that accepts values as arguments and assigns them to the appropriate member variables.
Write the appropriate mutator functions (setters) that store values in these member variables and accessor functions (getters) 
that return the values of the private member variables.

Include the additional member methods listed below:
validate: this method does not take any parameters. This method ensures that the values for rate, hr, and eid are positive values. 
Additionally, it should ensure that the department name is not more than 4 characters long. 
Should an error occur for any of the values for the EmployeeType object display the appropriate message to the console and assign the appropriate 
null terms used for the default constructor. (Note: this method is a private method)

calculatePay: this member function does not take any parameters. It should calculates the total pay for an employee and returns the value back to the calling function.

print: this method does not take any parameters.
This method should print the contents of the file (buffer as described above) to the GUI (JFrame or JOptionPane) in the form shown below.
Employee id: 123456 Name: Janeway, Katherine Department code: BIOINFO == 40 hrs @ $32.50/HR.



