package com.turkcell.service; // Bu sınıfın service paketinde olduğunu belirtiyoruz.

// Gerekli sınıfları import ediyoruz.
import com.turkcell.entity.Customer;
import com.turkcell.repository.CustomerRepository;

public class CustomerService {
    CustomerRepository customerRepository; // CustomerRepository nesnesini tutan field - Dependency Injection için

    // Constructor - CustomerRepository'yi dependency injection ile alır
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository; // Gelen repository'yi field'a atar
    }

    public void add(Customer customer) {
        customerRepository.add(customer);
    } // Yeni müşteri ekleme methodu

    public void getCustomers() { //Tüm müşterileri listeleme methodu
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("                                Müşteriler Listeleniyor...");
        for(Customer customer : customerRepository.getAll()) {
            System.out.println("Müşteri Id: " + customer.getId() + " | Müşteri Adı: " + customer.getName()
            + " | Müşteri E-posta: " + customer.getEmail() + " | Müşteri Telefon: " + customer.getPhone());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println(" ");
    }

    public Customer findCustomer(int id) // Id'e göre müşteri bulma methodu
    {
        return customerRepository.findById(id); // Repository'den ID'e göre müşteri arar ve döner
    }
}
