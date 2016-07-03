package org.j4mt.productinventory.business;

/**
 * Created by j4mt on 03/07/16.
 */
public interface ProductListActions {

    /**
     * Add product boolean.
     *
     * @param product the product
     * @return the boolean
     */

    public void addProduct(Product product) throws Exception;

    /**
     * Delete product boolean.
     *
     * @param code the code
     * @return the boolean
     */
    public boolean deleteProduct(String code);


    /**
     * List products.
     */
    public void listProducts();

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize();
}
