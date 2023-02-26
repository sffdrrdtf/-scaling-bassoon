package model;

public class Meat extends Food
{


    public Meat(int amountInKilograms, double pricePerUnit)
    {
        isVegetarian = false;
        amount = amountInKilograms;
        price = pricePerUnit;
    }
}
