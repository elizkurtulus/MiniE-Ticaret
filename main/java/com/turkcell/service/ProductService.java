package com.turkcell.service; // Bu sınıfın service paketinde olduğunu belirtiyoruz.

// Gerekli sınıfları import ediyoruz.
import com.turkcell.entity.Product;
import com.turkcell.repository.ProductRepository;


public class ProductService {
    ProductRepository productRepository; // ProductRepository nesnesini tutan field - Dependency Injection için


    public ProductService(ProductRepository productRepository) // Constructor - ProductRepository'yi dependency injection ile alıyoruz.
    {
        this.productRepository = productRepository; // Gelen repository'yi field'a atıyoruz.
    }

    // Yeni ürün ekleme metodu tanımlıyoruz.
    public void addProduct(Product product) {
        productRepository.add(product);
    }

    // Tüm ürünleri listeleme metodu tanımlıyoruz.
    public void getProducts() {
    System.out.println("----------------------------------------------------------------------------------------------------");
    System.out.println("                                Ürünler Listeleniyor...");
        for(Product product : productRepository.getAll()) {
            System.out.println("Ürün Id: " + product.getId() + " | Ürün Adı: " + product.getName()
                    + " | Ürün Fiyatı: " + product.getPrice() + " | Stok: " + product.getStock());
        }
    System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public int checkStock(int id) { //Id'e göre ürün stok kontrolü metodu tanımlıyoruz.
        Product product = productRepository.findById(id); // Ürünü Id'e göre buluyoruz.
        return product.getStock(); // Ürünün stok miktarını dönüyoruz.
    }
}
