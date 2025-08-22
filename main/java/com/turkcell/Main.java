package com.turkcell; //Bu sınıfın com.turkcell paketinde olduğunu belirtiyoruz.

//Entity, repository ve service katmanlarından gerekli sınıfları import ediyoruz.
import com.turkcell.entity.Customer;
import com.turkcell.entity.OrderItem;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.OrderRepository;
import com.turkcell.repository.ProductRepository;
import com.turkcell.service.CustomerService;
import com.turkcell.service.OrderService;
import com.turkcell.service.ProductService;

//Java'nın koleksiyon sınıflarını import ediyoruz.
import java.util.ArrayList;
import java.util.List;

public class Main { //main sınıfını tanımlıyoruz.
    public static void main(String[] args) { //main methodunu tanımlıyoruz.
        //repository nesnelerini oluşturuyoruz.
        CustomerRepository customerRepository = new CustomerRepository();
        ProductRepository productRepository = new ProductRepository();

        //service nesnelerini oluşturuyoruz.
        CustomerService customerService = new CustomerService(customerRepository);
        ProductService productService = new ProductService(productRepository);

        // Dependency injection yapıyoruz.
        OrderService orderService = new OrderService(new OrderRepository(), productRepository, customerRepository);

        //Test verileri ekliyoruz.
        customerService.add(new Customer(1, "eliz", "elizkurtulus@mail", "111111111"));
        customerService.add(new Customer(2, "ferdanur", "ferdanur@mail", "111111111"));
        productService.addProduct(new Product(1, "laptop", 9999.99, 10));
        productService.addProduct(new Product(2, "klavye", 99.99, 15));

        //Eklenen müşteri ve ürünleri listeliyoruz.
        customerService.getCustomers();
        productService.getProducts();

        //İlk sipariş için OrderItem'ları oluşturuyoruz.
        List<OrderItem> orderItems = new ArrayList<>();
        OrderItem orderItem2 = new OrderItem(1, 3, 9999.99);
        OrderItem orderItem3 = new OrderItem(2, 3, 99.99);
        orderItems.add(orderItem2);
        orderItems.add(orderItem3);

        //İkinci sipariş için OrderItem oluşturuyoruz.
        List<OrderItem> orderItems1 = new ArrayList<>();
        OrderItem orderItem4 = new OrderItem(1, 11, 9999.99);
        orderItems1.add(orderItem4);

        //İki siparişi oluşturuyoruz.
        orderService.createOrder(1,1, orderItems);
        orderService.createOrder(1,2, orderItems1);
    }
}