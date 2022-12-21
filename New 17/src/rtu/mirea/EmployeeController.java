package rtu.mirea;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }
    public void setName(String name) {
        model.setName(name);
    }

    public void setSalary(int salary) {
        model.setSalary(salary);
    }
}
