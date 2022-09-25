public class Main {
    public static void main(String[] args) throws Exception {
        
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Yusufcan");
        customer.setLastName("Adıgüzel");
        customer.setAddress("İstanbul");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Adıgüzel");
        employee.setLastName("Yusufcan");   
        employee.setDepartment("Development");

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.register(customer);
        employeeManager.hire(employee);

    }
}
