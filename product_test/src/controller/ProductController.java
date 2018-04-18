package controller;

import domain.Product;
import form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.ProductService;

@Controller
public class ProductController {
    private static final Log logger = LogFactory.getLog(ProductController.class);

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
    //采用POST的方式发送请求
    public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes){
        logger.info("saveProduct called");

        //获得用户输入
        Product product = new Product();
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        product.setInventory(productForm.getInventory());

        //添加有记录的产品，并且根据ID进行重定向
        Product savedProduct = productService.add(product);
        redirectAttributes.addFlashAttribute("message", "Add product Successfully");
        return "redirect:/product_view/" + savedProduct.getId();
    }

    //根据ID，将用户输入展示在ProductView中
    @RequestMapping(value = "product_view/{id}")
    public String viewProduct(@PathVariable Long id, Model model){
        //根据ID得到信息
        Product product = productService.get(id);
        model.addAttribute("product", product);
        return "ProductView";
    }
}
