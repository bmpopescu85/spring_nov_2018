package repositories;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addProduct(Product p) {
        String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
        jdbcTemplate.update(sql, p.getName(), p.getPrice()); // replacement for executeUpdate from jdbc
    }
}
