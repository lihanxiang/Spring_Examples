package service;

import domain.Product;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductServiceImpl implements ProductService{
    private Map<Long, Product> productMap = new HashMap<>();
    private AtomicLong atomicLong = new AtomicLong();

    @Override
    public Product add(Product product){
        long id = atomicLong.incrementAndGet();
        product.setId(id);
        productMap.put(id, product);
        return product;
    }

    @Override
    public Product get(long id){
        return productMap.get(id);
    }
}