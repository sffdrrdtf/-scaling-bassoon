package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food
{
   private String colour;

   public Apple()
    {

    }

      public Apple(int amountProduct, double priceProduct, String colourFruit)
    {
        isVegetarian = true;
        amount = amountProduct;
        price = priceProduct;
        colour = colourFruit;
    }

    @Override
    public double getDiscount()
    {
       double discount = 0;
        var isAppleRed = colour.equals(Colour.RED);
        if (isAppleRed)
        {
            discount = Discount.RED_APPLE_DISCOUNT;
        }
        return discount;
    }
}
