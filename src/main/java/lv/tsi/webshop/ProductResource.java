package lv.tsi.webshop;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductResource {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/all")
    public @ResponseBody List<Product> getAllProducts(){
        return productRepository.findAll()
    }
}
