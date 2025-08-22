package com.turkcell.service; // Bu sınıfın service paketinde olduğunu belirtiyoruz.

// Gerekli sınıfları import ediyoruz.
import com.turkcell.entity.Customer;
import com.turkcell.entity.Order;
import com.turkcell.entity.OrderItem;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.OrderRepository;
import com.turkcell.repository.ProductRepository;

// Java'nın koleksiyon sınıflarından gerekli olanları import ediyoruz.
import java.util.List;

public class OrderService { // Repository nesnelerini tutan field'lar - Dependency Injection için
    OrderRepository orderRepository; // Sipariş verilerinin yönetimi
    ProductRepository productRepository; // Ürün verilerinin yönetimi
    CustomerRepository customerRepository; // Müşteri verilerinin yönetimi

    // Constructor - Üç farklı repository'yi dependency injection ile alıyoruz.
    public OrderService(OrderRepository orderRepository, ProductRepository productRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository; // Order repository'sini field'a atıyoruz.
        this.productRepository = productRepository; // Product repository'sini field'a atıyoruz.
        this.customerRepository = customerRepository; // Customer repository'sini field'a atıyoruz.
    }

    // Sipariş oluşturma methodunu tanımlıyoruz.
    public void createOrder(int id, int customerId, List<OrderItem> orderItems) {
        double totalPrice = 0; // Toplam fiyatı hesaplamak için değişken tanımlıyoruz.

        // Müşteri bilgisini alıyoruz - Customer bilgisini repository'den çekiyoruz.
        Customer customer = customerRepository.findById(customerId); // Müşteriyi ID'ye göre buluyoruz.


        System.out.println(" ");
        for (OrderItem orderItem : orderItems) { // Her sipariş için işlem yapan döngü.
            Product product = productRepository.findById(orderItem.getProductId()); // Ürünü id'e göre buluyoruz.
            if (product.getStock() - orderItem.getQuantity() < 0) { // Stok kontrolü yapıyoruz. Stok - Sipariş sayısı işlemi ile.
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(customer.getName() + " isimli müşteri " + product.getName() + " (ID: " + product.getId() + ") ürününden " + orderItem.getQuantity() + " adet almak istedi. Yeterli stok bulunamadı! Stok: " + product.getStock());
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------------------------------------------");
                return; // Metodu sonlandırıyoruz.
            }
            product.setStock(product.getStock() - orderItem.getQuantity()); // Stok güncelleme yapıyoruz.
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println(" ");
            System.out.println(customer.getName() + " isimli müşteri tarafından " + product.getId() + " Id numaralı " + product.getName() + " ürününden " + orderItem.getQuantity() + " adet alındı. Kalan stok: " + product.getStock());
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------------------------------------------");

            //Siparişin toplam fiyatını hesaplıyoruz.
            double orderPrice = orderItem.getQuantity() * orderItem.getPrice();
            totalPrice += orderPrice;
        }
        System.out.println(" ");
        System.out.println("Satın alımlar için ödenen toplam miktar: " + totalPrice);
        System.out.println(" ");
        Order order = new Order(id, customerId, orderItems, totalPrice);
        orderRepository.add(order); // Repository'ye siparişi ekliyoruz.
    }
}
