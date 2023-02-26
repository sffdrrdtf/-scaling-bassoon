package model;

public abstract class Food implements Discountable, Priceable
{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getTotalPrice()


    {
        return price * amount;
    }

    @Override
    public double getTotalPriceWithDiscount()

    {
        return getTotalPrice() - getTotalPrice() * getDiscount() / 100;
    }

    public boolean getIsVegetarian()
    {

        return isVegetarian;
    }
}

