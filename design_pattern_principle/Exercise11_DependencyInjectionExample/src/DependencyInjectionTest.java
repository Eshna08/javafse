public class DependencyInjectionTest {

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        System.out.println("Customer 1: " + customerService.getCustomerById(1));
        System.out.println("Customer 2: " + customerService.getCustomerById(2));
        System.out.println("Customer 3: " + customerService.getCustomerById(3));
    }
}
