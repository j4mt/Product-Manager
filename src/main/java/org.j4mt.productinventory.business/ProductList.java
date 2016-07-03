package org.j4mt.productinventory.business;

import org.apache.log4j.Logger;

import java.util.ArrayList;


/**
 * Created by j4mt on 03/07/16.
 */
public class ProductList implements ProductListActions{

    static Logger log = Logger.getLogger(Logger.class.getName());

    // Composite collection
    private ArrayList<Product> list;

    /**
     * Instantiates a new Product list.
     */
    public ProductList() {
        this.list = new ArrayList<Product>();
    }

    /**
     * Add product boolean.
     *
     * @param product the product
     * @return the boolean
     */
    public void addProduct(Product product) throws Exception {

        for (Product p : list) {
            if (p.getCode().equalsIgnoreCase(product.getCode())) {
                throw new Exception();
            }
        }
            list.add(product);
    }

    /**
     * Delete product boolean.
     *
     * @param code the code
     * @return the boolean
     */
    public boolean deleteProduct(String code){
        boolean contained = false;

        for (Product p : list) {
            if (p.getCode().equalsIgnoreCase(code)) {
                contained = true;
                list.remove(p);
                System.out.println("\n" + "Product : " + code + " , removed!");
                break;
            }
        }

        return contained;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return this.list.size();
    }

    public void listProducts(){
        for(Product p : list)
        {
            System.out.print( "\n" + p.toString() + "\n");
        }
    }

}
