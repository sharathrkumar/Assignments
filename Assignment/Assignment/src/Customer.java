import java.util.Date;
import java.util.HashMap;


class Customer {
    String name;
    String address;
    Customer(String name,String address)
    {
        this.name = name;
        this.address = address;
    }
}
class Item
{
    HashMap<String,Integer> items = new HashMap<>();
    String description;
    float shippingWeight = 100F;
    int price; float tax; int stock;

    Item(String description)
    {
        this.description = description;
        items.put("pizza",10);
        items.put("burger",10);
        items.put("pasta",10);
        if(items.containsKey(description))
        {
            stock = items.get(description);
        }
    }

    int getPriceForQuantity()
    {
        price = 100;
        return price;
    }

    float getTax()
    {
        tax = 0.06F;
        return tax*getPriceForQuantity();
    }

}
class OrderDetail extends Item
{
    int quantity;
    OrderDetail(int quantity,String description)
    {
        super(description);
        this.quantity =quantity;
    }
    float calcSubTotal()
    {
        return quantity * getPriceForQuantity() + (quantity*getTax());
    }
    float calWeight()
    {
        return shippingWeight*quantity;
    }
    float calcTax()
    {
        return quantity*getTax();
    }
    boolean inStock()
    {
        return stock >= quantity;
    }
}

class Order extends OrderDetail{
    Date date;
    String status;
    Order(Date date,int quantity,String description)
    {
        super(quantity,description);
        this.date = date;
    }
    float calcTotal()
    {
        if(inStock()) //if item in stock the blocks will get executed.
        {
            status = "Total: "+quantity * getPriceForQuantity();
            items.replace(description, items.get(description) -quantity);
        }
        else{
            status = "Out of Stock";
        }
        return calcSubTotal();
    }
    void validate() throws NotInStockException {
        if(status.equalsIgnoreCase("Out of Stock"))
            throw new NotInStockException("Not in Stock");
    }
}
