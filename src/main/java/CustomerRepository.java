import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private final List<Customer> customers;

    public CustomerRepository() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Cliente añadido");
    }

    public List<Customer> findAllCustomers() {
        System.out.println("Mostrando lista de clientes");
        return customers;
    }

    public Customer findCustomerById(Long id) {
        return customers.stream()
                .filter(customer -> id.equals(customer.getId()))
                .findAny().orElse(null);
    }

    public boolean existsById(Long id) {
        return customers.stream()
                .filter(customer -> id.equals(customer.getId()))
                .count() == 1;
    }

    public void updateCustomer(Long id, Customer newCustomer) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                customer.setNombre(newCustomer.getNombre());
                customer.setApellido(newCustomer.getApellido());
                customer.setEmail(newCustomer.getEmail());
                customer.setEdad(newCustomer.getEdad());

                break;
            }
        }
        System.out.println("Cliente actualizado correctamente");
    }

    public void removeCustomer(Long id) {
        System.out.println("Borrando cliente...");
        customers.remove(findCustomerById(id));
        System.out.println("Cliente borrado correctamente");
    }

    void createTestData() {
        Customer cus1 = new Customer("Pedro Jose", "Pereira","pedro@hotmail.com", 40);
        Customer cus2 = new Customer("Ana", "Bautista","ana@hotmail.com", 42);
        Customer cus3 = new Customer("Cintia", "López","cintia@hotmail.com",30);
        customers.addAll(List.of(cus1,cus2,cus3));
        System.out.println("Clientes creados");
    }
}