package invoice;

public interface LineItem
{
 /* Gets the price of this line item. @return the price */
 double getPrice();

 /* Gets the description of this line item. @return the description  */
 String toString();
}
