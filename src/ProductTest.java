import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
    void productDescription() {
        Product product=new Product("fouad",20,5);
        assertEquals(".20 cl 5%",product.productDescription());
    }

    @Test
    void productDescription_null() {
        Product product=new Product("fouad",20,null);
        assertEquals("20cl",product.productDescription());
    }

    @Test
    void productDescription_nullSize() {
        Product product=new Product("fouad",null,5);
        assertEquals("5%",product.productDescription());
    }

    @Test
    void productDescription_nullname() {
        Product product=new Product(null,20,5);
        assertEquals(".20 cl 5%",product.productDescription());
    }
}