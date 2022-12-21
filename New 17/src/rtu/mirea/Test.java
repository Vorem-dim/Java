package rtu.mirea;

public class Test {
    public static void main (String[] args) {
        Employee employee = new Employee();
        employee.setName("Alena");
        employee.setSalary(10000);
        EmployeeController controller = new EmployeeController(employee, new EmployeeView());

        controller.updateView();
        controller.setName("Artem");
        controller.setSalary(90000);
        controller.updateView();
    }
}
