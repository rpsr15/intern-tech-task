/**
* Product has a product id and a description(name)
* @author  Ravi Rathore
*/
public class Product
{
    private String productID;
    private String name;


    public Product(String id, String name)
    {
        this.productID = id;
        this.name = name;
    }

    public String getID()
    {
        return productID;
    }
    public String getName()
    {
        return name;
    }
}