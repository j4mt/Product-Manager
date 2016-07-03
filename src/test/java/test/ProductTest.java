package test;

import org.j4mt.productinventory.business.Product;
import org.j4mt.productinventory.business.ProductList;
import org.j4mt.productinventory.business.ProductListActions;

import static org.testng.Assert.assertEquals;

/**
 * Created by j4mt on 03/07/16.
 */
public class ProductTest {

    ProductListActions productListActions;
    /**
     * ProductTest 1 create new product.
     */
    @org.testng.annotations.Test
    public void test_1_CreateNewProduct(){

        Product p1 = new Product("12345678", "Glass Hammer", 50.99);
        Product p2 = new Product("12345679", "Steel Hammer", 5.99);

        assertEquals(p1.getPrice(), 50.99);
        assertEquals(p2.getPrice(), 5.99);
    }

    /**
     * ProductTest 2 product equals.
     */
    @org.testng.annotations.Test
    public void test_2_ProductEquals(){

        Product p1 = new Product("12345678", "Glass Hammer", 50.99);
        Product p2 = new Product("12345679", "Steel Hammer", 5.99);

        assertEquals(p1.equals(p2), false);

        p2 = new Product("12345678", "Glass Hammer", 50.99);

        assertEquals(p1.equals(p2), true);

    }

    /**
     * ProductTest 3 add new product to list.
     */
    @org.testng.annotations.Test
    public void test_3_AddNewProductToList(){

        Product p1 = new Product("12345678", "Glass Hammer", 50.99);
        Product p2 = new Product("12345679", "Steel Hammer", 5.99);

        ProductList productList = new ProductList();
        productListActions = productList;

        try {
            productListActions.addProduct(p1);
            productListActions.addProduct(p2);
        }
        catch(Exception e){
            System.out.println("Error occured adding products");
        }

        assertEquals(productListActions.getSize(), 2);
    }

    @org.testng.annotations.Test
    public void test_4_deleteProduct(){

        Product p1 = new Product("12345678", "Glass Hammer", 50.99);
        Product p2 = new Product("12345679", "Steel Hammer", 5.99);

        ProductList productList = new ProductList();
        productListActions = productList;

        try{
            productListActions.addProduct(p1);
            productListActions.addProduct(p2);
        }
        catch(Exception e){
            System.out.println("Error occured adding products");
        }

        productListActions.deleteProduct("12345678");

        assertEquals(productList.getSize(),1);
    }

    @org.testng.annotations.Test
    public void addExistingProduct(){

        boolean exceptionCaught = false;

        Product p1 = new Product("12345678", "Glass Hammer", 50.99);
        Product p2 = new Product("12345679", "Steel Hammer", 5.99);

        ProductList productList = new ProductList();
        productListActions = productList;

        try{
            productListActions.addProduct(p1);
            productListActions.addProduct(p2);
        }
        catch(Exception e){
            System.out.println("Error occured adding products");
        }

        try{
            productListActions.addProduct(p1);
            productListActions.addProduct(p2);
        }
        catch(Exception e){
            System.out.println("Expected exception Caught trying to add same product");
            exceptionCaught = true;
        }
        assertEquals(exceptionCaught,true);
    }
}
