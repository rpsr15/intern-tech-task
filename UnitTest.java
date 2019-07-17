import  junit.framework.TestCase;
/**
* Test cases for the addition and removal of product from the shopping cart
* @author  Ravi Rathore
*/
public class UnitTest extends TestCase
{
    public static void main(String[] args) {
        UnitTest unitTest = new UnitTest();
       
            unitTest.testAddProduct();
            unitTest.testRemoveProduct();
       
       
    }
    //test addition of product to the cart
    public void testAddProduct()
    {
        ShoppingCart cart = new ShoppingCart("cart1", "user1");
        cart.addProduct("p1", "product 1");
        assertTrue(cart.getProducts().size() == 1);

        cart.addProduct("p2", "product 2");
        assertTrue(cart.getProducts().size() == 2);
        
    }
    //test removal of products from the cart
    public void testRemoveProduct()
    {
        ShoppingCart cart = new ShoppingCart("cart2", "user2");
        cart.addProduct("p1", "product 1");
        cart.addProduct("p2", "product 2");
        //invalid product id
        cart.removeProduct("product99");
        assertTrue(cart.getProducts().size() == 2);
        // remove valid product
        cart.removeProduct("p1");
        assertTrue(cart.getProducts().size() == 1);
    }


}