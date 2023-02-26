import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple red = new Apple(10, 50, "red");
        Apple green = new Apple(8, 60, "green");
         Food[] food = {meat, red, green};
        ShoppingCart shoppingCart = new ShoppingCart(food);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getCartPrice());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getCartPriceWithDiscount());
        System.out.println("сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getCartPriceOnlyVegetarian());
    }
}
