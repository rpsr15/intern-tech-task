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
    }

    public String getCartID()
    {
        return cartID;
    }

    public String getUserID()
    {
        return userID;
    }

    public ArrayList<Product> getProducts()
    {
        return products;
    }
}