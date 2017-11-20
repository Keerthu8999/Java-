import java.io.*;
import java.util.*;
public class GroceryDetails implements Payable
{
String itemname;
int itemcode;
int quantity;
double price;
GroceryDetails(String itemname,int itemcode,int quantity,double price)
{
setName(itemname);
setCode(itemcode);
setQuantity(quantity);
setPrice(price);
}
public void setName(String itemname)
{
this.itemname=itemname;
}
public String getName()
{
return itemname;
}

public void setCode(int itemcode)
{
this.itemcode=itemcode;
}
public int getCode()
{
return itemcode;
}

public void setQuantity(int quantity)
{
if(quantity>0)
this.quantity=quantity;
}
public int getQuantity()
{
return quantity;
}

public void setPrice(double Price)
{
if(price>0.0)
this.price=price;
}
public double getPrice()
{
return price;
}
@Override
public double payment()
{
return getQuantity()*getPrice();
}
@Override
public String toString()
{
return String.format("%s-->%s-->%s-->%s-->%s",getName(),getCode(),getQuantity(),getPrice());
}
}
