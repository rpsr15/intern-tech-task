import java.util.ArrayList;
/**
* This class represent a shopping cart. It has a cartId to indentify the cart, 
* userId to whom the cart belongs to, products to hold the items to be purchased.
* The customers can add and remove products before they purchase at checkout
* @author  Ravi Rathore
*/


public class ShoppingCart
{
    private String cartID;
    private ArrayList<Product> products;
    private String userID;

    public ShoppingCart(String cartID, String userID)
    {
        this.cartID = cartID;
        this.userID = userID;
        this.products = new ArrayList<Product>();
    }

    public String getCartID()
    {
        return cartID;
    }

    public String getUserID()
    {
        return userID;
    }
    //return list of products
    public ArrayList<Product> getProducts()
    {
        return products;
    }

    // check if product exists in the shopping cart
    // return -1 if not found; else index
    public int contains(String productID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID().equals(productID)) {
                return i;
            }
        }
        return -1;
    }
    // method to add a product to the product list
    public void addProduct(String productID, String description) {
        products.add(new Product(productID, description));
    }

    //remove the first product with given id if it is added to the cart
    public void removeProduct(String productID) {
        //check if product is in the cart
        int index = contains(productID);
        if(index >= 0)
        {
            products.remove(index);
        }

    }
}