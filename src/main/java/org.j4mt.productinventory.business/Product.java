package org.j4mt.productinventory.business;

/**
 * Created by j4mt on 03/07/2016.
 */
public class Product {

    private String code;
    private String description;
    private double price;

    /**
     * Instantiate new product
     * @param code
     * @param description
     * @param price
     */
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }


    /**
     * Getter for property 'price'.
     *
     * @return Value for property 'price'.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for property 'price'.
     *
     * @param price Value to set for property 'price'.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter for property 'code'.
     *
     * @return Value for property 'code'.
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter for property 'code'.
     *
     * @param code Value to set for property 'code'.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for property 'description'.
     *
     * @return Value for property 'description'.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for property 'description'.
     *
     * @param description Value to set for property 'description'.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** {@inheritDoc} */
    @Override
    public String toString(){
        return "" + "Code :\t\t\t\t\t" + this.code + "\n"
                  + "Description :\t\t\t" + this.description + "\n"
                  + "Price : \t\t\t\t" + this.price + "\n";
    }

    /**
     * Equals boolean.
     *
     * @param p the p
     * @return the boolean
     */
    public boolean equals(Product p)
    {
        boolean isEqual = false;

        if(this.getCode().equals(p.getCode())
                && this.getDescription().equals(p.getDescription())
                && this.getPrice() == p.getPrice())
        {
            isEqual = true;
        }

        return isEqual;
    }
}
