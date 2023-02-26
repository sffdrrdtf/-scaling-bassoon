package service;

import model.Food;

public class ShoppingCart
{
    private final Food[] items;

   public ShoppingCart(Food[] _items)


    {
        items = _items;
    }
    public double getCartPrice()
    {
        double result = 0;
        for (Food item : items) {
            result += item.getTotalPrice();
        }
        return result;
    }
    public double getCartPriceWithDiscount()
    {
        double result = 0;
        for (Food item : items) {
            result += item.getTotalPriceWithDiscount();
        }
        return result;
    }
    public double getCartPriceOnlyVegetarian()
    {
        double result = 0;
        for (Food item : items) {
            var isVegetarian = item.getIsVegetarian();
            if (isVegetarian) {
                result += item.getTotalPrice();
            }
        }
        return result;
    }
}
