package main.product;

/**
 * That class represents flut, or a box with single flut
 * <p>
 * The price can be read all sides of the box - because of that the getter is public
 * <p>
 * As flut price never changes because of that the field is declared as final
 * it is an immutable class and has no setter of the price
 */
public class Flut extends Product {

    private final int price;

    public Flut(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
