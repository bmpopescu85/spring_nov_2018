package services;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

//    @Transactional(noRollbackFor = RuntimeException.class)
//    @Transactional(propagation = Propagation.REQUIRES_NEW,
//            isolation = Isolation.SERIALIZABLE)
    public void addTenProducts() {
        for (int i=0; i<10; i++) {
            Product p = new Product();
            p.setName("Product " + i);
            p.setPrice(10 * (i + 1));
            productRepository.addProduct(p);

            // test rollback when exception is caught by TransactionManager:
            // if (i == 5) throw new RuntimeException();
        }
    }
}
